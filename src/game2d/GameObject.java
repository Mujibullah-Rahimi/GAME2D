package game2d;

/**
 * Class for GameObjects
 * @version 1.0.0
 */
public class GameObject {
    public boolean isCollidable;

    /**
     * Creates a GameObject, and sets the object to not be collidable by default
     */
    public GameObject() {
        this.isCollidable = false;
    }
}
