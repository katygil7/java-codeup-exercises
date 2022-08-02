public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 2;

        do{
//            i *= i;
//            i % 2 == 100;
            System.out.println(i + " ");
            i = (int) Math.pow(i,2);

        }while (i <= 100000);


    }
}
