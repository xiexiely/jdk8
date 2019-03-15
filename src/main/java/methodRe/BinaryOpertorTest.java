package methodRe;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * @Auther: 梓
 * @Date: 2019/3/8 17:08
 * @Description:
 */
public class BinaryOpertorTest {


    public static void main(String[] args) {
        BinaryOpertorTest binaryOperator =  new BinaryOpertorTest();
        System.out.println(binaryOperator.compute(1,2,(value,value2) -> value + value2));


        System.out.println("------minBy--长度--------");
        System.out.println(binaryOperator.getShort("hello123","hello4567", (a,b) -> a.length() - b.length() ));
        System.out.println("------minBy--首字母--------");
        System.out.println(binaryOperator.getShort("hello","aorld",(a,b) ->a.charAt(0) - b.charAt(0)));
    }

    public int compute (int a ,int b , BinaryOperator<Integer> binaryOperator){
        return binaryOperator.apply(a,b);
    }

    public String getShort (String a ,String b,Comparator<String> comparator){
        return BinaryOperator.minBy(comparator).apply(a,b);
    }


}
