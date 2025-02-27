package array.ex;

import java.util.Scanner;

public class ArrayEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int max, min;

        System.out.println(n + "개의 정수를 입력하세요: ");

        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        min = max = numbers[0];

        for (int number : numbers) {
            if (number < min){
                min = number;
            }
            else if (number > max){
                max = number;
            }
        }
        System.out.println("최솟값은 " + min + "입니다.");
        System.out.println("최대값은 " + max + "입니다.");
    }
}
