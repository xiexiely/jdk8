package methodRe;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Auther: 梓
 * @Date: 2019/3/2 14:02
 * @Description:
 */
public class Test1 {

    public static void main(String[] args) {

        //集合
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        System.out.println("----普通遍历list----");
        //普通遍历list
        for (int i = 0 ; i <list.size();i++){
            System.out.print(list.get(i));

        }
        System.out.println();
        System.out.println("----增强for循环---");

        //增强for循环
        for (Integer i : list){
            System.out.print(i);
        }
        System.out.println();
        System.out.println("----Consumer-----");

        //jdk8 Consumer 匿名内部类
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        });
        System.out.println();
        System.out.println("-----lambda-----");

        //jdk8 lambda 表达式
        list.forEach( (integer) -> {
            System.out.print(integer);
        });

        System.out.println();
        System.out.println("------方法引用------");
        list.forEach(System.out::print);
    }
}
