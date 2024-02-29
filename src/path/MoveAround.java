package path;

import java.awt.*;
import java.awt.geom.Point2D;

public class MoveAround implements PathController {
    private double r;
    private double angle;
    private double angleSpeed;
    private final Point2D point;

    public MoveAround(Point2D midPos, float r, double startAngle, double angleSpeed) {
        this.point = midPos;
        this.r = r;
        this.angle = startAngle;
        this.angleSpeed = angleSpeed;
    }

    @Override
    public double[] nextParams(){
        angle += angleSpeed;
        double newX = point.getX() + r * Math.cos(angle);
        double newY = point.getY() + r * Math.sin(angle);
        return new double[]{newX, newY, -Math.PI + angle};
    }


}
