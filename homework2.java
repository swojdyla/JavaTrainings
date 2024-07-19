import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();

        if(age >= 18) {
            System.out.println("Dzięki za zakup alkoholu");
        } else {
            System.out.println("Gówniarzu, uworzoj!");
        }
    }
}
