package variable;

public class Var8 {

    public static void main(String[] args) {
        //정수
        byte b = 127; // -128~127
        short s = 32767; // -32768~32767
        int i = 2147483647; // -21억~21억

        long l = 9223372036854775807L;

        //실수
        float f = 10.0f; //f를 꼭 씀
        double d = 10.0; // 더블이 범위가 더 큼
        // 기본은 정수 int, 실수 double을 기본으로 쓴다.
        // 범위를 넘어가면 컴파일 오류 발생.
    }
}
