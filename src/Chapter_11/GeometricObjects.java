package Chapter_11;

public class GeometricObjects {
    public static void main(String[] args) {
        Circle obj = new Circle(5, "White Blue", false);
        obj.printInfo();

        System.out.println();
        Rectangle rectangle = new Rectangle(5, 3, "Red", true);
        rectangle.printInfo();
    }
}
