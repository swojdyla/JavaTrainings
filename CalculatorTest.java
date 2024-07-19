import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę, podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę, podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

      /*  int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber/secondNumber;
        int mod = firstNumber%secondNumber;*/

        System.out.println("Dodawanie " + calculator.add(firstNumber, secondNumber));
        System.out.println("Odejmowanie " + calculator.sub(firstNumber, secondNumber));
        System.out.println("Mnożenie " + calculator.mult(firstNumber, secondNumber));
        System.out.println("Dzielenie " + calculator.div(firstNumber, secondNumber));
        System.out.println("Modulo " + calculator.mod(firstNumber, secondNumber));

        }

    }


