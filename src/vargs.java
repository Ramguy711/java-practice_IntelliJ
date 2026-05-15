import java.util.Scanner;

public class vargs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(average(12,31,43,53,14));


    }
    static double average(double... numbers){
    double  sum = 0;
    for(double num : numbers){
        sum += num;
    }
    return sum/numbers.length;
        }
}
