package loop;

public class While2_1 {

    public static void main(String[] args) {

        int sum = 0;
        int i = 0;
        int endNum = 3;

        while (i < endNum){
            i++;
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
        }
    }
}
