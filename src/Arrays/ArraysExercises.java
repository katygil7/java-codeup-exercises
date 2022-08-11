package Arrays;

import java.awt.*;
import java.util.Arrays;

public class ArraysExercises {

    public static String [] People (){
        String [] person = new String[3];
        person[0] = "Kat";
        person[1] = "Ben";
        person[2] = "Daniel";
        return person;
    }

    public static void printPersonArray (String [] stringArray){
        for (int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
        }
    }
    public static String addPerson(String [] people, String newPerson){
        String [] newPeople = Arrays.copyOf(people,people.length + 1);
        newPeople [newPeople.length -1] = newPerson;

        return newPerson;
    }


    public static void main(String[] args) {

//      int[] numbers = {1, 2, 3, 4, 5};
//      System.out.println(Arrays.toString(numbers));
        String [] person = People();
        System.out.println(Arrays.toString(person));
        printPersonArray(People());
    }


}
