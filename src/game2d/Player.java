package game2d;

import game2d.internal.InternalPlayer;

import java.awt.*;

public class Player {
    private int width, height, movementSpeed;
    private Image playerImage;

    public Player(Image playerImage,int width, int height) {
        this.playerImage = playerImage;
        this.width = width;
        this.height = height;
        this.movementSpeed = 5;
    }

    public void setMovementSpeed(int speed){this.movementSpeed = speed;}

    public void moveWithWASD(boolean moveWithWASD){
        if (moveWithWASD){
            InternalPlayer.moveWithWasd(true);
        }
    }
}
