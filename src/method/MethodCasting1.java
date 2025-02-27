package method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5; //double을 int 매개변수에 대입하므로 컴파일 오류.
        printNumber((int)number); //명시적 형변환 double -> int

        int number2 = 1;
        printNumber2(number2); //자동 형변환
    }

    public static void printNumber(int n){
        System.out.println("숫자 : " + n);
    }

    public static void printNumber2(double n){
        System.out.println("숫자 : " + n);
    }
}
