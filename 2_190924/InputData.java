import java.util.Scanner;

public class InputData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj imię: ");
//        String name = scanner.next();//pobiera tekst z konsoli
//        System.out.print("Podaj wiek: ");
//        int age = scanner.nextInt();
//        System.out.println("Nazywam się " + name + " i mam " + age + " lat.");
        System.out.print("Wpisz dwa imiona: ");
        String names = scanner.nextLine();
        System.out.println("Wpisane imiona: " + names);
    }
}
