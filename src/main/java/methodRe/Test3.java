package methodRe;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @Auther: 梓
 * @Date: 2019/3/2 15:36
 * @Description:
 */
public class Test3 {
    //java 函数式接口是对象
    public static void main(String[] args) {

        TheInterface li = () -> {};
        System.out.println(li.getClass().getInterfaces()[0]);

        TheInterface2 l2 = () -> {};
        System.out.println(l2.getClass().getInterfaces()[0]);

        //有一个list 每一个字母都是小写的 输出大写
        List<String> list = Arrays.asList("hello","world","hello world");

        //list.forEach( (type) -> { System.out.println(type.toUpperCase()); });

//        List<String> list2 = new ArrayList<>();  //diamond type 菱形语法
//
//        list.forEach( item -> { list2.add(item.toUpperCase());});
//        list2.forEach(item ->{ System.out.println(item); });

        //流方式编写
        list.stream().map(item -> item.toUpperCase()).forEach(item -> { System.out.print(" "+item); });
        System.out.println("------神仙-----");
        list.stream().map(String::toUpperCase).forEach(item -> System.out.print(" "+ item));
        System.out.println();

        Function<String,String> function = String::toUpperCase;
        System.out.println(function.getClass().getInterfaces()[0]);




    }
}

@FunctionalInterface
interface TheInterface {

    void myMethod();

}

@FunctionalInterface
interface TheInterface2{

    void myMethod2();
}
