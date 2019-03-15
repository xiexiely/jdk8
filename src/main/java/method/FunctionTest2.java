package method;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @Auther: 梓
 * @Date: 2019/3/4 10:48
 * @Description: 多个Function串联
 *  假如有2个输入 返回一个值  FUN粗体on无法做到  应该引用 BiFunction
 */
public class FunctionTest2 {

    public static void main(String[] args) {


        FunctionTest2 test2 = new FunctionTest2();
        System.out.println(test2.compute( 2,  value -> value * 3, value -> value * value));  //12
        System.out.println(test2.compute1(2, value -> value * 3 , value -> value * value));  //36

        System.out.println(new Date());
        System.out.println(LocalTime.now()  );

        System.out.println(test2.compute3(1,2,(value1 ,value2) -> value1 + value2 ));
        System.out.println(test2.compute3(1,2,(value1 ,value2) -> value1 - value2 ));
        System.out.println(test2.compute3(1,2,(value1 ,value2) -> value1 * value2 ));
        System.out.println(test2.compute3(1,2,(value1 ,value2) -> value1 / value2 ));

        System.out.println(test2.compute4(2,3,(value1,value2) -> value1+value2,(value) -> value * value));



    }

    public int compute (int a , Function<Integer,Integer> function1 , Function<Integer,Integer> function2){
        return  function1.compose(function2).apply(a);
    }

    public int compute1 (int a , Function<Integer,Integer> function1 , Function<Integer,Integer> function2){
        return  function1.andThen(function2).apply(a);
    }



    //定义一个四则运算
    public int add(int a , int b ){
        return  a + b;
    }
    //....

    //BiFunction方式
    public int compute3(int a , int b , BiFunction<Integer,Integer,Integer> biFunction){
        return biFunction.apply(a,b);
    }


    public int compute4(int a , int b ,BiFunction<Integer,Integer,Integer> biFunction,
                        Function<Integer,Integer> function){
        return biFunction.andThen(function).apply(a,b);
    }

}
