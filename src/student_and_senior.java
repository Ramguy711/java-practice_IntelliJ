public class student_and_senior {
    public static void main (String[] args) {
        ;
        Boolean isStudent = true;
        Boolean isSenior = true;
        double ticket_price = 300;
        if (isStudent) {
            System.out.println("you get 10% discount");
            ticket_price *= 0.9;

        }
        if(isSenior) {
            System.out.println("you get 30% discount");
            ticket_price *= 0.7;
        }
        else{
            System.out.println("no discount");
        }
        System.out.printf("the ticket_price is %.3f",ticket_price);
    }
}
