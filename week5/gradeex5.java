import java.util.Scanner;

public class gradeex5 {
    public static void main(String[] args) {
        // input grade for user
        System.out.println("Enter Number grade of student:");
        Scanner input = new Scanner(System.in);
        double marks = input.nextDouble();
        String letterGrade = " ";
        // convert to a letter grade
        if (marks > 100) {
            System.out.println("invalid entry!!! number > 100");
        } else if (marks >= 90) {
            letterGrade = "A+";
        }

        else if (marks >= 80) {
            letterGrade = "A";
        } else if (marks >= 75) {
            letterGrade = "B+";
        } else if (marks >= 70) {
            letterGrade = "B";
        } else if (marks >= 65) {
            letterGrade = "C+";
        } else if (marks >= 60) {
            letterGrade = "c";
        } else if (marks >= 50) {
            letterGrade = "D";
        } else if (marks < 50) {
            letterGrade = "F";
        } else {
            System.out.println("invalid input!!");
        }
        System.out.println("the grade is " + letterGrade);

    }
}