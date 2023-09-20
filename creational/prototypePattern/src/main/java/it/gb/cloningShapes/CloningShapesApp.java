package it.gb.cloningShapes;

public abstract class CloningShapesApp {

    public static enum SHAPES {
        CIRCLE,
        SQUARE,
        TRIANGLE
    }

    public static void executeCloningShapesApp() {

        // Init shape manager
        ShapeManager shapeManager = new ShapeManager();
        shapeManager.addShapePrototype(CloningShapesApp.SHAPES.CIRCLE.name(), new Circle());
        shapeManager.addShapePrototype(CloningShapesApp.SHAPES.SQUARE.name(), new Square());
        shapeManager.addShapePrototype(CloningShapesApp.SHAPES.TRIANGLE.name(), new Triangle());

        Circle circle = (Circle) shapeManager.drawShapesAt(CloningShapesApp.SHAPES.CIRCLE.name(), 0, 0);
        Square square = (Square) shapeManager.drawShapesAt(CloningShapesApp.SHAPES.SQUARE.name(), 4, 3);
        Triangle triangle = (Triangle) shapeManager.drawShapesAt(CloningShapesApp.SHAPES.TRIANGLE.name(), 2, 2);

        circle.draw();
        square.draw();
        triangle.draw();
    }
}
