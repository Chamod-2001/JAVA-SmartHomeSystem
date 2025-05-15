package model;

public class smartCamera extends smartDevice {
    private boolean recordingStatus;
    private int storageUsed; // in MB

    public smartCamera(String deviceId, String deviceName) {
        super(deviceId, deviceName);
        this.recordingStatus = false;
        this.storageUsed = 0;
    }

    public void startRecording() {
        recordingStatus = true;
    }

    public void stopRecording() {
        recordingStatus = false;
    }

    public boolean isRecording() {
        return recordingStatus;
    }

    public void addStorage(int mb) {
        storageUsed += mb;
    }

    public int getStorageUsed() {
        return storageUsed;
    }

    @Override
    public String getDeviceInfo() {
        String recording = recordingStatus ? "Yes" : "No";
        return super.getDeviceInfo() + ", Recording=" + recording + ", Storage=" + storageUsed + "MB";
    }
}
