package Arrays;

import java.util.Arrays;

public class RemoveElement {

    public static int solutions(int[] nums, int val){
        int lastPositionOfNotVal = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                int temp = nums[i];
                nums[i] = nums[lastPositionOfNotVal];
                nums[lastPositionOfNotVal] = temp;
                lastPositionOfNotVal++;
            }
            else{
                nums[i] = -1;
            }
        }
        return lastPositionOfNotVal;
    }

    public static void main(String[] args) {
        int[] array = {0,1,2,2,3,0,4,2};
        int val = 2;
        int result = RemoveElement.solutions(array, val);
        System.out.println(Arrays.toString(array));
        System.out.println(result);
    }
}
