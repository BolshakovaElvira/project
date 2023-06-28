package project.models;

import java.util.List;
import java.util.logging.Logger;

public class Robot implements Moveable {
    private static final Logger log = Logger.getLogger(String.valueOf(Robot.class));
    private String name;
    private int distance;
    private int height;

    public Robot(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public void run() {
        log.info("Robot " + this.name + " run " + distance);
    }

    @Override
    public void jump() {
        log.info("Robot " + this.name + " jump " + height);
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public int getHeight() {
        return height;
    }
}


