public class array2 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("to print 10 to 10 in loop");
        for (int i = 0; i < 5; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("geometric projection of 2");
        int arr1[] = new int[10];
        int power = 1;
        for (int i = 0; i < arr1.length; i++) {

            power = power * 2;
            arr1[i] = power;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("geometric projection of 2 by last");
       
        }

    }

}
