package Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void solutions() {
        int[] nums = {1};
        int value = 0;

        int expected = SearchInsertPosition.solutions(nums, value);

        assertEquals(0, expected);
    }
}