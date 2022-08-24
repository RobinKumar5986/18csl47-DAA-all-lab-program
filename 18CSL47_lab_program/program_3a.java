import java.util.Scanner;

public class program_3a {
    public static void main(String args[]) {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values for a and b");
        a = in.nextInt();
        b = in.nextInt();
        try {
            int c = a / b;
            System.out.println("The output is" + c);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not Possible!");
        }
        System.out.println("This will print out after Exception Handling");
    }
}