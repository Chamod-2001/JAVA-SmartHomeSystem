package model;

// Subclass representing a smart light device, extends the base smartDevice class
public class smartLight extends smartDevice {
    // Brightness level of the light (0 to 100 percent)
    private int brightnessLevel;

    // Color of the light
    private String color;

    // Constructor to initialize the smart light with device ID and name
    // Brightness defaults to 0%, color defaults to White
    public smartLight(String deviceId, String deviceName) {
        super(deviceId, deviceName);
        this.brightnessLevel = 0;
        this.color = "White";
    }

    // Sets the brightness level if within valid range (0-100)
    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            brightnessLevel = brightness;
        }
    }

    // Returns the current brightness level
    public int getBrightness() {
        return brightnessLevel;
    }

    // Sets the color of the light
    public void setColor(String color) {
        this.color = color;
    }

    // Returns the current color of the light
    public String getColor() {
        return color;
    }

    // Overrides getDeviceInfo from the base class to include brightness and color information
    @Override
    public String getDeviceInfo() {
        return super.getDeviceInfo() + ", Brightness=" + brightnessLevel + "%, Color=" + color;
    }
}
