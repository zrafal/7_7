//Napisz program, który mnoży liczby nieparzyste. Liczba (5) kończy wprowadzanie danych:
//  - Program powinien wczytywać liczby całkowite wprowadzane przez użytkownika.
//  - Kontynuować wczytywanie liczb, mnożąc tylko nieparzyste, aż do wprowadzenia liczby 5.
//  - Wyświetlić iloczyn nieparzystych liczb.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int product = 1;
        boolean hasOddNumber = false;
         while (true) {
            System.out.print("Wprowadź liczbę całkowitą (wprowadź 5, aby zakończyć): ");
            int number = scanner.nextInt();
            if (number == 5) {
                break;
            }
            if (number % 2 != 0) { 
                product *= number;
                hasOddNumber = true;
            }
        }
        if (hasOddNumber) {
            System.out.println("Iloczyn nieparzystych liczb: " + product);
        } else {
            System.out.println("Nie wprowadzono żadnych nieparzystych liczb.");
        }
        scanner.close();
    }
}