package project.models;

import java.util.logging.Logger;

public class Cat implements Moveable{
    private static final Logger log = Logger.getLogger(String.valueOf(Cat.class));
    @Override
    public void run() {
        log.info("Cat runs");
    }

    @Override
    public void jump() {
        log.info("Cat jumps");
    }
}
