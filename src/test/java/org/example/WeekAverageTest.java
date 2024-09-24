package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
public class WeekAverageTest {

    private WeekAverage weekAverage;
    private String input;

    @BeforeEach
    void setUp(){
        weekAverage = new WeekAverage();
    }

    @Test
    @DisplayName("Should return zero on input")
    void shouldReturnZero(){
        input = "0 0 0 0 0 0 0";

        assertThat(weekAverage.daysAbove(input)).isEqualTo(0);
    }

    @Test
    @DisplayName("Should return one in days above average calculation")
    void shouldReturnOne(){
        input = "2 2 2 2 2 2 3";

       assertThat(weekAverage.daysAbove(input)).isEqualTo(1);
    }

    @Test
    @DisplayName("Should return three in days above average calculation")
    void shouldReturnThree(){
        input = "21 10 13 34 30 21 34";

        assertThat(weekAverage.daysAbove(input)).isEqualTo(3);
    }

    @Test
    @DisplayName("Should return six in days above average calculation")
    void shouldReturnSix(){
        input = "2 2 2 2 2 2 1";

        assertThat(weekAverage.daysAbove(input)).isEqualTo(6);
    }

    @Test
    @DisplayName("Should return error when day count is less than seven")
    void shouldErrorLessThanSeven(){
        input = "1 1 1 2 3";

        assertThat(weekAverage.daysAbove(input)).isEqualTo("Erro");
    }

    @Test
    @DisplayName("Should return error when day count is greater than seven")
    void shouldErrorGreaterThanSeven(){
        input = "1 1 1 2 2 2 3 3 3";

        assertThat(weekAverage.daysAbove(input)).isEqualTo("Erro");
    }

    @Test
    @DisplayName("Should return error when input is null")
    void shouldErrorNull(){
        input = null;

        assertThat(weekAverage.daysAbove(input)).isEqualTo("Erro");
    }

    @Test
    @DisplayName("Should return error when input is empty")
    void shouldErrorEmpty(){
        input = "";

        assertThat(weekAverage.daysAbove(input)).isEqualTo("Erro");
    }

    @Test
    @DisplayName("Should return error when input is blank ")
    void shouldErrorBlank(){
        input = " ";

        assertThat(weekAverage.daysAbove(input)).isEqualTo("Erro");
    }
}
