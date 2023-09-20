package it.gb.cloningShapes;

public class Square implements Shape {

    private int x;
    private int y;

    public Square() {
        super();
        this.x = 5;
        this.y = 5;
    }

    public Square(Square square) {
        super();
        this.x = square.getX();
        this.y = square.getY();
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
        StringBuilder squareString = new StringBuilder();
        for (int i = 0; i < y; i++) {
            squareString.append('\n');
        }
        for (int i = 0; i < x; i++) {
            squareString.append(' ');            
        }
        squareString.append('□');

        System.out.println(squareString.toString());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Square(this);
    }

    @Override
    public String toString() {
        return "Square [x=" + x + ", y=" + y + "]";
    }
    
}
