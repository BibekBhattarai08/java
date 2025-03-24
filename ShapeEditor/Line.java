import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

public class Line extends Shape {
    private Point2D _start;   // The starting point of the line
    private Point2D _end;   // The ending point of the line

    // 4-parameter constructor
    public Line(String name, Color color, Point2D start, Point2D end) {
        super(name, color);
        _start = start;
        _end = end;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a line");
    }

}
