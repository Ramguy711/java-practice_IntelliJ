public class Employee extends Person {

    Double salary;

    Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    void Showsalary() {
        System.out.println(firstName + " Salary is: " + salary);
    }
}

