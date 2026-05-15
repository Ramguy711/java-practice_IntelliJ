import java.util.ArrayList;
import java.util.HashMap;


public class SearchComparison {
    public static void main(String[] args) {

        // Arraylist begins
        ArrayList<String> random = new ArrayList<>();

        for (int i=0; i<10; i++) {
            random.add("student"+i);
        }

        boolean if_arrayfounda = false;

        for (String rand: random) {
            if(rand.equals("student9")){
                if_arrayfounda = true;
            }
        }
        /* so the above code os for 0(n) I.E the number of steps
        is directly equivalent to the size of input*/

        System.out.println("found in list " + if_arrayfounda);
    // arraylist ends

        //Hashmap begins
        HashMap<Integer,String> map = new HashMap<>();
        for (int i=0; i<10; i++) {
            map.put(i,"student"+i);
        }

        Boolean if_mapfounda = map.containsKey(6);
        System.out.println("found in Map " + if_mapfounda);

/* so the above code os for 0(1) I.E the number of steps
     does not matter */
        //Hashmap ends

    }

}
