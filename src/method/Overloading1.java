package method;

public class Overloading1 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1, 2, 3));
        System.out.println("3: " + add(1.9, 2));
        System.out.println("누가 호출된 것일까? : " + add(3, 2));
        //똑같은 것 먼저 찾고, 없으면 자동 형변환 되는 것을 찾는다. 따라서 1호출임.
    }

    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c){
        System.out.println("2번 호출");
        return a + b + c;
    }

    public static double add(double a, int b){
        System.out.println("3번 호출");
        return a + b;
    }
}
