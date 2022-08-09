package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input (){
//        System.out.println("Type something");
        this.scanner = new Scanner(System.in);
    }
public String getString(){
    return scanner.nextLine();
    }
public boolean yesNo (){
    String userInput = getString();
    if ( userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
        return  true;
    }else{
        return false;
    }
}
    public int getInt(int min, int max){
        System.out.println("pick a number between" + " " + min + " " + "and" + " "+ max);
        int userNum = getInt();
        if (userNum < min || userNum > max){
            System.out.format("ops %s is not between the range" + " ", userNum);
            return getInt(min,max);
        }else{
            System.out.println(" great, you won");
            return userNum;
        }
    }
    public int getInt(){
        System.out.println("What is your favorite number");
        int favNum = this.scanner.nextInt();
        System.out.println("Great number");
        return favNum;
    }
//how to return nothing
    public double getDouble(double min, double max){
        System.out.println("type a decimal number between" + " " + min + " " + "and" + " " + max);
        double theirGuess = this.scanner.nextDouble();
        if( theirGuess < min || theirGuess > max){
            System.out.println("Decimal out of range");
            return getDouble(min, max);
        }else{
            System.out.println("awesome decimal");
            return theirGuess;
        }
    }
    public double getDouble(){
//        System.out.println("type PI value");
        double theirDecimal = this.scanner.nextDouble();
        return theirDecimal;
    }




}
