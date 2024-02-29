package elements;

import java.awt.*;

public class Flower extends DrawObject{
    public Flower(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    protected void mainDraw(Graphics2D g) {
        g.setColor(new Color(181, 230, 29));
        g.fillOval(x,y,width, height);
        g.setColor(new Color(34, 177, 76));
        g.setStroke(new BasicStroke(4));
        g.drawOval(x,y,width, height);
        g.setStroke(new BasicStroke(1));
    }
}
