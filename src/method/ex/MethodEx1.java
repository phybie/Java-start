package method.ex;

import java.util.Scanner;

public class MethodEx1 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int balance = 0;

        while (true){
            showMenu();
            int amount;
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("입금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.println("출금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("현재 잔액 : " + balance + "원 입니다.");
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default :
                    System.out.println("메뉴를 다시 선택해주세요.");

            }

        }
    }

    public static void showMenu(){
        System.out.println("---------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 조회 | 4.종료");
        System.out.println("---------------------------");
        System.out.print("선택: ");
    }

    public static int deposit(int balance, int amount){
       return balance + amount;
    }

    public static int withdraw(int balance, int amount){
        return balance -  amount;
    }
}
