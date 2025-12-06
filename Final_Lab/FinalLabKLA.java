// Kyi Lei Aye
// Final Lab Project 

/**
 * The project is about School Management System that will allow students, teaching assistants,
 * and professors different access to school facilities. 
 */

package Final_Lab;

/**
 * This is a placeholder for the properties of Professors and students
 */
abstract class People{
    String name;
    String email;
    int age;
    int id;

    People(String name, String email, int age, int id){
        this.name = name;
        this.email = email;
        this.age = age;
        this.id = id;
    }
    abstract String getRoleDescription();
    abstract void display();
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
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Professor ID: " + id);
    }
}
/**
 * This class is for students
 */
class Student extends People{
    public Student(String name, String email, int age, int student_id){
        super(name, email, age, student_id);
    }

    // Getter setter methods
    
    @Override
    String getRoleDescription(){
        return "Undergraduate";
    }
    @Override
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Professor ID: " + id);
        
    }

}
public class FinalLabKLA {

    public static void main(String[] args) {
        People david = new Professor("David", "david@eve.edu", 55, 123456);
        david.display();
        
    }

     
}
