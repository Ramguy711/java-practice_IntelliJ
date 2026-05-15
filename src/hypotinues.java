
import java.util.Scanner;
public class hypotinues {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("we are calculating the hypotnues so plese give the values of opposit and adjacent");
        System.out.println("enter the value of the opposit ");
        Double opposit = sc.nextDouble();
        System.out.println("enter the value of the adjacent ");
        Double adjacent = sc.nextDouble();
        Double hypotonues = Math.sqrt( Math.pow(opposit,2) + Math.pow(adjacent,2));
        System.out.println("the hypotonues is : " + hypotonues);
    }
}
