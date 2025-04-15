package CommandPattern;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command turnOnLight = new TurnOnLightCommand(light);
        Command setThermostat = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();


        remote.assignCommand("button1", turnOnLight);
        remote.assignCommand("button2", setThermostat);

        remote.pressButton("button1");
        remote.pressButton("button2");

        remote.undoButton("button2");
        remote.undoButton("button1");
        //d
    }
}
