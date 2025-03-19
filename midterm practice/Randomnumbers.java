import java.util.Random;

public class Randomnumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            int num = 1 + rand.nextInt(99);
            sum = sum + num;
            System.out.println(num);

        }
        System.out.println("sum is" + sum);

    }

}
