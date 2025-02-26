package operator;

import com.sun.security.jgss.GSSUtil;

public class Operator1 {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int diff = a - b;
        System.out.println("a - b = " + diff);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        int div = a / b; // int형 연산의 결과는 int형
        System.out.println("a / b = " + div);

        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
