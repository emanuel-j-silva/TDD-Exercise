package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
public class WeekAverageTest {

    @Test
    @DisplayName("Should return zero on input")
    void shouldReturnZero(){
        WeekAverage weekAverage = new WeekAverage();
        String input = "0 0 0 0 0 0 0";

        assertThat(weekAverage.daysAbove(input)).isEqualTo(0);
    }
}
