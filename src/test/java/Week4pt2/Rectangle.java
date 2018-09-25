package Week4pt2;

public class Rectangle extends Shape {
    int width;
    int length;



    public Rectangle(int side, int width, int length){
        super(side);
        this.width = width;
        this.length = length;

    }

    @Override
    public  double calculateArea(){
        return width * length;
    }

}
