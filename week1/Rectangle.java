//import java.util.Scanner;

public class Rectangle {
    public int length;
    public int width;

    // Corrected method with return type
    public int calculateArea() {
        return length * width;
    }

    public static void main(string[] args ){
        Rectangle one =new Rectangle;
        Rectangle two =new Rectangle;
        Scanner inp =new Scanner(System.in);
        System.out.println("Enter length and width of 1 of rectangle");
        one.length= inp.nextInt();
        one.width= inp.nextInt();
        
        
        
        
        System.out.println("Enter lengthand width of 2 of rectangle");
        two.length= inp.nextInt();
        two.width= inp.nextInt();

        int area1=one.calculateArea;
        int area2=two.calculateArea;
        System.out.println("The areas are " + area1 + " and " + area2);
    

    }

}