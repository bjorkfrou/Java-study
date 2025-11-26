package nested.test;

public class OuterClass4 {
    public void myMethod(){
        class LocalClass{
            public void hello(){
                System.out.println("hello");
            }
        }
        LocalClass local = new LocalClass();
        local.hello();
    }
}
