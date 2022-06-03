package game2d.internal;

import game2d.Keyhandler;

import javax.swing.*;
import java.awt.*;

public class InternalGamePanel extends JPanel implements Runnable {
    Thread gameThread;
    Keyhandler keyHandler = new Keyhandler();
    // Set default position for player
    int playerX = 100;
    int playerY = 100;
    int movementSpeed = 5;

    // Constructors
    public InternalGamePanel(){
        this.setPreferredSize(new Dimension(500,500));
        this.setDoubleBuffered(true);

        this.addKeyListener(keyHandler);
        this.setFocusable(true);
    }
    public InternalGamePanel(int width, int height){
        this.setPreferredSize(new Dimension(width,height));
        this.setDoubleBuffered(true);
        this.addKeyListener(keyHandler);
        this.setFocusable(true);
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
        if (keyHandler.wPressed){
            playerY -= movementSpeed;
        }
        else if (keyHandler.sPressed){
            playerY += movementSpeed;
        }
        else if (keyHandler.dPressed){
            playerX -= movementSpeed;
        }
        else if (keyHandler.aPressed){
            playerX += movementSpeed;
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.black);
        g2d.fillRect(playerX, playerY, 48, 48);
        g2d.dispose();
    }
}
