package controller;

import model.*;
import view.smartHomeView;

public class smartHomeController {
    private smartLight light;
    private smartThermostat thermostat;
    private smartCamera camera;
    private smartHomeView view;

    public smartHomeController(smartLight light, smartThermostat thermostat, smartCamera camera, smartHomeView view) {
        this.light = light;
        this.thermostat = thermostat;
        this.camera = camera;
        this.view = view;
    }

    public void operateLight() {
        light.turnOn();
        light.setBrightness(75);
        light.setColor("Blue");
        view.displayDeviceInfo("SmartLight Info: " + light.getDeviceInfo());
        view.displaySeparator();
    }

    public void operateThermostat() {
        thermostat.turnOn();
        thermostat.setTemperature(24);
        view.displayDeviceInfo("SmartThermostat Info: " + thermostat.getDeviceInfo());
        view.displaySeparator();
    }

    public void operateCamera() {
        camera.turnOn();
        camera.startRecording();
        camera.addStorage(500);
        view.displayDeviceInfo("SmartCamera Info: " + camera.getDeviceInfo());
    }
}
