// Square.java - A shape class that provides methods relating to a square object, including an area calculation method
// CSC 130, Fall 2024
public class Square extends Rectangle{
    //Takes in the side and comparable interface from the rectangle operator
    private double area;

    //Square constructor that takes in name and side
    public Square(String name, double side){
        super(name, side, side);
    }

    //Area method from abstract shape class defined as the formula for area of a square
    public double area(){
        this.area = Math.pow(getLength(), 2.0);
        return this.area;
    }
    //Overridden toString method from abstract class
    public String toString(){
        return String.format("Square with length %.1f and area %.1f", getLength(), area());
    }
    //Overriden compareTo method that compares the area of this square to other shapes
    @Override
    public int compareTo(Shape otherShape){
        int areaDifference = (int)this.area() - (int)otherShape.area();
        return areaDifference;
    }


}
