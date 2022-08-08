import java.util.Scanner;
//import java.lang;
public class MethodsExercises {

    public static void main(String[] args) {
        System.out.println(Addition(2,2));
        System.out.println(Subtraction(2,2));
        System.out.println(Multiplication(2,2));
        System.out.println(Division(2,2));
        System.out.println(LoopMultiplication(2,2));
        System.out.println(Recursion(8,2));
        System.out.println(Modulus(2,4));
        System.out.println(getInteger(1,10));


    }

    public static int Addition(int x, int y) {
        return x + y;
    }

    public static int Subtraction(int x, int y) {
        return x - y;
    }
    public static int Multiplication(int x, int y){
        return x * x;
    }
    public static int Division(int x, int y){
        return x / y;
    }
    public static int LoopMultiplication ( int x, int y){
        int z = 0;
        for (int i = 0; i < x; i++){
            z += y;
        }
        return z;
    }
    public static int Recursion(int x, int y){
        if (y > 0){
            return x + Recursion(x , y - 1);
        }else{
            return 0;
        }
    }
    public static int Modulus (int x, int y){
        return x % y;
    }

    public static int getInteger(int min, int max){
        int tracking = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 10: ");
            int userInputNum = scanner.nextInt();

            if (userInputNum >= min && userInputNum <= max) {
                System.out.println("Number is within range");
                System.out.println(userInputNum);
                tracking = 1;
            } else {
                System.out.println("Number not in range");
            }
        } while (tracking == 0);
        return tracking;
    }
//    public static int roll(int x, int y){
////        Random random =  new Random(y);
//        if (x =< 0){
//            x = 1;
//        }
//    }else {
//        for (int i = 1; i <= x; i++){
////            System.out.println("roll #" + i + "is" + Math.round(Math.random()) * y);
//        }
//    }



}
