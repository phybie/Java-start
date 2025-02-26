package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("더할 마지막 수를 입력한 뒤 0을 입력해주세요.");

        int i = 1;
        int sum = 0;

        while (true){
            System.out.print(i + " 번째 수 입력: ");
            int value = scanner.nextInt();

            if (value == 0){
                break;
            }
            sum += value;
            i++;
        }
        System.out.println(i + " 번째 수까지의 합은 " + sum + " 입니다.");
    }
}
