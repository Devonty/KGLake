package elements;

import path.PathController;
import path.Stand;

import java.awt.*;

public class Lake extends DrawObject{
    public Lake(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    protected void mainDraw(Graphics2D g) {
        int dx, dy, tmpHeight, tmpWidth, tmpX, tmpY;
        // sand
        g.setColor(new Color(250, 250, 122));
        g.fillOval(x, y, width, height);
        // beton
        dy = 125;
        dx = 150;
        tmpX = 0;
        tmpY = y + dy;
        tmpWidth = x+ dx;
        tmpHeight = height / 2;
        g.setColor(new Color(119, 132, 152));
        g.fillRect(tmpX, tmpY, tmpWidth, tmpHeight);
        // water
        dx = 100;
        dy = 50;
        g.setColor(new Color(85, 141, 227));
        g.fillRect(tmpX, tmpY + dy, tmpWidth, tmpHeight - 2*dy);
        // water
        dx = 40;
        dy = dx;
        g.setColor(new Color(85, 141, 227));
        g.fillOval(x + dx, y + dy, width - 2* dx, height - 2*dy);
    }
}
