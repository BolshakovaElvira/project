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
    public void run(int distance) {
        log.info("Robot " + this.name + " run " + distance);
    }

    @Override
    public void jump(int height) {
        log.info("Robot " + this.name + " jump " + height);
    }

    public void overcome(List<Object> list) {
        for (Object o : list) {
            if (o instanceof Wall) {
                if (this.height >= ((Wall) o).getHeight()) {
                    this.jump(((Wall) o).getHeight());
                    this.height -= ((Wall) o).getHeight();
                } else {
                    this.jump(this.getHeight());
                    this.height = 0;
                }
            } else {
                if (this.distance >= ((Track) o).getDistance()) {
                    this.run(((Track) o).getDistance());
                    this.distance -= ((Track) o).getDistance();
                } else {
                    this.run(this.getDistance());
                    this.distance = 0;
                }
            }
        }
    }

    public int getDistance() {
        return distance;
    }

    public int getHeight() {
        return height;
    }
}


