public class Vector2D {
    private double _x;
    private double _y;

    public void setX(double x) {
        _x = x;
    }

    public void setY(double y) {
        _y = y;
    }

    public double getX() {
        return _x;
    }

    public double getY() {
        return _y;
    }

    public double calcMag() {
        double m = Math.sqrt(_x * _x + _y * _y);
        return m;
    }

    public void printVector() {
        setX(-6.25);
        setY(9.1);
        System.out.println("x= " + getX());
        System.out.println("y= " + getY());

    }

}
