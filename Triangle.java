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
        return String.format("Triangle with base %f and height %f ", base, height);
    }
    //Overriden compareTo method that compares the area of this triangle to other shapes
    @Override
    public int compareTo(Shape otherShape){
        if(this.area < otherShape.area()){
            return -1;
        }
        if(this.area == otherShape.area()){
            return 0;
        }

        return 1;
    }
}
