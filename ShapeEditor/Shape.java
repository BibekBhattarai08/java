import javafx.scene.paint.Color;

public abstract class Shape
{
		protected String _name;   // This shape's name
		protected Color _color;   // The color to draw this shape

		// 2-parameter constructor
		public Shape(String name, Color color)
		{
		    _name = name;
		    _color = color;
		}

		// Abstract method to draw the shape
		public abstract void draw();
}
