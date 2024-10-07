public class Square extends Rectangle implements Comparable<Shape>{
    private double area;
    public Square(String name, double side){
        super(name, side, side);
    }

    public double area(){
        this.area = Math.pow(getLength(), 2.0);
        return this.area;
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
