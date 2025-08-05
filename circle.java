
class Circle {
    double radius = 5.0;

    // Method to calculate area
    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
    }
}