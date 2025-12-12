package Final_Exam;

class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person{
    String major = "Computer Sci";
    Student(String name, int age, String major){
        super(name, age);
        this.major = major;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }
}
public class final_exam {
    public static void main(String[] args) {
        Person p = new Person("Sam", 15);
        p.display();
        Student s = new Student("Sam", 15, "Computer Sci");
        s.display();
    }
    
}


