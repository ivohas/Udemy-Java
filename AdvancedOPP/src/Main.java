public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        ComputerCase computerCase = new ComputerCase("Aquarium", "Lian Li");
        Motherboard motherboard = new Motherboard("SteelLegend", "ASRock", 4, "10.2.3543", 2);
        Monitor monitor = new Monitor("vh25", "Alienware");

        PersonalComputer myComputer = new PersonalComputer(monitor, motherboard, computerCase);

        System.out.println(myComputer.toString());

        myComputer.getMotherboard().updateBios("12.32.1232");
    }
}