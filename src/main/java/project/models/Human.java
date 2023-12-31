package project.models;

import java.util.List;
import java.util.logging.Logger;

public class Human implements Moveable {
    private static final Logger log = Logger.getLogger(String.valueOf(Human.class));
    private String name;
    private int distance;
    private int height;

    public Human(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public void run() {
        log.info("Human " + this.name + " run " + this.distance);
    }

    @Override
    public void jump() {
        log.info("Human " + this.name + " jump " + this.height);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean overcome(Obstructive o) {
        if (o instanceof Track) {
            if (getDistance() >= o.obstruct()) {
                log.info("Human " + this.name + " can run " + ((Track) o).getDistance());
                return true;
            } else {
                log.info("Human " + this.name + " cant run. Still need " + (((Track) o).getDistance() - this.getDistance()));
                return false;
            }
        } else if (o instanceof Wall) {
            if (getHeight() >= o.obstruct()) {
                log.info("Human " + this.name + " can jump " + ((Wall) o).getHeight());
                return true;
            } else {
                log.info("Human " + this.name + " cant jump. Still need " + (((Wall) o).getHeight() - this.getHeight()));
                return false;
            }
        }
        return false;
    }

    public int getDistance() {
        return distance;
    }

    public int getHeight() {
        return height;
    }
}
