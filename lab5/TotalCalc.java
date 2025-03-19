import java.util.Random;

public class TotalCalc {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(9) + 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;

        }
        System.out.println("sum is sum " + sum);
    }

}
