import java.time.LocalDateTime;

public class Vehicle {
    private String licensePlate;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
        this.entryTime = LocalDateTime.now();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setExitTime() {
        this.exitTime = LocalDateTime.now();
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }
}
