package CommandPattern;

public class Thermostat {
    private int currentTemperature;

    public void setTemperature(int temperature) {
        currentTemperature = temperature;
        System.out.println("[Thermostat] Setting temperature to " + temperature + "°C");
    }

    public void revertTemperature() {
        System.out.println("[Thermostat] Reverting to previous temperature");
    }
}
