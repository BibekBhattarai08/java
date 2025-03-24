import java.util.Scanner;

public class array5 {
    int arr[] = new int[6];

    public static void main(String[] args) {
        array5 self = new array5();
        System.out.println("please enter " + self.arr.length + " numbers");
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < self.arr.length; i++) {
            self.arr[i] = inp.nextInt();
        }
        System.out.println("");
        for (int num : self.arr) {

            System.out.println(num);
        }
        inp.close();
    }

}
