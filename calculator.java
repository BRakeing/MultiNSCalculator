import java.util.List;

public class calculator {
    
    public static List<Integer> sequence(String oper) {

        int count = 0;

        for (int i = oper.length() - 1; i >= 0; i--) {
            if (oper.charAt(i) == ')') {
                count++;
            }
            if (oper.charAt(i) == '(') {
                count--;
            }

        }
        if (count != 0) {
            System.out.println("X");
        }


        return null;
    }

    public static List<Character> decoder(String in) {
        return null;
    }

}
