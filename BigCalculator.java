import java.math.BigDecimal;
import java.util.Scanner;

public class BigCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Big Calculator!");
        System.out.println("Enter the first number:");
        BigDecimal num1 = new BigDecimal(scanner.nextLine());
        
        System.out.println("Enter the operation (+, -, *, /):");
        String operation = scanner.nextLine();
        
        System.out.println("Enter the second number:");
        BigDecimal num2 = new BigDecimal(scanner.nextLine());
        
        BigDecimal result = BigDecimal.ZERO;
        
        switch (operation) {
            case "+":
                result = num1.add(num2);
                break;
            case "-":
                result = num1.subtract(num2);
                break;
            case "*":
                result = num1.multiply(num2);
                break;
            case "/":
                if (num2.compareTo(BigDecimal.ZERO) == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1.divide(num2, BigDecimal.ROUND_HALF_UP);
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }
        
        System.out.println("The result is: " + result);
    }
}
