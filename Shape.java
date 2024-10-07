public abstract class Shape{
   private String name;

   public Shape(String name){
        this.name = name;
   }
   
   public abstract double area();

   @Override
   public abstract String toString();
}