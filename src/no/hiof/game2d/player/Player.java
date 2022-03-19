package no.hiof.game2d.player;

import no.hiof.game2d.Panel;
import no.hiof.game2d.GameObject;

import java.awt.image.BufferedImage;

public class Player implements GameObject {
    private String name;
    private BufferedImage image;

    public static void createPlayer(Panel panel,int positionX, int positionY,
                                    BufferedImage image){}

    public static void collisionArea(int fromLeft, int fromTop, int height, int width){}

    public static void addImage(BufferedImage image){}

    public static void setSize(int height, int width){}

    public static void moveWithWasd(int movementSpeed){}

    @Override
    public void draw(Panel panel, int positionX, int positionY) {

    }
}
