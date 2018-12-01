package ch13.work.facade;

public class ShapeMaker {
    private Shape circle, rectangle, square, line;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
        line = new Line();
    }

    public void drawCircle(int x, int y, int z, int j){
        circle.draw(x, y, z, j);
    }
    public void drawRectangle(int x, int y, int z, int j){
        rectangle.draw(x, y, z, j);
    }
    public void drawSquare(int x, int y, int z, int j){
        square.draw(x, y, z, j);
    }
    public void drawLine(int x, int y, int z, int j) {
        line.draw(x, y, z, j);
    }
}
