public class Sensor {
    private String location;
    private double reading;

    public Sensor(String location, double reading) {
        this.location = location;
        if (reading < -50 || reading > 50) {
            this.reading = 0;
        } else {
            this.reading = reading;
        }
    }

    public String getLocation() {
        return location;
    }
    public double getReading() {
        return reading;
    }
}
