import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 2;

//        do{
////            i *= i;
////            i % 2 == 100;
//            System.out.println(i + " ");
//            i = (int) Math.pow(i,2);
//
//        }while (i <= 100000);


        for (int i = 1; i <= 100; i++){
            System.out.print("\n" + i + ".");
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print("fizzBuzz");
            } else if (i % 3 == 0){
                System.out.print("Fizz");
            }else if ( i % 5 == 0){
                System.out.print("Buzz");
            }
        }
        System.out.print("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to go up to?");
        String numInput = scanner.next();
        System.out.printf("%s \n Here is your table! \n", numInput);
        int num = parseInt(numInput);
        for (int j = 1; j <= num; j++) {
            System.out.printf("%s\t%s\t%s\n", j, Math.pow(j,2), Math.pow(j,3));
        }

//        System.out.print("\n");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input a numerical grade from 0 to 100:");
//        String  userInput = sc.next();
//        System.out.println("Do you want to continue Y[] N[]");
//        if (userInput ){

//        }




    }
}
