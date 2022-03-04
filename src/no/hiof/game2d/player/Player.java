package no.hiof.game2d.player;

import no.hiof.game2d.Canvas;

import java.awt.image.BufferedImage;

public class Player {
    private String name;
    private BufferedImage image;

    public static void createPlayer(Canvas canvas, int positionX, int positionY,
                                    BufferedImage image){}

    public static void collisionArea(int fromLeft, int fromTop, int height, int width){}

    public static void addImage(BufferedImage image){}

    public static void setSize(int height, int width){}

    public static void moveWithWasd(int movementSpeed){}
}
