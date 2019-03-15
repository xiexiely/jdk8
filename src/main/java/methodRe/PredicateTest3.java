package methodRe;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Auther: 梓
 * @Date: 2019/3/8 15:14
 * @Description:
 */
public class PredicateTest3 {

    public static void main(String[] args) {
        //要求找出当前集合所有大于5 而且是偶数的集合
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        PredicateTest3 predicateTest3 = new PredicateTest3();
        System.out.println("------------AND----------------------");
        predicateTest3.conditonFilter(list,item -> item > 5 ,item -> item % 2 ==0);
        System.out.println("-------------OR----------------------");
        predicateTest3.conditonFilter2(list,item -> item > 5 ,item -> item % 2 ==0);
        System.out.println("-------------Negate------------------");
        predicateTest3.conditonFilter3(list,item -> item > 5 ,item -> item % 2 ==0);
        System.out.println("------------equls---------------------");
        String a = "test";
        if ("test".equals(a)){
            System.out.println(a);
        }
        System.out.println("----------------isEqual----------------");
        System.out.println(Predicate.isEqual("test").test("a"));
    }

    public void conditonFilter(List<Integer> list, Predicate<Integer> predicate,Predicate<Integer> predicate2){

        for(Integer integer : list){
            if (predicate.and(predicate2).test(integer)){
                System.out.print( " "+integer);
            }
        }
        System.out.println();
    }

    public void conditonFilter2(List<Integer> list, Predicate<Integer> predicate,Predicate<Integer> predicate2){

        for(Integer integer : list){
            if (predicate.or(predicate2).test(integer)){
                System.out.print(" "+integer);
            }
        }
        System.out.println();
    }

    public void conditonFilter3(List<Integer> list, Predicate<Integer> predicate,Predicate<Integer> predicate2){

        for(Integer integer : list){
            if (predicate.and(predicate2).negate().test(integer)){
                System.out.print(" "+integer);
            }
        }
        System.out.println();
    }

    public Predicate<String> isEqual (Object object){
        return Predicate.isEqual(object);
    }


}
