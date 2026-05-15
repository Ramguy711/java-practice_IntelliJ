import java.util.Scanner;

public class weightconverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 0 for pounds to kg and 1 for kg to pounds");
        Integer value = sc.nextInt();
        if(value==0){
            System.out.println("enter the value of pounds");
            double pounds= sc.nextInt();
            double KG = pounds*0.453592;
            System.out.printf("the value of %.3f lbs in kg is %.3f kg",pounds ,KG);
        }
        else if (value==1)
         {
            System.out.println("enter the value of KG");
            double KG= sc.nextInt();
            double pounds=KG * 2.20462;
            System.out.printf("the value of %.3f kg in pounds is %.3f lbs",KG ,pounds);
        }
        else {
            System.out.println("please enter 0 or 1");
        }
    }
}
