package ch13.work.facade;

public class Square implements Shape {
    @Override
    public void draw(int x, int y, int width, int height) {
        System.out.println("Square with coordinate left-down point (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
    }
}
