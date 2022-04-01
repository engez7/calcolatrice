import java.util.Scanner;
import java.util.Locale;
import java.math.BigDecimal;

class Calculator {
  public static void main(String[] args) {

    char operator;
    BigDecimal number1, number2, result;

    // create an object of Scanner class
    //Scanner input = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    input.useLocale(Locale.US);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, / or %");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextBigDecimal();

    System.out.println("Enter second number");
    number2 = input.nextBigDecimal();

    switch (operator) {

      // performs addition between numbers
      case '+':
    	result = Operation.sum(number1, number2);
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = Operation.sub(number1, number2);
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = Operation.mul(number1, number2);
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = Operation.div(number1, number2);
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;
        
     // performs module between numbers
      case '%':
        result = Operation.mod(number1, number2);
        System.out.println(number1 + " % " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
    input.close();
  }
}