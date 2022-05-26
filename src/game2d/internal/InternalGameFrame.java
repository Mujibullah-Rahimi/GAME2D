package game2d.internal;

import javax.swing.*;
import java.awt.*;

public class InternalGameFrame extends JFrame {
    private JPanel panel;

    public InternalGameFrame(){
        panel = new InternalGamePanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public InternalGameFrame(int width, int height){
        panel = new InternalGamePanel(width, height);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void setFrameSize(int width, int height){
        this.setPreferredSize(new Dimension(width, height));
    }
}
