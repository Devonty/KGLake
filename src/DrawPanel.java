import elements.*;
import path.MoveAround;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
    private final java.util.List<DrawAble> objectList = new ArrayList<>(){{
            add(new Lake(500, 20, 700, 500));
            add(new Flower(850, 230, 50, 30));
            add(new Flower(820, 235, 30, 20));
            add(new Flower(840, 255, 20, 15));
            add(new Bridge(100, 0, 160, 1000));
            add(new Sign(350, 50, 160, 80));
            add(new Bird(100, 0, 20, 40,
                    new MoveAround(new Point2D.Double(850, 260), 140, 0, Math.PI / 240d)));
            add(new Bird(100, 0, 20, 40,
                    new MoveAround(new Point2D.Double(850, 260), 110, Math.PI/3, Math.PI / 180d)));
            add(new Bird(100, 0, 20, 40,
                    new MoveAround(new Point2D.Double(850, 260), 80, Math.PI, Math.PI / 200d)));

    }};
    public DrawPanel() {

        Timer timer = new Timer(25, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timer.start();

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("(" + e.getX() + " " + e.getY() + ")");
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(new Color(67, 164, 60));
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        for(DrawAble object: objectList){
            object.update();
            object.draw(g);
        }
    }
}
