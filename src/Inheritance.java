public class Inheritance {

    public static void main(String[] args) {

        Student student = new Student("Random", "Rand", 8.5);
        Employee employee = new Employee("Random", "Rand", 8.5);

        employee.Showsalary();
        student.display();
    }
}