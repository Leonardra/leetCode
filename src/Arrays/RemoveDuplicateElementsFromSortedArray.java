package Arrays;

import java.util.Arrays;

public class RemoveDuplicateElementsFromSortedArray {

    public static int solution(int[] nums){
        int temp = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]){
                int temp2 = nums[temp];
                nums[temp] = nums[i+1];
                nums[i+1] = temp2;
                temp++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return temp;
    }
}
