// Rectangle.java - A shape class that provides methods relating to a rectangle object, including an area calculation method
// CSC 130, Fall 2024
public class Rectangle extends Shape implements Comparable<Shape>{
    //Rectangle class that takes in a length and height to calculate the area
    private double length;
    private double height;
    private double area;


    //Rectangle constructor that takes in a name, length and height
    public Rectangle(String name, double length, double height){
        super(name);
        this.length = length;
        this.height = height;
    }

    //A length function that allows to get the length for the square class
    public double getLength(){
        return length;
    }
    //Area method from abstract shape class defined as the formula for area of a rectangle
    public double area(){
        this.area = length * height;
        return this.area;
    }
    //Overridden toString method from abstract class
    public String toString(){
        return String.format("Rectangle with length %.1f and height %.1f",length, height);
    }
    //Overriden compareTo method that compares the area of this rectangle to other shapes
    @Override
    public int compareTo(Shape otherShape){
        int areaDifference = (int)this.area() - (int)otherShape.area();
        return areaDifference;
    }
}