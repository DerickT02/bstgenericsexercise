// Circle.java - A shape class that provides methods relating to a circle object, including an area calculation method
// CSC 130, Fall 2024
public class Circle extends Shape implements Comparable<Shape>{
    //Circle that takes in the radius which allows us to compute the area
    //Implements Comparable to allow for easy comparisons 
    private double radius;
    private double area;
  
    //Circle constructor
    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }
    //Area method from abstract shape class defined as the formula for circle area
    public double area(){
        this.area = Math.PI * (radius * radius);
        return this.area;
    }

    //Overridden toString method from abstract class
    public String toString(){
        return String.format("Circle with radius %.1f and area %.1f\n", radius, area());
    }

    //Overriden compareTo method that compares the area of this circle to other shapes
    @Override
    public int compareTo(Shape otherShape){
        int areaDifference = (int)this.area() - (int)otherShape.area();
         return areaDifference;
    }
}
