package game2d.internal;

import game2d.GamePanel;

import javax.swing.*;
import java.awt.*;

public class InternalGameFrame extends JFrame {
    private InternalGamePanel panel;

    public InternalGameFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public InternalGameFrame(int width, int height, String title, GamePanel gamePanel){
        this.panel = gamePanel.getPanel();
        this.setTitle(title);

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
