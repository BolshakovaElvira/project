package project;

import project.models.Cat;
import project.models.Human;
import project.models.Moveable;
import project.models.Robot;

public class RunnerClass {
    public static void main(String[] args) {
        //зачем ссылочня переменная human имеет тип интерфейса Moveable,
        // если можно просто прописать Human human. В чем разница?
        Moveable human = new Human();
        Moveable cat = new Cat();
        Moveable robot = new Robot();

        runClasses(human,cat,robot);
    }

    public static void runClasses(Moveable ...moveables){
        for (Moveable m : moveables) {
            m.run();
            m.jump();
        }
    }
}
