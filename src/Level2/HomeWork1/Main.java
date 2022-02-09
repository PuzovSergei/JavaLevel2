package Level2.HomeWork1;
import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) {


        Competitor[] competitors = {
                new Cat(600, 5),
                new Human(5000,1),
                new Robot(7000, 4)
        };
        Obstacle[] obstacles = {
                new Cross(700),
                new Wall(2)
        };

        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                if (!o.doIt(c)) {
                    break;
                }
            }
        }
    }
}
