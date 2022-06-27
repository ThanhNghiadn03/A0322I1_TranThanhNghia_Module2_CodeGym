package ss07_abstract_class_interface.BaiTap.Resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square() {
        super(1.0,1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        this.setLength(side);
        this.setWidth(side);
    }
    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side = "+this.getSide()+" , which is a subclass" +
                "of "+super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setSide(((percent/100)*this.getSide()+this.getSide()));
    }
}
