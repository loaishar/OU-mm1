import java.util.Scanner;

public class Triangle1 {
    public static void main(String[] args) {
        // Declare an object and initialize with
        // predefined standard input object
        Scanner scan = new Scanner(System.in);
        System.out.println("This program calculates the area "
                + "and the perimeter of a given triangle. ");
        System.out.println("Please enter the three lengths"
                + " of the triangle's sides");
        int a = scan.nextInt();// input first lengths
        int b = scan.nextInt();// input second lengths
        int c = scan.nextInt();// input third lengths

        double perimeter = a + b + c;// calculate perimeter
        double s = perimeter / 2; // half the circumference.
        double area = Math.sqrt(s * ((s - a) * (s - b) * (s - c))); // using Heron's formule
        System.out.println("The lengths of the triangle sides are:" + a + "," + b + "," + c);
        System.out.println("The perimeter of the triangle is:" + (int) perimeter);
        System.out.println("The area of the triangle is: " + area);

    } // end of method main
} // end of class Triangle