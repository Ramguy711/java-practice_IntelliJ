public class Student extends Person {

    double cgpa;

    Student(String firstName, String lastName, double cgpa){
        super(firstName, lastName); // call parent constructor
        this.cgpa = cgpa;
    }

    void display(){
        super.display(); // optional (reuse parent method)
        System.out.println("CGPA: " + cgpa);
    }
}