class Circle {
    void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }
}

public class AreaCircle2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculateArea(2.5);
    }
}