package ss06_inheritance.BaiTap.Point2DandPoint3D;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y , float z) {
        super.setXY(x,y);
        this.setZ(z);
    }

    public float[] getXYZ() {
        float[] XYZ = {this.getX(),this.getY(),this.getZ()};
        return XYZ;
    }

    @Override
    public String toString() {
        return "("+this.getX()+","+this.getY()+","+this.getZ()+")";
    }
}
