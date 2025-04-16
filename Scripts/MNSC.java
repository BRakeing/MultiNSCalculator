package Scripts;

import java.util.Scanner;

public class MNSC {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Calculator.calcSetup();

        System.out.println(Calculator.sequence("!6"));

        in.close();
    }
}