package model;

// Subclass representing a smart thermostat device, extends the base smartDevice class
public class smartThermostat extends smartDevice {
    // Temperature setting in degrees Celsius
    private double temperature;

    // Constructor to initialize the thermostat with device ID and name
    // Temperature defaults to 20.0°C
    public smartThermostat(String deviceId, String deviceName) {
        super(deviceId, deviceName);
        this.temperature = 20.0; // default temperature
    }

    // Sets the current temperature of the thermostat
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    // Returns the current temperature setting
    public double getTemperature() {
        return temperature;
    }

    // Overrides getDeviceInfo from the base class to include temperature information
    @Override
    public String getDeviceInfo() {
        return super.getDeviceInfo() + ", Temperature=" + temperature + "°C";
    }
}
