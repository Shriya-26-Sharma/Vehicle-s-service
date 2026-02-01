package in.shriya;

public class Square extends Shape{
 private final double sideInCms;
 public Square(double sideInCms){
    this.sideInCms=sideInCms;
 }
 public double getSideinCms(){
    return getSideinCms();
 }
@Override
public double calculateArea(){
    return sideInCms*sideInCms;
} 
}