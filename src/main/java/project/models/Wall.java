package project.models;

import java.util.logging.Logger;

public class Wall extends Barier{
    private static final Logger log = Logger.getLogger(String.valueOf(Cat.class));
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }


    @Override
    public boolean isOvercomed(Moveable m) {

        m.jump();

        if (getHeight() <= m.getHeight()) {
            log.info("can jump");
            return true;
        } else {
            log.info("cant jump");
            return false;
        }
    }
}
