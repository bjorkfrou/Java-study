package collection.array;

public class MyArrayListV3BadMain {

    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();
        //숫자만 입력하기 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("3");
        System.out.println(numberList);

        Integer num1 = (Integer) numberList.get(0);

    }
}
