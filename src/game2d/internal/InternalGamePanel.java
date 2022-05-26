package game2d.internal;

import javax.swing.*;
import java.awt.*;

public class InternalGamePanel extends JPanel {

    public InternalGamePanel(){
        this.setPreferredSize(new Dimension(500,500));
    }

    public InternalGamePanel(int width, int height){
        this.setPreferredSize(new Dimension(width,height));
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
    }
}
