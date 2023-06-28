package project.models;

import java.util.logging.Logger;

public class Wall implements Obstructive {
    private static final Logger log = Logger.getLogger(String.valueOf(Cat.class));
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }


    @Override
    public int obstruct() {
        return getHeight();
    }
}
