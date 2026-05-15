import java.util.ArrayList;
import java.util.Scanner;

public class studentman {

         int id;
         String name;
         int age;
         String gender;

    studentman(int id ,String name,int age,String gender ){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

}
class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<studentman> studentlist = new ArrayList <studentman>();
        studentlist.add(new studentman(01,"Random",20,"Male"));
        studentlist.add(new studentman(02,"Rakhi",23,"Female"));
        studentlist.add(new studentman(03,"whale",22,"Male"));
        studentlist.add(new studentman(04,"Tiger",19,"Male"));
        studentlist.add(new studentman(05,"Liger",18,"Male"));

        System.out.println("the student list");
        for(studentman student : studentlist){
            System.out.println("---------------------------------");
            System.out.println("id "+student.id);
            System.out.println("name "+student.name);
            System.out.println("age "+student.age);
            System.out.println("gender "+student.gender);
            System.out.println("---------------------------------");
            System.out.println("\n");
        }

        System.out.println("enter the student name you want to search \n");
        String name = sc.nextLine();

        Boolean found = false;
        for(studentman student : studentlist){
            if(student.name.equalsIgnoreCase(name)){
                System.out.println("student found");
                System.out.println("id "+student.id);
                System.out.println("name "+student.name);
                System.out.println("age "+student.age);
                System.out.println("gender "+student.gender);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("student not found");
        }
        sc.close();

    }
}

