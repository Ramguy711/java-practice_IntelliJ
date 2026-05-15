import java.util.Scanner;

public class calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double result;
        System.out.println("enter the value of the 1st_operator");
        double a = sc.nextDouble();
        System.out.println("enter the value of the 2nd_operator");
        double b = sc.nextDouble();
        System.out.println("enter the value of the operent");
        char operent = sc.next().charAt(0);
        switch (operent){
            case '+'-> result= a+b;
            case '-'-> result= a-b;
            case '*'-> result= a*b;
            case '/'-> {
                if ( b==0){
                    System.out.printf("the value of %.2f %c %.2f = 0 ",a,operent,b);

                }
                    result= a/b;

            }
            case '^'-> result= Math.pow(a,b);
            case '%'-> result= a%b;
            default -> {
                System.out.println("enter a valid operend");
                return;
            }
        }
        System.out.printf("the value of %.2f %c %.2f = %.2f ",a,operent,b,result);


    }
}
