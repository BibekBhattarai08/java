public class Circle
{
private double _radius = 5.5;
public void printArea() {
double area = _radius * _radius * 3.14;
System.out.println(area);
}
public static void main(String[] args) {
    System.out.println(printArea());
}
}