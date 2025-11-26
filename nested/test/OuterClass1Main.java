package nested.test;

public class OuterClass1Main {
    public static void main(String[] args) {
        OuterClass1 outer = new OuterClass1();
        OuterClass1.NestedClass nested = new OuterClass1.NestedClass();
        nested.hello();
    }
}
