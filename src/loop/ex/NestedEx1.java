package loop.ex;

public class NestedEx1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++){
            System.out.println("\n" + i + "단을 외우자");
            for (int j = 1; j <= 9; j++){
                System.out.println(i + "*" + j + " = " + i*j);
            }
        }
    }
}
