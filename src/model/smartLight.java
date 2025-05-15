package model;

public class smartLight extends smartDevice{
    private int brightnessLevel; // 0-100
    private String color;

    public smartLight(String deviceId, String deviceName) {
        super(deviceId, deviceName);
        this.brightnessLevel = 0;
        this.color = "White";
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            brightnessLevel = brightness;
        }
    }

    public int getBrightness() {
        return brightnessLevel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getDeviceInfo() {
        return super.getDeviceInfo() + ", Brightness=" + brightnessLevel + "%, Color=" + color;
    }
}
