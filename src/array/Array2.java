package array;

public class Array2 {

    public static void main(String[] args) {
        /*같은 타입의 변수를 반복해서 선언하고,
         반복해서 사용하는 문제를 해결 -> 배열을 사용*/

        int[] students =  new int[]{90, 80, 70, 60, 50}; //배열 변수 선언, 배열 생성과 초기화.

        for (int i = 0; i < students.length; i++){
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
            // i + 1에 괄호를 안넣으면 문자 + 문자 로 인식됨. 괄호를 넣어 숫자를 먼저 계산해주기.
        }
        // 참조값 출력
        System.out.println(students);
    }
}
