package org.example;

public class Main {
    public static void main(String[] args) {
        String input1 = "2 2 2 2 2 2 3";
        String input2 = "21 10 13 34 30 21 34";
        String input3 = "2 2 2 2 2 2 1";
        String input4 = "2 # 2 2 T 2 1";

        WeekAverage example1 = new WeekAverage();
        WeekAverage example2 = new WeekAverage();
        WeekAverage example3 = new WeekAverage();
        WeekAverage example4 = new WeekAverage();

        System.out.println(example1.daysAbove(input1));
        System.out.println(example2.daysAbove(input2));
        System.out.println(example3.daysAbove(input3));
        System.out.println(example4.daysAbove(input4));


    }
}