public class Rectangle extends Shape implements Comparable<Shape>{
    private double length;
    private double height;
    private double area;

    public Rectangle(String name, double length, double height){
        super(name);
        this.length = length;
        this.height = height;
    }

    public double getLength(){
        return length;
    }

    public double area(){
        this.area = length * height;
        return this.area;
    }

    public String toString(){
        return String.format("Rectangle with length %d and height %d",length, height);
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
