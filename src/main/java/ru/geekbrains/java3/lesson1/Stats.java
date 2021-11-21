package ru.geekbrains.java3.lesson1;

public class Stats <T extends Number>{
    private T[] nums;

    public Stats(T... nums) { //varargs - перечисления
        this.nums = nums;
    }

    public double avg() {
        double sum = 0.0;
        for (int i=0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum/nums.length;
    }

    public boolean isSaveAvg(Stats<?> stats) {
        return Math.abs(this.avg() - stats.avg()) < 0.0001;
    }
}
