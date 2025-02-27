package array;

public class ArrayDi0 {

    public static void main(String[] args) {
        // 2*3 2차원 배열
        int[][] arr = new int[2][3];
        int value = 1;

        for (int row = 0; row < 2; row++){
            for (int col = 0; col < 3; col++){
                arr[row][col] = value;
                value++;
                System.out.print(arr[row][col] + " ");
            }
            System.out.println("");
        }
    }
}
