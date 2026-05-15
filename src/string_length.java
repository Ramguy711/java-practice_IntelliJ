import java.util.Scanner;

public class string_length {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("whats your email");
        String email =sc.next();

        if (email.contains("@")){
            String Username = email.substring(0,email.indexOf("@"));
            String address = email.substring(email.indexOf("@") + 1);
            System.out.println("your Username is " + Username);
            System.out.println("your address is " + address);
        }else {
            System.out.printf("your email must contain an address\n");
        }




    }
}
