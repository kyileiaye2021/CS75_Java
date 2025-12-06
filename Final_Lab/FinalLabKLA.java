// Kyi Lei Aye
// Final Lab Project 

/**
 * The project is about School Management System that will allow students
 * and professors different access to school facilities. 
 */

package Final_Lab;
import java.util.Scanner;

/**
 * Interfaces
 */
interface IBorrowable{
    void book_borrowed(int books);
}
interface IPayable{
    double getSalary();
}
interface IGrader{
    void gradeStudent(Student s, double score);
}

/**
 * This is an abstract class 
 * THis class will hold placeholders for child classes
 */
abstract class People implements IBorrowable, IPayable, IGrader{
    // data members
    String name;
    String email;
    int age;
    int id;

    // Constructor
    People(String name, String email, int age, int id){
        this.name = name;
        this.email = email;
        this.age = age;
        this.id = id;
    }

    // abstract methods
    abstract String getRoleDescription();
    public abstract void book_borrowed(int books);
    public abstract double getSalary();
    public abstract void gradeStudent(Student s, double score);
    abstract void display();

    // Getter setter methods
    public void set_name(String name){
        this.name = name;
    }
    public void set_email(String email){
        this.email = email;
    }

    public String get_name(){
        return name;
    }
    public String get_email(){
        return email;
    }
    public int get_age(){
        return age;
    }

    public int get_id(){
        return id;
    }
}

/**
 * This class is for Professors
 * Each professor has name, email, age, professor id, and professor status.
 * Professors are paid, are allowed to grade students, and can borrow books.
 */
class Professor extends People{
    public Professor(String name, String email, int age, int professor_id){
        super(name, email, age, professor_id);
    }
    @Override
    String getRoleDescription(){
        return "Professor";
    }
    @Override
    void display(){
        System.out.println("Professor Name: " + name);
        System.out.println("Professor Email: " + email);
        System.out.println("Professor Age: " + age);
        System.out.println("Professor ID: " + id);
        System.out.println("Status: " + getRoleDescription());
        System.out.println();
    }

    @Override
    public double getSalary(){
        return 90000.00;
    }

    @Override
    public void gradeStudent(Student s, double score){
        System.out.println("Grade professor gave " + s.get_name() + ": " + score);
    }

    @Override
    public void book_borrowed(int books){
        System.out.println(this.name + " borrowed " + books + " books.");
    }
}
/**
 * This class is for students
 * Each student has name, age, email, student id, and undergrad status
 * Students are not paid or allowed to grade.
 * Students can borrow books.
 */
class Student extends People{
    // Constructor
    public Student(String student_name, String student_email, int student_age, int student_id){
        super(student_name, student_email, student_age, student_id);
    }
    
    // Overriding the abstract methods from parent abstract class
    @Override
    String getRoleDescription(){
        return "Undergraduate";
    }
    @Override
    void display(){
        System.out.println("Student Name: " + name);
        System.out.println("StudentEmail: " + email);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + id);
        System.out.println("Status: " + getRoleDescription());
        System.out.println();
    }

    @Override
    public double getSalary(){
        return 0.00;
    }

    @Override
    public void gradeStudent(Student s, double score){
        System.out.println("Students are not allowed to grade scores.");
    }

    @Override
    public void book_borrowed(int books){
        System.out.println(this.name + " borrowed " + books + " books.");
    }
}
public class FinalLabKLA {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Name: ");
        String name = s.nextLine();
        
        System.out.print("Email: ");
        String email = s.nextLine();

        System.out.print("Age: ");
        int age = s.nextInt();

        System.out.print("ID #: ");
        int id = s.nextInt();

        System.out.print("Are you a professor?: ");
        String is_professor = s.next();

        System.out.println();

        People person;
        // if the person is professor, create professor obj
        if(is_professor.equals("yes") || is_professor.equals("Yes")){
            System.out.println("Employee Info");
            System.out.println("----------------");
            person = new Professor(name, email, age, id);
        }
        // if the person is student, create student obj
        else{
            System.out.println("Student Info");
            System.out.println("----------------");
            person = new Student(name, email, age, id);
        }

        // This is an example student 
        Student stu = new Student("Paul", "paul21@eve.edu", 20, 234561);

        person.display();
        person.book_borrowed(5);
        person.gradeStudent(stu, 91.45);
        System.out.println(person.get_name() + " earned " + person.getSalary() + " a year.");

        s.close();
    }
}
