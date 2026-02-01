package in.shriya;

public class Circle extends Shape  {
     private  final double radiusinCms;

     public Circle (double radiusinCms) {
        this.radiusinCms=radiusinCms;
     }
     public double getRadiusinCms(){
        return radiusinCms;
     }
    @Override 
    public double calculateArea() {
        return Math.PI * Math.pow(radiusinCms,2);
    }
}
