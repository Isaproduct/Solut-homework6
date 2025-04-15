package CommandPattern;

public class SetThermostatCommand implements Command {
    private Thermostat thermostat;
    private int temperature;
    private int previousTemperature;

    public SetThermostatCommand(Thermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        previousTemperature = temperature;
        thermostat.setTemperature(temperature);
    }

    @Override
    public void undo() {
        thermostat.revertTemperature();
    }
}
