public class Dog extends Animal{
    private String owner;
    private String name;

    public Dog(double weight, double size, String owner, String name) {
        super(weight, size);
        this.owner = owner;
        this.name = name;
    }

    public void Bow()
    {
        System.out.println("bow bow");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "owner='" + owner + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
