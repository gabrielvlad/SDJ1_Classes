public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference(){
        return 2 * radius * Math.PI;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Radius: " + radius + "\n" +
                "Circumference: " + String.format("%.2f",getCircumference()) + "\n" +
                "Area: " + String.format("%.2f", getArea());
    }

}
