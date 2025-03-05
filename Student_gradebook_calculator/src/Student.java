
import java.util.ArrayList;
public class Student {
    private String name;
    private int studentID;
    private ArrayList<Double> grades;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        this.grades = new ArrayList<>();

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public ArrayList<Double> getGrades() {
        return grades;
    }
    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }
    public void addGrade(double grade) {
        this.grades.add(grade);
    }
    public double getAverageGrade() {
        if(grades.size() == 0) {
            return 0;
        }
        double sum = 0;
        for(double grade : grades) {
            sum += grade;
        }
        return sum / grades.size() ;

    }

    public boolean hasPassedGrade(){
        return getAverageGrade() >= 50;
    }
    public String toString() {

        return "Name: "+name + " Id: " + studentID + " Grade: " + grades + " Average: " + getAverageGrade() +" Results: " + (hasPassedGrade() ? "Passed" : "Failed") ;
    }
}
