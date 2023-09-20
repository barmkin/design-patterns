package it.gb.cloningShapes;

public interface Shape extends Cloneable {
    
    public int getX();

    public int getY();

    public void setX(int x);

    public void setY(int y);

    public void draw();

    Object clone() throws CloneNotSupportedException;

}
