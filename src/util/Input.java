package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input (){
        this.scanner = new Scanner(System.in);
    }
public String getString(){
    return scanner.nextLine();
    }
public boolean yesNo (){
    String userInput = this.scanner.nextLine();
    if ( userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
        return  true;
    }else{
        return false;
    }
}
    public int getInt(int min, int max){
        System.out.println("pick a number between" + min + "and" + max);
        int userNum = this.scanner.nextInt();
        if (userNum < min || userNum > max){
            System.out.println("ops pick another number");
            return getInt(min,max);
        }else{
            System.out.println(" great, you won");
            return userNum;
        }
    }

    public static void main(String[] args) {

        Input input = new Input();
        System.out.println(input.getString());
        System.out.println("Do you like pizza?");
        System.out.println(input.yesNo());
        System.out.println(input.getInt(1,10));
    }
}
