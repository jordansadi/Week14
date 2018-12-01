package ch13.work.facade;

public class Circle implements Shape {
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Circle with center at point (" + x1 + ";" + y1 + "), radius " + x2 + ", diameter " + y2);
    }
}