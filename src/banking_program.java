import java.util.Scanner;


public class banking_program {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean Isopen =true;
        System.out.println("what is your balance?");
        double balance = sc.nextDouble();
        while(Isopen){
        System.out.println("****************************");
        System.out.println("Welcome to the banking program");
        System.out.println("please enter your choice");
        System.out.println("1. Show balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("****************************");
        int choice = sc.nextInt();
        switch(choice){
            case 1 ->
                Balanceis(balance);

            case 2->
                Deposit(balance);

            case 3->
                Withdraw(balance);

            case 4->
                Isopen = false;

            default->
                System.out.println("Invalid choice");
        }

        }

    }
    static void Balanceis(double balance){
        if(balance < 0){
            System.out.println("Balance is negative");
        }
        else{
            System.out.println("Balance is $"+balance);
        }
    }
    static void Deposit(double balance){
        if(balance < 0){
            System.out.println("Balance is negative");
        }
        else{
            System.out.println("please enter the amount you want to deposit");
            double deposit = sc.nextDouble();
            balance = balance + deposit;
            System.out.println("your new amount is  $"+balance);
        }
    }
    static void Withdraw(double balance){
        if(balance < 0){
            System.out.println("Balance is negative");
        }
        else{
            System.out.println("please enter the amount you want to withdraw");
            double deposit =sc.nextDouble();
            balance = balance - deposit;
            System.out.println("your new amount is  $"+balance);
        }

    }
}
