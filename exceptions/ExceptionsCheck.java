package exceptions;

import java.util.Scanner;

public class ExceptionsCheck {

    // pobierz wiek uzytownika, jesli bedzie mniejszy od zera to wyrzuc wyjatek InvalidAgeException
    //jezeli ma mniej niz 18 lat to mozemy wpisac ze jest pelnoletni

    public static void main(String[] args) throws IvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        if (age < 0) {
            throw new IvalidAgeException("Age is not valid");
        }
        if (age >= 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Nie jesteś pełnoletni");
        }
    }
}