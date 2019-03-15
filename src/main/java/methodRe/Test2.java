package methodRe;

/**
 * @Auther: 梓
 * @Date: 2019/3/2 14:23
 * @Description:
 */
@FunctionalInterface
interface MyInterface {

    void test();

    String toString();
}

public class Test2 {

    public void myTest(MyInterface myInterface){
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test2 test = new Test2();
        test.myTest(new MyInterface() {
            @Override
            public void test() {
                System.out.println("myTest");
            }
        });

        System.out.println("-----------------");

        test.myTest(() -> {
            System.out.println("mytest11");
        });

        System.out.println("------------------");
        MyInterface myInterface = () -> {
            System.out.println("hello");
        };

        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);

    }
}