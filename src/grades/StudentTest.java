package grades;

public class StudentTest {
    public static void main(String[] args) {
     Student kat = new Student("kat");
     kat.addGrade(70);
     kat.addGrade(90);
     kat.addGrade(80);

     Student ben = new Student("ben");
     ben.addGrade(60);
     ben.addGrade(80);
     ben.addGrade(70);

        System.out.println(kat.getGrades());
        System.out.println(kat.getGradeAverage());
        System.out.println("kat.getName(\"kat\") = " + kat.getName("kat"));

        System.out.println(ben.getGradeAverage());
        System.out.println(ben.getGrades());
        System.out.println("ben.getName() = " + ben.getName(""));
    }

}
