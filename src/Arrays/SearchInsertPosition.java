package Arrays;

public class SearchInsertPosition {

    public static int solutions(int[] nums, int target){
        int expected = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                expected = i;
            }else if(target > nums[i]){
                return i+1;
            }else if(target == nums[0]){
                return 0;
            }
        }
        return expected;
    }
}
