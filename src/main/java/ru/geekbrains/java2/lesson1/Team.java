package ru.geekbrains.java2.lesson1;

public class Team implements Jump, Run {
    private String name;
    private int maxRange;
    private int maxJump;

    public Team(String name, int maxRange, int maxJump) {
        this.maxRange = maxRange;
        this.maxJump = maxJump;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getMaxRange() {
        return maxRange;
    }

    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public void jumping(Wall wall) {
        if (wall.getHeight() <= getMaxJump())
            System.out.println(getName() + " смог перепрыгнуть препятствие высотой "
                    + wall.getHeight() + " метра");
        else System.out.println(getName() + " не смог перепрыгнуть препятствие высотой "
                + wall.getHeight() + " метров");
    }

    @Override
    public void runing(TreadMill treadMill) {
        if (treadMill.getRange() <= getMaxRange()) {
            System.out.println(getName() + " пробежал " + treadMill.getRange()
                    + " метров");
        } else {
            System.out.println(getName() + " не смог пробежать " + treadMill.getRange()
                    + " метров");
        }
    }


}
