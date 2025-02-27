package method;

public class Method1Ref {

    public static void main(String[] args) {
        // 같은 연산을 두 번 수행.. function을 써보자.
        int sum1 = add(1, 3);// 메서드에 넘기는 값(=인수)과 파라미터의 타입, 순서, 개수가 맞아야한다.
        System.out.println(sum1);
        int sum2 = add(4, 20);
        System.out.println(sum2);
        int sum3 = add (0403, 3737);
        System.out.println(sum3);
    }

    //메서드 선언부(제어자, 반환 타입, 파라미터는 옵션 등을 포함). 메서드를 호출하는 곳에서 알 수 있는 부분
    public static int add(int a, int b){
        //메서드 본문은 메서드를 호출하는 곳에서 알지 못함(블랙박스)
        System.out.println(a + " + " + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }// 메서드 호출이 끝나면, a,b,sum은 모두 사라짐
}
