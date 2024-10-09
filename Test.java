import java.util.Arrays;


public class Test {
    public static void main(String[] args) {
        //210, 300, 572
        Rectangle shape1 = new Rectangle("Hey", 10.0, 21.0);
        Rectangle shape2 = new Rectangle("Hey", 100.0, 3.0);
        Rectangle shape3 = new Rectangle("Lebron", 13.0, 44.0);
        Triangle shape4 = new Triangle("Hey", 15.0, 50.0);

        Shape shapeArray[] = new Shape[]{shape2, shape1, shape3, shape4};
        for(Shape shape: shapeArray){
            System.out.println(shape.area());
        }
        Arrays.sort(shapeArray);
        for(Shape shape: shapeArray){
            System.out.println(shape.area());
        }
    }
}
