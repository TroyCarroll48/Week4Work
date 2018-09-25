package Week4pt2;

public class Triangleclass extends Shape {

    double base;
    double height;

    public Triangleclass(int side, double base, double height){
        super(side);
        this.base = base;
        this.height = height;

    }


    @Override
    public double calculateArea(){
        return (base + height) / 2;
    }


}
