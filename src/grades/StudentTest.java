package grades;

public class StudentTest {
    public static void main(String[] args) {
     Student kat = new Student("kat");
     kat.addGrade(70);
     kat.addGrade(90);
     kat.addGrade(80);


//check if they work
        System.out.println(kat.getGrades());
        System.out.println(kat.getGradeAverage());
        System.out.println("kat.getName(\"kat\") = " + kat.getName("kat"));







        ;
    }

}
