package grades;
import util.Input;

import java.util.ArrayList;


public class Student {
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(String name) {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
    public ArrayList<Integer> getGrades(){
       return this.grades;
    }

    public double getGradeAverage() {
        double total = 0;
        for (Integer grade : grades){
            total += grade;
        }
        return total/grades.size();
    }


}

