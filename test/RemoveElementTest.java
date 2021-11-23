import Arrays.RemoveElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void solutions() {
        int[] num = {3,2,2,3};
        int value = 2;


        int[] expected = {2,2};

        int k = RemoveElement.solutions(num, value);
        assertEquals(k, expected.length);
        for (int i = 0; i < k; i++) {
            assertEquals(num[i], expected[i]);
        }
    }
}