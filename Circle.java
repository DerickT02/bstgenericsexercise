public class Circle extends Shape implements Comparable<Shape>{
    private double radius;
    private double area;
  
    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    public double area(){
        this.area = Math.PI * (radius * radius);
        return this.area;
    }

    public String toString(){
        return String.format("Circle with radius %d", radius);
    }

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
