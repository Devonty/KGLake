package elements;

import path.PathController;
import path.Stand;

import java.awt.*;
import java.awt.geom.Point2D;

abstract public class DrawObject implements DrawAble{
    protected int x, y;
    protected int width, height;
    protected double angle;
    protected PathController pathController;

    public DrawObject(int x, int y, int width, int height, float startAngle, PathController pathController) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.angle = startAngle;
        this.pathController = pathController;
    }
    public DrawObject(int x, int y, int width, int height, PathController pathController) {
        this(x, y, width, height, 0f, pathController);
    }
    public DrawObject(int x, int y, int width, int height) {
        this(x, y, width, height, new Stand(new Point2D.Double(x, y)));
    }

    @Override
    public void draw(Graphics2D g) {
        Color saveColor = g.getColor();
        g.rotate(angle, x, y);

        mainDraw(g);

        g.rotate(-angle, x, y);
        g.setColor(saveColor);
    }

    @Override
    public void update() {
        double[] params = pathController.nextParams();
        x = (int) params[0];
        y = (int) params[1];
        if(params.length >= 3) angle = params[2];
    }

    abstract protected void mainDraw(Graphics2D g);
}
