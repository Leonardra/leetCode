import Arrays.RemoveDuplicateElementsFromSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateElementsFromSortedArrayTest {

    @Test
    void solution() {
        int[] nums = {2,5,5,5,8,9};
        int k = RemoveDuplicateElementsFromSortedArray.solution(nums);
        int [] expected = {2,5,8,9};
        assertEquals(k, expected.length);
        for (int i = 0; i < k; i++) {
            assertEquals(nums[i], expected[i]);
        }
    }
}