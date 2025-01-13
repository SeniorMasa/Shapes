public class Rectangular extends Shapes{
    double width;
    double height;
    public Rectangular(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }


}