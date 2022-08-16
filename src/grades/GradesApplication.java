package grades;

import java.util.HashMap;

public class GradesApplication {


    public static void main(String[] args) {
        Student ben = new Student("Ben");
        ben.addGrade(60);
        ben.addGrade(80);
        ben.addGrade(70);

        Student valeria = new Student("Valeria");
        valeria.addGrade(90);
        valeria.addGrade(50);
        valeria.addGrade(80);

        Student john = new Student("John");
        john.addGrade(70);
        john.addGrade(60);
        john.addGrade(70);

        Student tom = new Student("Tom");
        tom.addGrade(66);
        tom.addGrade(89);
        tom.addGrade(79);

        HashMap<String, Student > students = new HashMap<>();

        students.put("benmarks", ben);
        students.put("valeria123", valeria);
        students.put("john345", john);
        students.put("tom678", tom);

        System.out.println(students.get(ben));

    }
}
