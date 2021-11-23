package Arrays;

public class sample {
    public static void main(String[] args) {
        int[]  anArray = new int [10];
        long startTime = System.nanoTime();
        long endTime = 0;

        for (int i = 0; i < anArray.length; i++) {
            if(i  == 9){
                System.out.println(anArray[i]);
                endTime = System.nanoTime();
                System.out.printf("%s%d", "total time ===", endTime - startTime);
            }
        }
    }
}
