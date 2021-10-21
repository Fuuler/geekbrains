package ru.geekbrains.java2.lesson1;

public class Main {
    public static void main(String[] args) {
        Team[] teams = new Team[3];
        teams[0] = new Human("Human", 10000, 10);
        teams[1] = new Cat("Cat", 20000, 20);
        teams[2] = new Robot("Robot", 30000, 3);

        TreadMill treadmill = new TreadMill(300);
        Wall wall = new Wall(2);

        playMarathon(teams, treadmill, wall);
    }

    public static void playMarathon(Team[] team, TreadMill treadmill, Wall wall) {
        int stage;
        do {
            for (stage = 1; stage <= 3; stage++) {
                treadmill.setRange(treadmill.getRange() * stage);
                wall.setHeight(wall.getHeight() * stage);
                for (int i = 0; i < 3; i++) {
                    if (team[i].getMaxRange() < treadmill.getRange()) {
                        continue;
                    }
                    team[i].runing(treadmill);
                }
                for (int j = 0; j < 3; j++) {
                    if (team[j].getMaxJump() < wall.getHeight()) {
                        continue;
                    }
                    team[j].jumping(wall);
                }
                System.out.println("\n" + stage + " этап окончен" + "\n");
            }
        } while (stage == 3);
    }
}


