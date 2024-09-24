package org.example;

import java.util.ArrayList;
import java.util.List;

public class WeekAverage {

    public int daysAbove(String input){
        int daysAbove = 0;
        double avg = 0;
        List<Integer> temperatures = new ArrayList<>();
        String[] values = input.split(" ");

        for(String str:values){
            Integer temperature = Integer.parseInt(str);
            temperatures.add(temperature);
        }

        for(Integer temperature:temperatures){
            avg += temperature;
        }

        if (avg > 0) avg = avg / temperatures.size();

        for (Integer temperature:temperatures){
            if (temperature > avg){
                daysAbove++;
            }
        }

        return daysAbove;
    }
}
