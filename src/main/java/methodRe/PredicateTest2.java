package methodRe;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Auther: 梓
 * @Date: 2019/3/8 14:47
 * @Description:
 */
public class PredicateTest2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        PredicateTest2 predicateTest2 = new PredicateTest2();
        //找到集合所有的奇数
        predicateTest2.conditionFilter(list,item ->item % 2 != 0);
        System.out.println("------------------");
        //找到集合所有的偶数
        predicateTest2.conditionFilter(list,item ->item % 2  == 0);
        System.out.println("------------------");
        //找到集合大于5的数
        predicateTest2.conditionFilter(list,item -> item > 5);
        System.out.println("------------------");
        //打印集合所有元素
        predicateTest2.conditionFilter(list,item -> true );
    }
    //函数式编程 传递行为不传递值 传递2个值 一个数组，第二个行为
    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate){
        for (Integer integer : list){
            if (predicate.test(integer)){
                System.out.print(" "+integer);
            }
        }
        System.out.println();
    }

    //面向对象
    public void findAllEven(List<Integer> list){

    }

}
