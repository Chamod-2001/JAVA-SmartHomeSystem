package model;

// Base class (parent class) for all smart devices
public class smartDevice {
    // Unique identifier for the device
    private String deviceId;

    // Name of the device
    private String deviceName;

    // Status of the device: true = ON, false = OFF
    private boolean status;

    // Constructor to initialize device ID and name, status defaults to OFF
    public smartDevice(String deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.status = false; // default OFF
    }

    // Method to turn the device ON
    public void turnOn() {
        status = true;
        System.out.println(deviceName + " is turned ON.");
    }

    // Method to turn the device OFF
    public void turnOff() {
        status = false;
        System.out.println(deviceName + " is turned OFF.");
    }

    // Getter for device ID
    public String getDeviceId() {
        return deviceId;
    }

    // Getter for device name
    public String getDeviceName() {
        return deviceName;
    }

    // Returns true if device is ON, false otherwise
    public boolean isOn() {
        return status;
    }

    // Returns status as a String ("ON" or "OFF")
    public String getStatus() {
        return status ? "ON" : "OFF";
    }

    // Returns basic device information as a formatted String
    public String getDeviceInfo() {
        return "ID=" + deviceId + ", Name=" + deviceName + ", Status=" + getStatus();
    }
}
