package Listing_9;
import java.text.DecimalFormat;

public class TestCircleObject {
    private static final DecimalFormat decimalFormat = new DecimalFormat("0.00");
    public static void main(String[] args){
        Circle circle = new Circle(10);

        System.out.println("Circle area is : " + decimalFormat.format(circle.getArea()));
        System.out.println("Circle perimeter is : " + decimalFormat.format(circle.getPerimeter()));
        //set new radius for circle
        circle.setRadius(20);
        System.out.println("New Circle area is : " + decimalFormat.format(circle.getArea()));
        System.out.println("New Circle perimeter is : " + decimalFormat.format(circle.getPerimeter()));
    }
}
