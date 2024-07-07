package A9AbsNPoly.Challenge.Challenge83;

public class Circle extends Shape{
    private final double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double calculateArea() {
        return 3.14 * radius * radius; 
    }
    
    
    
}