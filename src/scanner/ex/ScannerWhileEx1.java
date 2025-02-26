package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력: ");

        int sum = 0, count = 0;
        double average;

        while (true){
            int value = scanner.nextInt();

            if(value == -1){
                if(count < 2){
                    System.out.println("숫자를 두 개 이상 입력하세요");
                    continue;
                }
                break;
            }
            sum += value;
            count++;
        }
        average = sum / count; //int형과 int형의 나눗셈 결과는 int이므로 double casting 해주기.

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
