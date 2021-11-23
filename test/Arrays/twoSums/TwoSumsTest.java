package Arrays.twoSums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumsTest {

    @Test
    void twoSums() {
        //given
        int[] array = {2,7,11,13};
        int target = 9;
        //when
        int[] actual = TwoSums.solution(array, target);
        int[] expected = {0,1};
        //assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void bestTwoSums() {
        //given
        int[] array = {2,7,11,13};
        int target = 9;
        //when
        int[] actual = TwoSums.bestSolution(array, target);
        int[] expected = {0,1};
        //assert
        assertArrayEquals(expected, actual);
    }
}