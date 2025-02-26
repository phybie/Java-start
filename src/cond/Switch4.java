package cond;

public class Switch4 {

    public static void main(String[] args) {
        /* 자바 14 이상 새로운 switch문
        기존의 switch문과 다르게 값을 반환할 수 있는 형태임
        주의 반환 값을 바로 coupon에 대입하므로 마지막에 ; 빼먹지 않아야 함.
         */

        int grade = 2;

        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
