package Listing_9;

public class Circle {


    //    data field
    double radius;

//    constructor
    Circle (double radius){
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }

}
