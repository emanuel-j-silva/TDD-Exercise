package org.example;

import java.util.ArrayList;
import java.util.List;

public class WeekAverage {

    private static final int DAYS_OF_WEEK = 7;
    private static final String ERROR_MESSAGE = "Erro";


    public Object daysAbove(String input){
        if (!inputIsValid(input)){
            return ERROR_MESSAGE;
        }

        List<Integer> temperatures = inputToInteger(input);

        return calcDaysAbove(averageOf(temperatures), temperatures);
    }

    private boolean inputIsValid(String input){
        if (input == null || input.isEmpty() || input.contains("  ")) return false;

        String str = input.replaceAll("\\s","");
        char[] chars = str.toCharArray();

        for(Character c:chars){
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    private List<Integer> inputToInteger(String input){
        String[] values = input.split(" ");
        List<Integer> temperaturesOfInput = new ArrayList<>();

        for(String str:values){
            Integer temperature = Integer.parseInt(str);
            temperaturesOfInput.add(temperature);
        }

        return temperaturesOfInput;
    }

    private double averageOf(List<Integer> temperatures){
        double avg = 0;

        for (Integer temperature:temperatures){
            avg += temperature;
        }

        if (avg != 0){
            avg /= temperatures.size();
        }

        return avg;
    }

    private Object calcDaysAbove(double avg, List<Integer> values){
        if (values.size() != DAYS_OF_WEEK){
            return ERROR_MESSAGE;
        }

        int daysAbove = 0;
        for (Integer value:values){
            if (value > avg) daysAbove++;
        }

        return daysAbove;
    }
}
