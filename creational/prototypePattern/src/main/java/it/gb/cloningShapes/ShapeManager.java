package it.gb.cloningShapes;

import java.util.HashMap;
import java.util.Map;

public class ShapeManager {

    private Map<String, Shape> shapesCollection;

    public ShapeManager() {
        super();
        this.shapesCollection = new HashMap<String, Shape>();
    }

    public void addShapePrototype(String name, Shape shape) {
        this.shapesCollection.put(name, shape);
    }

    public Shape getShapePrototype(String name) {
        return this.shapesCollection.get(name);
    }

    public Shape drawShapesAt(String shapeName, int x, int y) {
        Shape shape = null;
        try {
            Shape shapePrototype = this.shapesCollection.get(shapeName);
            shape = (Shape) shapePrototype.clone();
            shape.setX(x);
            shape.setY(y);
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }

        return shape;
    }
}
