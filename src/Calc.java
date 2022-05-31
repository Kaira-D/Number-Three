public class Calc {

    public static double ans;
    public static void calc(double numA, double numB, char symbol){
        switch (symbol) {
            case '+' -> ans = numA + numB;
            case '-' -> ans = numA - numB;
            case '*' -> ans = numA * numB;
            case '/' -> ans = numA / numB;
            default -> System.out.println("Error! Enter correct operator");
        }

        System.out.println("Result:" + ans);
    }

    public static void main(String[] args) {
        calc(12,5,'-');
    }

















}
