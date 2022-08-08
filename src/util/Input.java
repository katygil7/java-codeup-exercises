package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
public String getString(){
    return this.scanner.nextLine();
    }
public boolean yesNo (){
    String userInput = scanner.nextLine();
    if ( userInput.equalsIgnoreCase("yes")){
        return  true;
    }else{
        return false;
    }
}

    public static void main(String[] args) {
        System.out.println("Do you like pizza?");
        Input UserInput = new Input();
        System.out.println(UserInput.yesNo());
    }
}
