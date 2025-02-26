package loop;

public class Continue1 {

    public static void main(String[] args) {
        //1부터 5까지 출력하는데, 숫자가 3일 때는 출력을 건너뛰기.
        int i = 1;

        while (i <= 5){
            if (i == 3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
