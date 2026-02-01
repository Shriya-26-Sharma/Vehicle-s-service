package in.shriya;

public class TestShapes {
   public static void main(String[] args) {
    //Shape sh=new Shape();
    Circle cr=new Circle(45);
    Square sq =new Square(10.8);
    System.out.println("Area of Circle is "+ cr.calculateArea());
    System.out.println("Area of Square is "+ sq.calculateArea());
   } 
}
