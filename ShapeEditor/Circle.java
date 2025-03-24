import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

public class Circle extends Shape {
    private Point2D _center;
    private double _radius;

    // 4-parameter constructor
    public Circle(String name, Color color, Point2D center, double radius) {
        super(name, color);
        _center = center;
        _radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
   
}
