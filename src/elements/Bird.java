package elements;

import path.PathController;

import java.awt.*;

public class Bird extends DrawObject {
    public Bird(int x, int y, int width, int height, PathController pathController) {
        super(x, y, width, height, pathController);
    }

    @Override
    protected void mainDraw(Graphics2D g) {
        int dx, dy, tmpHeight, tmpWidth, tmpX, tmpY;
        Color body = new Color(207, 243, 243);
        Color borders = new Color(118, 124, 124);
        // body
        dy = width / 4;
        tmpY = y + dy;
        tmpHeight = height * 3 / 4;
        g.setColor(body);
        g.fillOval(x, tmpY, width, tmpHeight);
        g.setColor(borders);
        g.drawOval(x, tmpY, width, tmpHeight);

        // front
        tmpWidth = height / 3;
        tmpHeight = tmpWidth;
        dx = (width - tmpWidth) / 2;
        tmpX = x + dx;
        tmpY = y;
        g.setColor(body);
        g.fillOval(tmpX, tmpY, tmpWidth, tmpHeight);
        g.setColor(borders);
        g.drawOval(tmpX, tmpY, tmpWidth, tmpHeight);

        // back
        tmpWidth = height / 5;
        tmpHeight = tmpWidth;
        dx = (width - tmpWidth) / 2;
        tmpX = x + dx;
        tmpY = y + height * 3 / 4;
        g.setColor(body);
        g.fillOval(tmpX, tmpY, tmpWidth, tmpHeight);
        g.setColor(borders);
        g.drawOval(tmpX, tmpY, tmpWidth, tmpHeight);

        // fly
        tmpWidth = width * 3 / 7;
        tmpHeight = height * 4 / 7;
        // 1
        tmpX = x;
        tmpY = y + height * 2 / 7;
        g.setColor(body);
        g.fillOval(tmpX, tmpY, tmpWidth, tmpHeight);
        g.setColor(borders);
        g.drawOval(tmpX, tmpY, tmpWidth, tmpHeight);
        // 2
        tmpX = x + width - tmpWidth;
        g.setColor(body);
        g.fillOval(tmpX, tmpY, tmpWidth, tmpHeight);
        g.setColor(borders);
        g.drawOval(tmpX, tmpY, tmpWidth, tmpHeight);

        // klyv
        dx = width / 6;
        dy = height / 12;
        tmpX = x + 2 * dx;
        tmpY = y - dy;

        Polygon polygon = new Polygon();
        polygon.addPoint(tmpX, y);
        polygon.addPoint(tmpX + dx, tmpY);
        polygon.addPoint(tmpX + 2 * dx, y);

        g.setColor(new Color(255, 106, 13));
        g.fillPolygon(polygon);

        //eyes
        int r = width / 20;
        tmpX -= r;
        tmpY += 2*dy + r;
        // 1
        g.setColor(new Color(14, 11, 11));
        g.fillOval(tmpX, tmpY, 2*r, 2*r);
        // 2
        g.setColor(new Color(14, 11, 11));
        g.fillOval(tmpX + 2*dx, tmpY, 2*r, 2*r);
    }
}
