package it.gb.cloningShapes;

public class Circle implements Shape {

    private int x;
    private int y;

    public Circle() {
        super();
        this.x = 5;
        this.y = 5;
    }

    public Circle(Circle circle) {
        super();
        this.x = circle.getX();
        this.y = circle.getY();
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        StringBuilder circleString = new StringBuilder();
        for (int i = 0; i < y; i++) {
            circleString.append('\n');
        }
        for (int i = 0; i < x; i++) {
            circleString.append(' ');            
        }
        circleString.append('○');

        System.out.println(circleString.toString());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle [x=" + x + ", y=" + y + "]";
    }
    
}
