import java.util.Scanner;
//array as field variable

public class array3 {
    private String arr[] = new String[6];

    public static void main(String[] args) {
        array3 self = new array3();

        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < self.arr.length; i++) {
            self.arr[i] = inp.nextLine();
        }
        for (int i = 0; i < self.arr.length; i++) {
            System.out.println(self.arr[i]);
        }
        // backward
        for (int i = self.arr.length - 1; i >= 0; i--) {
            System.out.println(self.arr[i]);

        }
        inp.close();
    }

}
