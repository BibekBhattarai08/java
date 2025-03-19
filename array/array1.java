public class array1 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 1;
        arr[5] = 5;
        arr[6] = 1;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        System.out.println("array are" + arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("length is " + arr.length);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }

}
