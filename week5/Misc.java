public class Misc {
    static int numHeads = 25;
    static int numTails = 6;
    static int sum = 0;
    static double value = -1.5;

    public static void main(String[] args) {
        sum = numHeads;
        System.out.println("sum = " + sum);

        numTails *= numHeads;
        System.out.println("numTails *= numHeads: " + numTails);

        numTails /= numHeads;
        System.out.println("numTails /= numHeads: " + numTails);

        sum = numTails--;
        System.out.println("sum = numTails--: " + sum + ", numTails: " + numTails);

        numTails = sum = (int) value;
        System.out.println("numTails = sum = (int)value: " + numTails);

        numTails = ++numHeads;
        System.out.println("numTails = ++numHeads: " + numTails);

        value += 2;
        System.out.println("value += 2: " + value);
    }
}
