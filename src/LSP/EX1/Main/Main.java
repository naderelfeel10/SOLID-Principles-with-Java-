package LSP.EX1.Main;

import LSP.EX1.problem.Rectangle;
import LSP.EX1.problem.Square;

import LSP.EX1.solution.Shape;

public class Main {

    public static void main(String[] args){

        // the problem :
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(2);
        rectangle.setHeight(5);
        System.out.println("rectangle area: "+rectangle.getArea());

        // if we raplaced the Rectangle with Square :
        // 1. Liskov subsitution says it has to act the same :

        Rectangle square = new Square();
        square.setWidth(2);
        square.setHeight(5);
        System.out.println("square area : "+square.getArea());

        // not the same !!

        // solution :
        System.out.println("solution :");

        Shape rec1 = new LSP.EX1.solution.Rectangle(2,5);
        System.out.println("rectangle : "+rec1.getArea());

        Shape sq1 = new LSP.EX1.solution.Square(2);
        System.out.println("square : "+sq1.getArea());

        // any child of shape can be easily substituted with the parent


    }

}
