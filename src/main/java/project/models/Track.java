package project.models;

import java.util.logging.Logger;

public class Track extends Barier{
    private static final Logger log = Logger.getLogger(String.valueOf(Cat.class));
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean isOvercomed(Moveable m) {

        m.run();

        if (getDistance() <= m.getDistance()) {
            log.info("can run");
            return true;
        } else {
            log.info("cant run");
            return false;
        }
    }
}
