package project.models;

import java.util.List;
import java.util.logging.Logger;

public class Cat implements Moveable {
    private static final Logger log = Logger.getLogger(String.valueOf(Cat.class));

    private String name;
    private int distance;
    private int height;

    public Cat(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public void run() {
        log.info("Cat " + this.name + " run " + this.distance);
    }

    @Override
    public void jump() {
        log.info("Cat " + this.name + " jump " + this.height);
    }

    public void overcome(Obstructive o) {
        if (o instanceof Track) {
            if (getDistance() >= o.obstruct()) {
                log.info("Cat " + this.name + " can run");
            } else {
                log.info("Cat " + this.name + " cant run");
            }
        } else if (o instanceof Wall) {
            if (getHeight() >= o.obstruct()) {
                log.info("Cat " + this.name + " can jump");
            } else {
                log.info("Cat " + this.name + " cant jump");
            }
        }
    }

    public int getDistance() {
        return distance;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
}
