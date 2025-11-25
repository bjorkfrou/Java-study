package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV2 {

    public static void hello(Process process){
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        // main() 메서드 안의 지역 클래스
        Process dice = new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };

        Process sum = new Process(){
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(i);
                }
            }
        };

        // 지역 클래스로 객체 생성해서 hello에 전달
        hello(dice);
        hello(sum);
    }
}