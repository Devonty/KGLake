package path;

import java.awt.*;
import java.awt.geom.Point2D;

public class Stand implements PathController{
    protected final Point2D point;

    public Stand() {
        this(new Point2D.Double(0, 0));
    }
    public Stand(int x, int y) {
        this(new Point2D.Double(x, y));
    }

    public Stand(Point2D point) {
        this.point = point;
    }

    @Override
    public double[] nextParams(){
        return new double[]{point.getX(), point.getY()};
    }
}
