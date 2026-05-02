import java.util.Scanner;

public class temperature {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        double value = sc.nextDouble();
        System.out.println("enter C for celcius");
        System.out.println("enter F for Faragnight");
        String unit=sc.next().toUpperCase();
       double newtemp= (unit.equals("C"))? (value * 9/5) + 32 : (value - 32) * 5/9;
        System.out.printf("the new temperature is %f",newtemp);
    }
}
