package project.models;

import java.util.logging.Logger;

public class Human implements Moveable{
    private static final Logger log = Logger.getLogger(String.valueOf(Human.class));
    @Override
    public void run() {
        log.info("Human runs");
    }

    @Override
    public void jump() {
        log.info("Human jumps");
    }
}
