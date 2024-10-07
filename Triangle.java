public class Triangle extends Shape implements Comparable<Shape>{
    private double base;
    private double height;
    private double area;

    public Triangle(String name, double base, double height){
        super(name);
        this.base = base;
        this.height = height;
    }

    public double area(){
        this.area = (1/2) * base * height;
        return this.area;
    }

    public String toString(){
        return String.format("Triangle with base %d and height %d ", base, height);
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
