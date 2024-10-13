// Triangle.java - A shape class that provides methods relating to a triangle object, including an area calculation method
// CSC 130, Fall 2024
public class Triangle extends Shape implements Comparable<Shape>{
    //Triangle class that takes in the base and height
    private double base;
    private double height;
    private double area;


    //Triangle constructor
    public Triangle(String name, double base, double height){
        super(name);
        this.base = base;
        this.height = height;
    }
    //Area method from abstract shape class defined as the formula for area of a triangle
    public double area(){
        this.area = (1.0/2.0) * base * height;
        return this.area;
    }
    //Overridden toString method from abstract class
    public String toString(){
        return String.format("Triangle with base %.1f and height %.1f ", base, height);
    }
    //Overriden compareTo method that compares the area of this triangle to other shapes
    @Override
    public int compareTo(Shape otherShape){
        int areaDifference = (int)this.area() - (int)otherShape.area();
        return areaDifference;
    }
}
