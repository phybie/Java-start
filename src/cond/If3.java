package cond;

public class If3 {

    public static void main(String[] args) {
        int age = 14;

        //if문이 거짓일 때만, else if문을 겁사한다.
        //if문이 참이라면? else if를 실행하지 않는다.
        if(age <= 7){
            System.out.println("미취학");
        }
        else if (age <= 13){
            System.out.println("초등학생");
        }
        else if (age <= 16){
            System.out.println("중학생");
        }
        else if (age <= 19){
            System.out.println("고등학생");
        }
        else System.out.println("성인");
    }
}
