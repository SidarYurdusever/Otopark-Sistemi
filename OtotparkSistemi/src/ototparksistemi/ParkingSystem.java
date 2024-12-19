import java.util.ArrayList;

public class ParkingSystem {
    private ArrayList<ParkingSpot> spots;
    private double costPerMinute;

    public ParkingSystem(int totalSpots, double costPerMinute) {
        this.costPerMinute = costPerMinute;
        spots = new ArrayList<>();
        for (int i = 1; i <= totalSpots; i++) {
            spots.add(new ParkingSpot(i));
        }
    }

    public ParkingSpot assignSpot(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied()) {
                spot.assignVehicle(vehicle);
                return spot;
            }
        }
        return null; 
    }

    public double calculateCost(Vehicle vehicle) {
        if (vehicle.getExitTime() == null) {
            vehicle.setExitTime();
        }
        long duration = java.time.Duration.between(vehicle.getEntryTime(), vehicle.getExitTime()).toMinutes();
        return duration * costPerMinute;
    }

    public void freeSpot(int spotId) {
        for (ParkingSpot spot : spots) {
            if (spot.getSpotId() == spotId) {
                spot.removeVehicle();
                break;
            }
        }
    }

    public ArrayList<ParkingSpot> getAvailableSpots() {
        ArrayList<ParkingSpot> availableSpots = new ArrayList<>();
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied()) {
                availableSpots.add(spot);
            }
        }
        return availableSpots;
    }

    // Spot ID ile park yerini al
    public ParkingSpot getSpotById(int spotId) {
        for (ParkingSpot spot : spots) {
            if (spot.getSpotId() == spotId) {
                return spot;
            }
        }
        return null; 
    }

    // Dolu park yerlerini veri olarak döndür
    public Object[][] getOccupiedSpotsData() {
        ArrayList<Object[]> data = new ArrayList<>();
        for (ParkingSpot spot : spots) {
            if (spot.isOccupied()) {
                Vehicle vehicle = spot.getVehicle();
                data.add(new Object[]{spot.getSpotId(), vehicle.getLicensePlate(), vehicle.getEntryTime().toString()});
            }
        }
        return data.toArray(new Object[0][]);
    }
}
