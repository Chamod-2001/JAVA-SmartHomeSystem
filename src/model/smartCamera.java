package model;

// Subclass representing a smart camera device, extends the base smartDevice class
public class smartCamera extends smartDevice {
    // Indicates whether the camera is currently recording
    private boolean recordingStatus;

    // Amount of storage used by the camera recordings (in megabytes)
    private int storageUsed;

    // Constructor to initialize the camera with device ID and name
    // Recording status defaults to false (not recording), storage used defaults to 0 MB
    public smartCamera(String deviceId, String deviceName) {
        super(deviceId, deviceName);
        this.recordingStatus = false;
        this.storageUsed = 0;
    }

    // Starts the recording on the camera
    public void startRecording() {
        recordingStatus = true;
    }

    // Stops the recording on the camera
    public void stopRecording() {
        recordingStatus = false;
    }

    // Returns true if the camera is currently recording, false otherwise
    public boolean isRecording() {
        return recordingStatus;
    }

    // Adds the specified amount of storage (in MB) to the total used storage
    public void addStorage(int mb) {
        storageUsed += mb;
    }

    // Returns the amount of storage currently used by the camera
    public int getStorageUsed() {
        return storageUsed;
    }

    // Overrides the getDeviceInfo method from the base class to include
    // recording status and storage used in the returned device information string
    @Override
    public String getDeviceInfo() {
        String recording = recordingStatus ? "Yes" : "No";
        return super.getDeviceInfo() + ", Recording=" + recording + ", Storage=" + storageUsed + "MB";
    }
}
