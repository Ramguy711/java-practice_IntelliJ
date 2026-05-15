import java.util.HashMap;

public class Hashmap {
     public static void main(String[] args) {

         HashMap<String,Integer> Student = new HashMap<>();

         Student.put("A",1);
         Student.put("B",2);
         Student.put("C",3);
         Student.put("D",4);
         Student.put("E",4);

         System.out.println("the student and their rollnumbers are"+Student);

         for (String key : Student.keySet()) {
             System.out.println(Student.get(key));
         }

         System.out.println( Student.containsKey("E"));;




     }


}
