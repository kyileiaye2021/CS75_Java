// Kyi Lei Aye
// Final Lab Project 

/**
 * The project is about School Management System that will allow students, teaching assistants,
 * and professors different access to school facilities. 
 */

package Final_Lab;
import java.util.Scanner;

/**
 * This is a placeholder for the properties of Professors and students
 */
abstract class People{
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
}
/**
 * This class is for students
 */
class Student extends People{
    public Student(String student_name, String student_email, int student_age, int student_id){
        super(student_name, student_email, student_age, student_id);
    }
    
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

        System.out.println(is_professor);

        People person;
        if(is_professor.equals("yes") || is_professor.equals("Yes")){
            person = new Professor(name, email, age, id);
        }
        else{
            person = new Student(name, email, age, id);
        }
        
        person.display();
        s.close();
        
    }

     
}
