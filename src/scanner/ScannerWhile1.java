package scanner;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("문자열을 입력하세요 (종료는 exit 입력)");
            String str = scanner.nextLine();
            if (str.equals("exit")){
                System.out.println("프로그램 종료");
                break;
            }
            System.out.println(str);
        }
    }
}
