package model;

public class smartDevice {
    private String deviceId;
    private String deviceName;
    private boolean status; // true = ON, false = OFF

    public smartDevice(String deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.status = false; // default OFF
    }

    public void turnOn() {
        status = true;
        System.out.println(deviceName + " is turned ON.");
    }

    public void turnOff() {
        status = false;
        System.out.println(deviceName + " is turned OFF.");
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public boolean isOn() {
        return status;
    }

    public String getStatus() {
        return status ? "ON" : "OFF";
    }

    public String getDeviceInfo() {
        return "ID=" + deviceId + ", Name=" + deviceName + ", Status=" + getStatus();
    }
}
