import java.util.ArrayList;
import java.util.List;

public class calculator {

    static List<Character> listOfFunctionalCharacters = new ArrayList<>();

    public static void calcSetup() {
    }
    
    public static List<operation> sequence(String oper) {

        List<operation> listOfOper = new ArrayList<>();
        int count = 0;

        char cash = 266;
        System.out.println(cash);

        for (int i = oper.length() - 1; i >= 0; i--) {
            if (oper.charAt(i) == ')') {
                count++;
            }
            if (oper.charAt(i) == '(') {
                count--;
            }
            if (oper.charAt(i) == '!') {
                cash = '!';
            }

        }
        if (count != 0) {
            System.out.println("X");
        }


        return listOfOper;
    }

    public static List<Character> decoder(String in) {
        return null;
    }

}
