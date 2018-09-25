package Week4pt2;

public class MainSTR {
    public static void main(String[] args) {


        Triangleclass triangle = new Triangleclass(6,11,11);

        Rectangle rectangle = new Rectangle(6,7,10);

//        System.out.println(triangle.calculateArea());
//
//        System.out.println(rectangle.calculateArea());

        Shape[] shape = {triangle, rectangle};



        for(int x = 0; x < shape.length; x++){

            System.out.println(shape[x].calculateArea());

        }


    }
}
