package project.models;

import java.util.List;

public interface Moveable {

    void run();

    void jump();

    int getDistance();

    int getHeight();

    boolean overcome(Obstructive o);
}
