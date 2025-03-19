import java.util.Random;

public class random {
    public static void main(String[] args) {
        double num;
        int count = 0;
        Random rnd = new Random();
        while (true) {
            num = rnd.nextDouble();
            if (num > 0.99) {
                break;
            }
            count++;
        }
        System.out.println(num);
        System.out.println(count);
    }

}
