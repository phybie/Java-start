package array;

public class EnhanceFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++){
            int num = numbers[i]; //인덱스로 num에 넣어서 num을 출력
            System.out.println(num);
        }

        //향상된 for문, for-each문
        for (int num : numbers){
            //numbers의 원소가 한 번씩 num에 복사됨. 각 반복마다 지역변수로서 새로 생성됨.
            //num의 scope는 반복문 안임. for문이 끝나면 메모리에서 사라짐.
            //각 반복마다 새로운 변수를 선언하는 것이 더 안전하고, 변수 의도를 명확하게 한다고 할 수 있음.
            /*int num; // ❌ 문법 오류 발생!
            for (num : numbers) {
            System.out.println(num);
            }
            */
            System.out.println(num);

            //for-each문을 사용할 수 없는 경우, 증가하는 index 값을 loop 안에서 직접 써야할 때.
            //증가하는 인덱스가 내부에 감춰져 있음.
            for (int i = 0; i < numbers.length; i++){
                System.out.println("numbers" + i + "의 결과는 : " + numbers[i]);
            }

            // 예를 들어 이런 for문은?
            int index = 0;
            for (int number : numbers){
                System.out.println(number);
                index++;
            }
            // index는 for문 내부에서 사용하는 애인데, 밖에서 선언되어 scope가 너무 넓음. 별로 좋지 않다.
            // 또한 주의할 점! 향상된 for문은 값을 복사해서 변수에 넣기 때문에 배열 자체 값을 변경시키지 않는다.
        }
    }
}
