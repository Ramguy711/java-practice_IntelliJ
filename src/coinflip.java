import java.util.Random;
public class coinflip {
    public static void main (String[] args){
    Random random = new Random();
    boolean Isheads;
    Isheads = random.nextBoolean();
            if(Isheads){
                System.out.println("it is heads");
            }else{
                System.out.println("it is tails");
            }

    }
}
