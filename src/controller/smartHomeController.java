package controller;

import model.*;
import view.smartHomeView;

// Controller class to manage interactions between the smart devices (model) and the view
public class smartHomeController {
    // Model objects representing each type of smart device
    private smartLight light;
    private smartThermostat thermostat;
    private smartCamera camera;

    // View object responsible for displaying information to the user
    private smartHomeView view;

    // Constructor to initialize the controller with device instances and the view
    public smartHomeController(smartLight light, smartThermostat thermostat, smartCamera camera, smartHomeView view) {
        this.light = light;
        this.thermostat = thermostat;
        this.camera = camera;
        this.view = view;
    }

    // Method to simulate operations on the smart light device
    public void operateLight() {
        light.turnOn();
        light.setBrightness(75);
        light.setColor("Blue");
        // Display device information using the view
        view.displayDeviceInfo("SmartLight Info: " + light.getDeviceInfo());
        view.displaySeparator();
    }

    // Method to simulate operations on the smart thermostat device
    public void operateThermostat() {
        thermostat.turnOn();
        thermostat.setTemperature(24);
        // Display device information using the view
        view.displayDeviceInfo("SmartThermostat Info: " + thermostat.getDeviceInfo());
        view.displaySeparator();
    }

    // Method to simulate operations on the smart camera device
    public void operateCamera() {
        camera.turnOn();
        camera.startRecording();
        camera.addStorage(500);
        // Display device information using the view
        view.displayDeviceInfo("SmartCamera Info: " + camera.getDeviceInfo());
    }
}
