// Test.java - A class designed to test our shape class methods and display the 3 different traversal methods of our BST.
// CSC 130, Fall 2024
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Creating objects of shape classes
        Rectangle shape1 = new Rectangle("Hey", 10.0, 21.0);
        Rectangle shape2 = new Rectangle("Hey", 100.0, 3.0);
        Rectangle shape3 = new Rectangle("Lebron", 13.0, 44.0);
        Triangle shape4 = new Triangle("Hey", 15.0, 50.0);

        // Creating array of shape objects and printing them, then once again but sorted
        Shape shapeArray[] = new Shape[]{shape2, shape1, shape3, shape4};
        System.out.println("Shape objects: ");
        for(Shape shape: shapeArray){
            System.out.println(shape.area());
        }
        Arrays.sort(shapeArray);
        System.out.println("Shape objects sorted: ");
        for(Shape shape: shapeArray){
            System.out.println(shape.area());
        }
        // Creating circle objects that will go into tree
        Circle shape5 = new Circle("Kevin", 15.5);
        Circle shape6 = new Circle("Larry", 11.0);
        Circle shape7 = new Circle("Stephen", 12.8);
        Circle shape8 = new Circle("Dwayne", 19.2);
        Circle shape9 = new Circle("Shaq", 9.8);
        Circle shape10 = new Circle("Luca", 17.3);
        Circle shape11 = new Circle("Damian", 13.1);

        // Creating Tree
        Tree tree = new Tree();
        tree.insertNode(shape5);
        tree.insertNode(shape6);
        tree.insertNode(shape7);
        tree.insertNode(shape8);
        tree.insertNode(shape9);
        tree.insertNode(shape10);
        tree.insertNode(shape11);

        // Displaying the various traversal methods
        System.out.println("Preorder Traversal: ");
        tree.preorderTraversal();
        System.out.println("\nInorder Traversal: ");
        tree.inorderTraversal();
        System.out.println("\nPostorder Traversal: ");
        tree.postorderTraversal();
    }
}