import java.util.Scanner;
public class compounintrest {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
        System.out.println("plkease enter the Principal ,Intrest rate ,No of times intresdt rate is comppounded and time");
        System.out.println("Enter the  Principal ");
        Double Principal = sc.nextDouble();
        System.out.println("Enter the  Intrest rate ");
        Double Intrest_rate = sc.nextDouble();
        System.out.println("Enter the   No of times intresdt rate is comppounded " );
        Double  No_of_times_intresdt_rate_is_comppounded = sc.nextDouble();
        System.out.println("Enter the  time ");
        Double time = sc.nextDouble();
        Double Amount = Principal * Math.pow((1+Intrest_rate/No_of_times_intresdt_rate_is_comppounded),(time*No_of_times_intresdt_rate_is_comppounded));
        System.out.printf("the amount is %.3f ",Amount);


    }
}
