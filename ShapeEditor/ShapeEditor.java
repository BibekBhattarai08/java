import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

public class ShapeEditor {
    public static void main(String[] args) {
        // Create some objects
        Point2D center = new Point2D(20, 7);
        Circle circ = new Circle("Small circle", Color.BLUE, center, 10.5);

        // Draw the circle
        circ.draw();
    }
}
