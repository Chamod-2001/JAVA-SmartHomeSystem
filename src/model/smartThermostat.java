package model;

public class smartThermostat extends smartDevice {
    private double temperature; // Celsius

    public smartThermostat(String deviceId, String deviceName) {
        super(deviceId, deviceName);
        this.temperature = 20.0; // default temperature
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String getDeviceInfo() {
        return super.getDeviceInfo() + ", Temperature=" + temperature + "°C";
    }
}
