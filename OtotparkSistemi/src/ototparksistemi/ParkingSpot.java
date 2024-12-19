public class ParkingSpot {
    private int spotId;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSpot(int spotId) {
        this.spotId = spotId;
        this.isOccupied = false;
        this.vehicle = null;
    }

    public int getSpotId() {
        return spotId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isOccupied = false;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}

