import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {
        // Declare an object and initialize with
        // predefined standard input object
        Scanner scan = new Scanner(System.in);
        System.out.println("This program calculates the area "
                + "and the perimeter of a given triangle. ");
        System.out.println("Please enter the three lengths"
                + " of the triangle's sides");
        int a = scan.nextInt();//input first lengths
        int b = scan.nextInt();//input second lengths
        int c = scan.nextInt();//input third lengths
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("The numbers: " + a + ", " + b + " and " + c + " cannot represent a triangle");
        } else {// Check for equilateral triangle
            if (a == b && b == c)
                System.out.println("The numbers: " + a + ", " + b + " and " + c + " represent an equilateral triangle");

            // Check for isosceles triangle
            else if (a == b || b == c || c == a)
                System.out.println("The numbers: " + a + ", " + b + " and " + c + " represent an isosceles triangle");
            // Check for right-angle triangle
            else  if((a*a)+(b*b)==(c*c) || (a*a)+(c*c)==(b*b) || (b*b)+(c*c)==(a*a) )
                System.out.println("The numbers: " + a + ", " + b + " and " + c + " represent a right-angle triangle");
                else{// Otherwise common triangle
                    System.out.println("The numbers: " + a + ", " + b + " and " + c + " represent a common triangle");
                }
        }
    } // end of method main
} // end of class Triangle2