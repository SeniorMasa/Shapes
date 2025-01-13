public class Circle extends Shapes {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        System.out.println("Circle area is: " + Math.PI * radius * radius * Math.PI);
        return 2 * Math.PI * radius * radius;

    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


}