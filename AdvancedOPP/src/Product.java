public class Product {
    public String manufacturer;
    public String model;
    public int width;
    public int height;
    public int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product {
    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                "} " + super.toString();
    }
}

class Motherboard extends Product {

    public int ramSlots;
    public int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, String bios, int cardSlots) {
        this(model, manufacturer);
        this.ramSlots = ramSlots;
        this.bios = bios;
        this.cardSlots = cardSlots;
    }

    public void updateBios(String bios) {
        if (!bios.isBlank() || !bios.isEmpty())
            this.bios = bios;
        else
            System.out.println("Enter a valid bios");

        System.out.println("Updated the bios to: " + this.bios);
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "ramSlots=" + ramSlots +
                ", cardSlots=" + cardSlots +
                ", bios='" + bios + '\'' +
                ", depth=" + depth +
                ", height=" + height +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", width=" + width +
                "} " + super.toString();
    }
}

class ComputerCase extends Product {
    public String color;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String color) {
        super(model, manufacturer);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ComputerCase{" +
                "color='" + color + '\'' +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                "} " + super.toString();
    }
}

