package Chapter_11;

import java.util.Date;

public class Geometric {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public Geometric(){
        dateCreated  = new Date();
    }
    public Geometric(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated  = new Date();
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void printInfo(){
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);
    }
}
