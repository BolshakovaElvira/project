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
        Wall wall = new Wall(2);

        //тут возможно стоит сделать интерфейс препядствующие или абстрактный класс Препядствие,
        // чтобы список был не из Object
        List<Barier> bariers = new ArrayList<>();
        bariers.add(track);
        bariers.add(wall);

        runGame(players, bariers);
    }

    public static void runGame(List<Moveable> players, List<Barier> bariers) {
        for (int i = 0; i < bariers.size(); i++) {
            for (int j = 0; j < players.size(); j++) {
                if(bariers.get(i) instanceof Wall){
                    ((Wall) bariers.get(i)).isOvercomed(players.get(j));
                }
                if (bariers.get(i) instanceof Track){
                    ((Track) bariers.get(i)).isOvercomed(players.get(j));
                }
            }
        }
    }
}
