package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("두 정수 덧셈 계산기입니다. 종료를 원하시면 두 수를 모두 0으로 입력해주세요.");
        while (true){
            System.out.print("첫 번째 숫자: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자: ");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            int sum = num1 + num2;
            System.out.println("두 수의 합은 " + sum + " 입니다");

        }
    }
}
