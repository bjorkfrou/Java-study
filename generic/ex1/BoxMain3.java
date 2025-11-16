package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer=" + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("문자");
        String str = stringBox.get();
        System.out.println("str =" + str);
    }
}
