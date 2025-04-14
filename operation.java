import java.util.List;

public class operation {

    private double dA;
    private double dB;

    private int iA;
    private int iB;
    
    private char oper;

    public operation(int a, char operation) {
        this.iA = a;
        this.oper = operation;
    }
    public operation (int a, int b, char operation) {
        this.iA = a;
        this.iB = b;
        this.oper = operation;
    }
    public operation(double a, char operation) {
        this.dA = a;
        this.oper = operation;
    }
    public operation (double a, double b, char operation) {
        this.dA = a;
        this.dB = b;
        this.oper = operation;
    }

    public int resultInt() {
        return 0;
    }

    public double resultDouble() {
        return 0;
    }
}
