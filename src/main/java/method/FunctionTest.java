package method;

import java.util.function.Function;

/**
 * @Auther: 梓
 * @Date: 2019/3/4 09:03
 * @Description:
 */
public class FunctionTest {

    public static void main(String[] args) {

        String info ="BFSQ201903130803648";
        String assetInfo =   info.substring(0,4);
        System.out.println("a:"+assetInfo);

        FunctionTest functionTest = new FunctionTest();
        System.out.println(functionTest.compute(1, value-> { return 2 * value; }));


        Function<Integer,Integer> function = value -> value * 2;
        System.out.println(functionTest.compute(4,function));

    }

    //传递行为
    public  int compute(int a , Function<Integer,Integer> function){

        int result = function.apply(a);

        return result;
    }

    //值传递
    public int method1(int a){
        return  2 * a;
    }
}
