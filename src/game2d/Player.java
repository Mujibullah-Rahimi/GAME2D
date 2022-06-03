package game2d;

import game2d.internal.InternalPlayer;

import java.awt.*;

/**
 * Class representing a Player
 * @version 1.0.0
 */
public class Player {
    private int width, height, movementSpeed;
    private Image playerImage;

    /**
     * Creates a player with the parameters taken in, setting the default movementSpeed to 5
     * @param playerImage the image of the player inGame
     * @param width the width of the player
     * @param height the height of the player
     */
    public Player(Image playerImage,int width, int height) {
        this.playerImage = playerImage;
        this.width = width;
        this.height = height;
        this.movementSpeed = 5;
    }

    /**
     * Provides the function of setting and changing the movementSpeed
     * @param speed the movementSpeed of the player
     */
    public void setMovementSpeed(int speed){this.movementSpeed = speed;}

    /**
     * Method for making player movable with WASD-keys
     * @param moveWithWASD boolean for movement
     */
    public void moveWithWASD(boolean moveWithWASD){
        if (moveWithWASD){
            InternalPlayer.moveWithWasd(true);
        }
    }
}
