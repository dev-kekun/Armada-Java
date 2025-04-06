abstract class SmartDevice {
    private String deviceName;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public void showStatus() {
        System.out.println("Device: " + deviceName);
    }
}

class SmartLight extends SmartDevice {
    public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("Light is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is now OFF");
    }
}

class SmartSpeaker extends SmartDevice {
    public SmartSpeaker(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("Speaker is now playing music");
    }

    @Override
    public void turnOff() {
        System.out.println("Speaker is now OFF");
    }
}

// Bonus Challenge
class SmartThermostat extends SmartDevice {
    public SmartThermostat(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("Thermostat is now set to 22°C");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is turned off");
    }
}

public class SmartHomeDevice {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight("Smart Light");
        SmartDevice speaker = new SmartSpeaker("Smart Speaker");
        SmartDevice thermostat = new SmartThermostat("Smart Thermostat"); // Bonus

        // Demonstrate SmartLight
        light.turnOn();
        light.showStatus();
        light.turnOff();

        // Demonstrate SmartSpeaker
        speaker.turnOn();
        speaker.showStatus();
        speaker.turnOff();

        // Demonstrate SmartThermostat (Bonus)
        thermostat.turnOn();
        thermostat.showStatus();
        thermostat.turnOff();
    }
}
