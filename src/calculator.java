import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter first number (or type exit to exit): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("exit)")) {
                break;

            }
            double num1 = parseInput(input);
            char operator = getOperator(scanner);
            double num2 = getNumber(scanner);

            double result = performCalculation(num1, num2, operator);
            if (result == (int) result) {
                System.out.println("Result: " + (int) result);
            } else {
                System.out.println("Result: " + result);
            }
        }

        scanner.close();
    }

    private static double parseInput(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number, defaulting to 0");
            return 0;
        }
    }

    private static char getOperator(Scanner scanner) {
        System.out.println("Enter an operator (+, -, *, /, %): ");
        return scanner.next().charAt(0);
    }

    private static double getNumber(Scanner scanner) {
        System.out.println("Enter second number: ");
        return scanner.nextDouble();
    }
    private static double performCalculation(double num1, double num2, char operator) {
        switch (operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            case '%': return num1 % num2;
            default:
                System.out.println("Invalid operator, defaulting to 0");
                return 0;

        }
    }

}
