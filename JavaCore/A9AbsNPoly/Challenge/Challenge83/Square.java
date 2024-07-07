package A9AbsNPoly.Challenge.Challenge83;

public class Square extends Shape{
    private final double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
    
}
