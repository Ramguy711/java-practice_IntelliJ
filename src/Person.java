public class Person {

    String firstName;
    String lastName;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void display(){
        System.out.println("Name: " + firstName + " " + lastName);
    }
}