package Scripts;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    static List<Character> listOfFunctionalCharacters = new ArrayList<>();

    public static void calcSetup() {
        for (int i = 0; i < Filer.readFile("specialCharecters.txt").size(); i++) {
            listOfFunctionalCharacters.add(Filer.readFile("specialCharecters.txt").get(i).charAt(0));
        }
    }
    
    public static List<Operation> sequence(String oper) {

        List<Operation> listOfOper = new ArrayList<>();
        int count = 0;

        char cash = 60000;
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
