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

        List<Obstructive> bariers = new ArrayList<>();
        bariers.add(track);
        bariers.add(wall);

        runGame(players, bariers);
    }

    public static void runGame(List<Moveable> players, List<Obstructive> bariers) {
        for (int i = 0; i < players.size(); i++) {
            for (int j = 0; j < bariers.size(); j++) {
                players.get(i).isOvercomed(bariers.get(j));
            }
        }
    }
}
