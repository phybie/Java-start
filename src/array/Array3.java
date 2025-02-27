package array;

public class Array3 {

    public static void main(String[] args) {
        int[] students =  {90, 80, 70, 60, 50}; //많이 생략됨. 자바가 int 배열로 추론함.
        /*
        int[] students;
        students = {90,80, 70, 60, 50}; 이거는 안 됨.
         */

        for (int i = 0; i < students.length; i++){
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
            // i + 1에 괄호를 안넣으면 문자 + 문자 로 인식됨. 괄호를 넣어 숫자를 먼저 계산해주기.
        }
        // 참조값 출력
        System.out.println(students);
    }
}
