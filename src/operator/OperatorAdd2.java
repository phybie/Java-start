package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;
        int c = 0;

        b = ++a;
        System.out.println("a = " +a +", b = " +b);

        c = a++;
        System.out.println("a = " + a + ", c = " + c);
    }
}
