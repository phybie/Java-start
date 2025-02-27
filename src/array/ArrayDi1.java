package array;

public class ArrayDi1 {

    public static void main(String[] args) {
        // 2*3 2차원 배열
        int[][] arr = new int[][]{
                {1, 2, 3}, // 0행
                {4, 5, 6}, // 1행
                {7, 8, 9}
                // arr.length 는 행의 개수이다.
                // 열의 개수는 arr[0].length = arr[1].length 이다.
        };

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println("");
        }
    }
}
