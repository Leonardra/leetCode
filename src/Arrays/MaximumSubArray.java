package Arrays;

public class MaximumSubArray {


    public int solution(int[] nums){
        int sumOfSubArray = 0;
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sumOfSubArray += nums[i];
            maximum = Math.max(maximum, sumOfSubArray);
            if (sumOfSubArray < 0){
                sumOfSubArray =0;
            }
        }
        return maximum;
    }
}
