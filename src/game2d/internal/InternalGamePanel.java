package game2d.internal;

import game2d.KeyHandler;

import javax.swing.*;
import java.awt.*;

/**
 * Class which extends JPanel, and implements Runnable for its run method
 * @version 1.0.0
 */
public class InternalGamePanel extends JPanel implements Runnable {
    Thread gameThread;
    KeyHandler keyHandler = new KeyHandler();
    // Set default position and movementSpeed for player
    int playerX = 100;
    int playerY = 100;
    int movementSpeed = 5;

    /**
     * Creates an InternalGamePanel which is a subclass of JPanel through Inheritance
     * setting a default size of 500x500
     */
    public InternalGamePanel(){
        this.setPreferredSize(new Dimension(500,500));
        this.setDoubleBuffered(true);

        this.addKeyListener(keyHandler);
        this.setFocusable(true);
    }

    /**
     * Creates an InternalGamePanel which is a subclass of JPanel through Inheritance
     * @param width the width of the InternalGamePanel
     * @param height the height of the InternalGamePanel
     */
    public InternalGamePanel(int width, int height){
        this.setPreferredSize(new Dimension(width,height));
        this.setDoubleBuffered(true);
        this.addKeyListener(keyHandler);
        this.setFocusable(true);
    }

    /**
     * starting the gameThread, by calling the run method of the thread
     */
    public void startMyGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    /**
     * provides a run method which updates and repaints information in a loop
     */
    public void run(){
        while (gameThread != null){
            // UPDATE: update information such as placement of elements
            update();
            // DRAW: draw the screen with the updated information
            repaint();
            System.out.println("The game loop is running");
        }
    }

    /**
     * method which updates information such as position of Player in case keys are pressed
     */
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

    /**
     * method which can paint / display objects on screen
     * @param g a class that has many functions to draw objects on the screen
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
    }
}
