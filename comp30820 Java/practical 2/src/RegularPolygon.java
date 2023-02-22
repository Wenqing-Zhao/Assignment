
public class RegularPolygon {
    // Set several variables according to the assignment requirements
    private int n;
    private double length;

    // Create get and set methods
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Implement a constructor with no parameters
    public RegularPolygon() {
        this.n = 3;
        this.length = 1;
    }

    // Implement a constructor with parameters
    public RegularPolygon(int n, double length) {
        this.n = n;
        this.length = length;
    }

    // Calculate the perimeter by multiplying the number of sides by the length of each side
    public double getPerimeter() {
        return n * length;
    }

    // Calculate the area by the formula
    public double getArea() {
        return (n*length*length)/(4*Math.tan(Math.PI/n));
    }

    // The toString method prints out the number of sides and the length of each side
    public String toString() {
        return "number of sides = " + n + ", side length = " + length;
    }

}
