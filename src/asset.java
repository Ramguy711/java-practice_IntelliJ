import java.util.HashSet;

public class asset {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Random");
        set.add("Rakhi");
        set.add("Whale");
        set.add("Rakhi");//duplicate String
        set.add("Duplicate");

        System.out.println(set);
        set.remove("Duplicate");

        System.out.println(set);


    }
}
