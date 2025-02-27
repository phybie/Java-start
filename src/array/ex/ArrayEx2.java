package array.ex;

import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = 4;
        int subject = 3;
        String[] subjectsName = {"국어", "영어", "수학"};

        int[][] studentScore = new int[students][subject];
        int[] sum = new int[students];
        double[] scoreAverage = new double[students];

        for (int i = 0; i < students; i++){
            System.out.println((i + 1)+"번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < subject; j++){
                System.out.print(subjectsName[j] + " 점수 : ");
                studentScore[i][j] = scanner.nextInt();
                sum[i] += studentScore[i][j];
            }
            scoreAverage[i] = (double)sum[i] / subject;
            System.out.println("");
        }

        //인덱스를 써야하므로 일반 for문 돌림.
        for (int i = 0; i < students; i++){
            System.out.println((i + 1) + "번 학생의 총점: " + sum[i] + ", 평균: " + scoreAverage[i]);
        }
    }
}
