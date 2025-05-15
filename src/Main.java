import model.*;
import view.smartHomeView;
import controller.smartHomeController;

// Main class to start the Smart Home System application
public class Main {
    public static void main(String[] args) {
        // Create instances of each smart device (model)
        smartLight light = new smartLight("L001", "Smart Light");
        smartThermostat thermostat = new smartThermostat("T001", "Smart Thermostat");
        smartCamera camera = new smartCamera("C001", "Smart Camera");

        // Create the view instance responsible for output display
        smartHomeView view = new smartHomeView();

        // Create the controller instance to manage interactions between model and view
        smartHomeController controller = new smartHomeController(light, thermostat, camera, view);

        // Use the controller to operate each device and display their information
        controller.operateLight();
        controller.operateThermostat();
        controller.operateCamera();
    }
}
