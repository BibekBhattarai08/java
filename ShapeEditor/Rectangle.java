import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

public class Rectangle extends Shape {
    private Point2D _topLeft;
    private double _width;
    private double _height;

    // 5-parameter constructor
    public Rectangle(String name, Color color, Point2D topLeft, double width, double height) {
        super(name, color);
        _topLeft = topLeft;
        _width = width;
        _height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
   
}
