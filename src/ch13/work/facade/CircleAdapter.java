package ch13.work.facade;

public class CircleAdapter implements Shape {
    private Circle adaptee;

    public CircleAdapter(Circle circle) {
        this.adaptee = circle;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int centerX = ((x2 - x1) / 2) + x1;
        int centerY = ((y2 - y1) / 2) + y1;

        int radius = Math.min(x2, y2);
        int diameter = radius * 2;
        adaptee.draw(centerX, centerY, radius, diameter);
    }
}
