import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private JPanel jp;


    public MainWindow(JPanel panel) throws HeadlessException {
        this.jp = panel;
        this.setContentPane(jp);
    }

    public MainWindow() throws HeadlessException {
        this(new DrawPanel());
    }
}
