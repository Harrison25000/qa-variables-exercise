// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String firstName = "Oliver";
//        String lastName = "Harrison";
//        String name = firstName + " " + lastName;
//        System.out.println(name);

//        int num1 = 20;
//        int num2 = 10;
//
//        int result =  num1 / num2;
//        int num3 = 8;

//        System.out.println(num1 + num2);
//        System.out.println(result);

//        System.out.println(num3++);
//        System.out.println(num3);
//        System.out.println(++num3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("First Name:");
        String firstName = scanner.nextLine();
        System.out.println("Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Hello " + firstName + " " + lastName);

        System.out.println("Two numbers:");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int total = int1+int2;

        System.out.println("Sum: " + total);






    }
}