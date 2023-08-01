package packages;

public class Q2 {
    private double height;
    private double width;
    private double breadth;

    public Q2(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double calculateVolume() {
        return height * width * breadth;
    }

    public static void main(String[] args) {
        Q2 compartment = new Q2(5.0, 4.0, 3.0);
        double volume = compartment.calculateVolume();
        System.out.println("Volume: " + volume);
    }
}
