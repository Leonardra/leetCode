package Arrays.twoSums;

import java.util.HashMap;

public class TwoSums {

    public static int[] solution(int[] array, int target){
        int[] result = new int[2];
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j <= array.length-1; j++) {
                if(array[j] + array[i] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] bestSolution(int[] array, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int remainder =  target - array[i];
            if(map.containsKey(remainder)){
                result[0] = map.get(remainder);
                result[1] = i;
            }else{
                map.put(array[i], i);
            }
        }
        return result;
    }
}
