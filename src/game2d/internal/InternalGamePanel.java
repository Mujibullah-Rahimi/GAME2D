package game2d.internal;

import javax.swing.*;
import java.awt.*;

public class InternalGamePanel extends JPanel implements Runnable {
    Thread gameThread;

    // Constructors
    public InternalGamePanel(){
        this.setPreferredSize(new Dimension(500,500));
        this.setDoubleBuffered(true);
    }
    public InternalGamePanel(int width, int height){
        this.setPreferredSize(new Dimension(width,height));
        this.setDoubleBuffered(true);
    }

    public void startMyGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    public void run(){
        while (gameThread != null){
            // UPDATE: update information such as placement of elements
            update();
            // DRAW: draw the screen with the updated information
            repaint();
            System.out.println("The game loop is running");
        }
    }

    public void update(){

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
    }
}
