package LSP.EX1.solution;

public class Square implements Shape {

    int side;
    public Square(int side){
        this.side = side;
    }
    @Override
    public int getArea(){
        return side*side;
    }

}
