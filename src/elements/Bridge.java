package elements;

import java.awt.*;

public class Bridge extends DrawObject {
    public Bridge(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    protected void mainDraw(Graphics2D g) {
        int dx, dy, tmpHeight, tmpWidth, tmpX, tmpY;
        dx = 40;
        g.setColor(new Color(41, 41, 44, 40));
        g.fillRect(x + dx, y, width, height);
        // base
        g.setColor(new Color(145, 145, 152));
        g.fillRect(x, y, width, height);
        // borders
        g.setColor(new Color(3, 3, 3));
        g.drawRect(x, y, width, height);
        // roadBase
        dx = 20;
        dy = 20;
        tmpY = 0;
        tmpX = x + dx;
        tmpWidth = width - 2 * dx;
        g.setColor(new Color(3, 3, 3));
        g.fillRect(tmpX, tmpY, tmpWidth, height);
        // lines
        tmpWidth = 15;
        tmpHeight = 30;
        dy = 10;
        tmpX = x+ (width - tmpWidth) / 2;
        tmpY = 0;
        g.setColor(new Color(255, 242, 0));
        while (tmpY < height) {
            g.fillRect(tmpX, tmpY, tmpWidth, tmpHeight);
            tmpY += dy + tmpHeight;
        }
    }
}
