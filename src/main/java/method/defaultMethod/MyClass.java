package method.defaultMethod;

/**
 * @Auther: 梓
 * @Date: 2019/3/13 14:50
 * @Description:
 */
public class MyClass   implements MyInterface,MyInterface2 {

    @Override
    public void myMythod() {
        MyInterface.super.myMythod();
        MyInterface2.super.myMythod();
        System.out.println("Myclass");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMythod();
    }

}
