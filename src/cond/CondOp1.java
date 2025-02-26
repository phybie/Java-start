package cond;

public class CondOp1  {

    public static void main(String[] args) {
        /* 이 예제는 참과 거짓에 따라 status 변수의 값이 달라짐,
        단순히 참 거짓에 따라 특정값을 구하는 경우 삼항 연산자 사용.
         */
        int age = 12;
        String status;
        if (age >= 18){
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = " + age + " status = " + status);
    }
}
