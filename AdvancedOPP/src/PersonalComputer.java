public class PersonalComputer {

    private ComputerCase computerCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PersonalComputer(Monitor monitor, Motherboard motherboard, ComputerCase computerCase) {
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "computerCase=" + computerCase.toString() +
                ", motherboard=" + motherboard.toString() +
                ", monitor=" + monitor.toString() +
                '}';
    }
}
