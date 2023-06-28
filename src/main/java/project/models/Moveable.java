package project.models;

import java.util.List;

public interface Moveable {

    void run(int distance);

    void jump(int height);

    void overcome(List<Object> list);
}
