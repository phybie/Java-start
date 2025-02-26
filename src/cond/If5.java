package cond;
/*
문제
온라인 쇼핑몰의 할인 시스템을 개발해야 한다.
한 사용자가 어떤 상품을 구매할 때, 다양한 할인 조건에 따라
총 할인 금액이 달라질 수 있다.
각각의 할인 조건은 다음과 같다.
1. 아이템 가격이 만원 이상일 때, 천원 할인.
2. 나이가 10살 이하일 때, 천원 할인.

이 시스템의 핵심은 한 사용자가 동시에 여러 할인을 받을 수 있다는 점이다.
* */
public class If5 {

    public static void main(String[] args) {
        int price = 3000;
        int age = 10;
        int discount = 0;
        int count = 0;

        if(price >= 10000){
            discount += 1000;
            count++;
            System.out.println(count + ". 만원 이상 구매, 천원 할인");
        }
        if(age <= 10){
            discount += 1000;
            count++;
            System.out.println(count + ". 어린이 천원 할인");
        }

        System.out.println("받은 할인 " + count +"종. 총 할인 금액 = " + discount + "원");
    }
}
