package elements;

import java.awt.*;

public class Sign extends DrawObject{
    public Sign(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    protected void mainDraw(Graphics2D g) {
        int dx, dy, tmpHeight, tmpWidth, tmpX, tmpY;
        // pile
        dx = width /8;
        tmpX = x + 2*dx;
        tmpWidth = width / 100 + 1;
        g.setColor(new Color(114, 107, 107));
        g.fillRect(tmpX, y, tmpWidth, height);
        g.fillRect(x + width - tmpWidth - 2*dx, y, tmpWidth, height);
        // table
        tmpHeight = height *2/ 3;
        g.setColor(new Color(12, 25, 192));
        g.fillRoundRect(x, y, width, tmpHeight, 10, 10);
        // while line
        dx = height / 12;
        dy = dx;
        tmpHeight = height *2/ 3;
        g.setColor(new Color(233, 243, 255));
        g.drawRoundRect(x + dx, y + dy, width - 2*dx, tmpHeight - 2*dy, 10, 10);
        // name
        dx = width / 12;
        dy = height / 12;
        tmpX = x + dx;
        tmpY = y + 5*dy;
        g.setColor(new Color(233, 243, 255));
        g.setFont(new Font("Times New Roman", Font.BOLD, 15));
        g.drawString("Озеро Квадратное", tmpX, tmpY);


    }
}
