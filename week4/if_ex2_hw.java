import java.util.Random;

public class if_ex2_hw {
    public static void main(String[] args) {

        Random num = new Random();
        int attempt = 0;
        double a;

        while (true) {
            a = num.nextDouble();

            if (a > 0.99) {

                break;

            }
            attempt++;
        }
        System.out.println("congrats" + a + " in " + attempt);

    }
}
