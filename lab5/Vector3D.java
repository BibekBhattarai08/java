public class Vector3D extends Vector2D {
    protected double _z;

    public void setZ(double z) {
        _z = z;
    }

    public double getZ() {
        return _z;
    }

    @Override
    public double calcMag() {
        return super.calcMag() + _z * _z;

    }

    @Override
    public void printVector() {
        super.printVector();
        setZ(1.5);
        System.out.println("z= " + getZ());

    }

}
