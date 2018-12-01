package ch13.work.facade;

public class SquareAdapter implements Shape {
    private Square adaptee;

    public SquareAdapter(Square square) {
        this.adaptee = square;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int width = Math.min(x2, y2);
        int height = Math.min(x2, y2);
        adaptee.draw(x1, y1, width, height);
    }
}
