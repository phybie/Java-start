package loop;

public class DoWhile1 {

    public static void main(String[] args) {

        int i = 10;
        int value = 3;

        do {
            System.out.println("숫자가 " + value + "보다 작을 때까지 출력하겠습니다");
            System.out.println("현재 숫자는 " + i);
            i++;
        }while (i < value);
    }
}
