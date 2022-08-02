import java.sql.Struct;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        System.out.printf();
        System.out.format("The value of pi is approximately %.2f%n", pi);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String userInput = scanner.nextLine();
        System.out.printf("You entered %s \n", userInput);

//        clear the scanner

        scanner.nextLine();
        System.out.print("enter three words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("Your first word is %s\n second word is %s \n and third word is %s \n",firstWord,secondWord,thirdWord);

//   calculate perimeter:
        scanner.nextLine();
        System.out.println("Please enter the length and width: ");
        String width = scanner.nextLine();
        int number1 = parseInt(width);
        String height = scanner.nextLine();
        int number2 = parseInt(height);
        int total = number1 * number2;
        System.out.printf("The perimeter: %d \n", total);

    }

}
