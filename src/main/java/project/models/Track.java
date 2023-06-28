package project.models;

import java.util.logging.Logger;

public class Track implements Obstructive {
    private static final Logger log = Logger.getLogger(String.valueOf(Cat.class));
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int obstruct() {
        return getDistance();
    }
}
