import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] foods = new String[3];
        int[] numbers = {1,3,5};
        boolean ifound = false;

        System.out.println("enter the number");
        int target = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                ifound = true;
                System.out.printf("the number %d is found in the position %d \n",target,i);
                break;
            }
            }
        if (!ifound) {
            System.out.println("the number is not found in the array");
        }

    }
}
