package ss06_inheritance.BaiTap.Point2DandPoint3D;

public class Point2D {
    private float x;
    private float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float X , float Y) {
        this.x = X;
        this.y = Y;
    }

    public float[] getXY() {
        float[] XY = new float[2];
        XY[0] = this.getX();
        XY[1] = this.getY();
        return XY;
    }

    public String toString() {
        return "("+this.getX()+","+this.getY()+")";
    }
}
