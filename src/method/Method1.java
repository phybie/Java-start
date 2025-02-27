package method;

public class Method1 {

    public static void main(String[] args) {
        // 같은 연산을 두 번 수행.. function을 써보자.
        int a = 1;
        int b = 2;
        System.out.println(a + " + " + b + " 연산 수행");
        int sum1 = a + b;
        System.out.println(sum1);

        int c = 2;
        int d = 3;
        System.out.println(c + " + " + d + " 연산 수행");
        int sum2 = c + d;
        System.out.println(sum2);
    }
}
