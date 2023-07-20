package cz.engeto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMatchingTest {
    private Find findNumber;

    private final Double MINIMAL_LIMIT1 = 11.0;

    private final Double MAXIMAL_LIMIT1 = 12.6;
    private final List<Double> LIST_OF_NUMBERS_TASK1 = Arrays.asList(12.0, 8.126, 6.0);


    private final Double MINIMAL_LIMIT2 = 8.0;

    private final Double MAXIMAL_LIMIT2 = 10.0;

    private final List<Double> LIST_OF_NUMBERS_TASK2 = Arrays.asList(12.0, 8.126, 9.0, 158.0, 6.0);


    @BeforeEach
    public void init() {

        findNumber = new Find();
    }

    @Test
    @DisplayName("task 1 : select a number that belongs to the selected limit")

    public void task1() {

        Double firstMatchingNumber = findNumber.findTheFirstNumberInLimit(LIST_OF_NUMBERS_TASK1,
                MINIMAL_LIMIT1, MAXIMAL_LIMIT1);
        assertEquals(12.0, firstMatchingNumber);


    }

    @Test
    @DisplayName("task 2 : select a number that belongs to the selected limit")
    public void task2() {

        Double firstMatchingNumber = findNumber.findTheFirstNumberInLimit(LIST_OF_NUMBERS_TASK2,
                MINIMAL_LIMIT2, MAXIMAL_LIMIT2);
        assertEquals(8.126, firstMatchingNumber);


    }

}
