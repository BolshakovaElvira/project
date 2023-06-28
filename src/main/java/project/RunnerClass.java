package project;

import project.models.*;

import java.util.ArrayList;
import java.util.List;

public class RunnerClass {
    public static void main(String[] args) {

        Moveable human = new Human("Ivan", 5, 2);
        Moveable cat = new Cat("Barsik", 1, 1);
        Moveable robot = new Robot("IO-22", 9, 1);

        List<Moveable> players = new ArrayList<>();
        players.add(cat);
        players.add(robot);
        players.add(human);

        Track track = new Track(3);
        Wall wall = new Wall(1);
        Track track2 = new Track(4);
        //тут возможно стоит сделать интерфейс препядствующие или абстрактный класс Препядствие,
        // чтобы список был не из Object
        List<Object> bariers = new ArrayList<>();
        bariers.add(track);
        bariers.add(wall);
        bariers.add(track2);

        runGame(players, bariers);
    }

    public static void runGame(List<Moveable> players, List<Object> bariers) {
        for (Moveable player : players) {
            player.overcome(bariers);
        }
    }
}
