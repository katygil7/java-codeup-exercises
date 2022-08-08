import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int RandomNumber = (int) (Math.round(Math.random () * 99 ) + 1);
        int startFrom = 0;
        do {
            Scanner sc = new Scanner(System.in);
            int userNumber = sc.nextInt();
            System.out.println("Only have" + (5-(startFrom)) + "guesses left");
            if (userNumber > RandomNumber){
                System.out.println("Pick a lower number");
                startFrom ++;
            } else if (userNumber < RandomNumber) {
                System.out.println("Pick a higher number");
            }else {
                System.out.println("Yay, you guess right");
                startFrom = 10;
            }
        }
        while (startFrom < 10);
    }
}

