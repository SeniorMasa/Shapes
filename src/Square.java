
public class Square extends Shapes {
    private int length;
    public Square(int length){
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*length;
    }

}