import java.util.Scanner;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<Student> students = new ArrayList<>();
System.out.println("Welcome to student grade calculator! ");
while(true) {
System.out.println("1. Add student: ");
System.out.println("2. Add Student's grades: ");
System.out.println("3. Show all students: ");
System.out.println("4. Calculate class average: ");
System.out.println("5. Exit: ");
System.out.println("Enter your choice: ");
int choice = sc.nextInt();

switch(choice) {
case 1:
System.out.println("Enter student name: ");
String name = sc.next();
System.out.println("Enter student id: ");
int id = sc.nextInt();

students.add(new Student(name, id));
System.out.println("Student added successfully! ");
break;
case 2:
    System.out.print("Enter student id: ");
    id = sc.nextInt();
    Student student = students.stream().filter(s -> s.getStudentID() == id).findFirst().orElse(null);
    if (student == null) {
        System.out.println("Student not found!");
    }
    else {
        for (int i = 0; i <= 1; i++) {
            System.out.println("Enter student grade:  ");
            int grade = sc.nextInt();
            student.addGrade(grade);
        }


    }
    System.out.println("Student grade added successfully! ");
    break;
    case 3:
        if (students.isEmpty()) {
            System.out.println("There are no students in the database!");
        }
        else {
            for (Student s : students) {
                System.out.println(s);
            }
            System.out.println();

        }
        break;
        case 4:
            double total = 0;
            for (Student s : students) {
                total = s.getAverageGrade();
            }
            System.out.print("Class average: " +total );
            break;
            case 5:
                System.out.println("Exit program");
                sc.close();
                System.exit(0);
                break;
                default:

                    System.out.println("Invalid choice!");
                    break;

            }




}
}
    }