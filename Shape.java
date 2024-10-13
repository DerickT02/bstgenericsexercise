//Shape.java - Abstract class that has shape and toString override method
// CSC 130, Fall 2024
public abstract class Shape{
   private String name;

   //Shape constructor that takes in a name
   public Shape(String name){
        this.name = name;
   }
   
   //area method that returns that shapes area
   public abstract double area();

   //Override default toString method to represent object as a string
   @Override
   public abstract String toString();
}