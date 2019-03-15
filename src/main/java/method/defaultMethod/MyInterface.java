package method.defaultMethod;

/**
 * @Auther: 梓
 * @Date: 2019/3/13 14:48
 * @Description:默认方法
 */
public interface MyInterface {

    default void myMythod(){
        System.out.println("MyMethod");
    }

}
