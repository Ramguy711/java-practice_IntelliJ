import java.util.Scanner;

public class nestedloop_min_pro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows colums and the symbol ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        String sym=sc.next();
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(sym+" ");

            }
            System.out.println();
        }
    }
}
