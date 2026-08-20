import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Division by Zero");
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        try {
            switch (choice) {

                case 1:
                    System.out.println("Result = " + calc.add(a, b));
                    break;

                case 2:
                    System.out.println("Result = " + calc.subtract(a, b));
                    break;

                case 3:
                    System.out.println("Result = " + calc.multiply(a, b));
                    break;

                case 4:
                    System.out.println("Result = " + calc.divide(a, b));
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}