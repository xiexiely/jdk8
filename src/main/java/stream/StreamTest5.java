package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: 梓
 * @Date: 2019/3/14 15:12
 * @Description:
 */
public class StreamTest5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");

        //将集合里面的字母转为大写输出
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("------Map：映射----------------");
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        integerList.stream().map(item -> item * item ).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-----------flatMap : 扁平化映射 -------");
        //将每个list<Integer> 元素开平方 再整体输出
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1),Arrays.asList(2,3),Arrays.asList(4,5,6));
        stream.flatMap(theList ->theList.stream()).map(item -> item * item).forEach(System.out::println);

    }
}
