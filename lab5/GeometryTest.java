public class GeometryTest {

    public static void main(String[] args) {
        Vector2D two = new Vector2D();
        Vector3D three = new Vector3D();
        two.setX(-6.25);
        two.setY(9.1);

        three.setX(3.2);
        three.setY(0.2);
        three.setZ(2.7);

        double magTwo = two.calcMag();
        double magthree = three.calcMag();
        System.out.println("magnitude of vector2D is " + magTwo);
        System.out.println("magnitude of vector3D is " + magthree);

        two.printVector();
        three.printVector();

    }

}
