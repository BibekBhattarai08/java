import java.util.Scanner;

public class array5b {
        private String[] arr;

        public array5b(int size) {
                arr = new String[size];
        }

        public static void main(String[] args) {

                Scanner inp = new Scanner(System.in);
                System.out.println("how long you want array to be? ");
                int size = inp.nextInt();

                array5b self = new array5b(size);
                System.out.println("enter" + self.arr.length + " names: ");
                for (int i = 0; i < self.arr.length; i++) {
                        self.arr[i] = inp.nextLine();
                }
                for (String names : self.arr) {
                        System.out.println(names);
                }
                inp.close();
        }

}
