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

    public int factorial(int n) {
        int out = 1;
        for (int i = n; i > 1; i--) {
            out *= i;
        }
        return out;
    }

    public double factorial(double n) {
        double out = 1;
        for (double i = n; i > 1; i--) {
            out *= i;
        }
        return out;
    }

    public int resultInt() {
        int out = 0;
        switch (oper) {
            case '!':
                out = factorial(iA);
                break;
        
            default:
                break;
        }
        return out;
    }

    public double resultDouble() {
        return 0;
    }
}
