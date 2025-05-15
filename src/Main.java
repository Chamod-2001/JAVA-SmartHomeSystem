import model.*;
import view.smartHomeView;
import controller.smartHomeController;

public class Main {
    public static void main(String[] args) {
        smartLight light = new smartLight("L001", "Smart Light");
        smartThermostat thermostat = new smartThermostat("T001", "Smart Thermostat");
        smartCamera camera = new smartCamera("C001", "Smart Camera");

        smartHomeView view = new smartHomeView();
        smartHomeController controller = new smartHomeController(light, thermostat, camera, view);

        controller.operateLight();
        controller.operateThermostat();
        controller.operateCamera();
    }
}
