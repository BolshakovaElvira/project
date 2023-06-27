package project.models;

import java.util.logging.Logger;

public class Robot implements Moveable{
    private static final Logger log = Logger.getLogger(String.valueOf(Robot.class));
    @Override
    public void run() {
        log.info("Robot runs");
    }

    @Override
    public void jump() {
        log.info("Robot jumps");
    }
}
