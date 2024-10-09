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
    //Overriden compareTo method that compares the area of this square to other shapes
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
