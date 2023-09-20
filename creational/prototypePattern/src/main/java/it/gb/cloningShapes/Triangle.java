package it.gb.cloningShapes;

public class Triangle implements Shape {

    private int x;
    private int y;

    public Triangle() {
        super();
        this.x = 5;
        this.y = 5;
    }

    public Triangle(Triangle triangle) {
        super();
        this.x = triangle.getX();
        this.y = triangle.getY();
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
        StringBuilder triangleString = new StringBuilder();
        for (int i = 0; i < y; i++) {
            triangleString.append('\n');
        }
        for (int i = 0; i < x; i++) {
            triangleString.append(' ');            
        }
        triangleString.append('△');

        System.out.println(triangleString.toString());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Triangle(this);
    }

    @Override
    public String toString() {
        return "Triangle [x=" + x + ", y=" + y + "]";
    }
    
}
