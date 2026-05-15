public class telephone {
   public static void main(String[] args) {
        char [][] telephones = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'#','0','*'}
        };
        for (char [] telephone : telephones) {
            for(char num : telephone) {
                System.out.print(num +" ");
            }
            System.out.println();
        }
    }
}
