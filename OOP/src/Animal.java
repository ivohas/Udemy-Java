public class Animal {
    private double weight;
    private double size;

    public void Breath(){
        System.out.println("breath");
    }

    public void Eat() {
        System.out.println("eat");
    }

    public Animal(double weight, double size) {
        this.weight = weight;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", size=" + size +
                '}';
    }
}
