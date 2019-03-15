package stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: 梓
 * @Date: 2019/3/13 16:34
 * @Description:
 */
public class StreamTest4 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world","hello world");

        //遍历流  先转换为数组 再遍历数组

        //字符串数组
        String[] stringsArrays  = stream.toArray(length -> new String[length]);
        // 方法引用
        //String[] stringsArray  = stream.toArray( String[]::new);
        //集合
        Arrays.asList(stringsArrays).forEach(System.out::print);

        //流转换成list
        Stream<String> stream1 = Stream.of("hello","world","hello world");
        List<String> list = stream1.collect(Collectors.toList());
        list.forEach(System.out::println);

        Stream<String> stream2 = Stream.of("hello","world","hello world");
        /**
         * 第一个要返回的集合
         * 第二个累加器 遍历stream的元素添加进去 1.要返回的集合 2.遍历的每一个元素
         * 第三个 2个list对象 ，addAll 将第二次遍历的list 添加到最终的list2里面 最终返回list1 == newArrayList()
         */
        List<String> list2 =   stream2.collect(() ->new ArrayList(),(theList,item)  -> theList.add(item),
                (theList1,theList2) -> theList1.addAll(theList2));
        list2.forEach(System.out::println);

        //LinkedList
        Stream<String> stream3 = Stream.of("hello","hello","hello world");
        List<String> list3 =   stream3.collect(LinkedList::new,LinkedList::add,LinkedList::addAll);
        list3.forEach(System.out::println);

        System.out.println();
        Stream<String> stringStream = Stream.of("hello1","2world","hello world");
        String concat = stringStream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.println(concat);

        System.out.println("----1----------");
        Stream<String> stringStream2 = Stream.of("hello1","2world","hello world");
        String concat2 = stringStream2.collect(Collectors.joining()).toString();
        System.out.println(concat2);

        System.out.println();
        System.out.println("--------------");
        Stream<String> stream4 = Stream.of("hello1 "," 2world","hello world");
        List<String> list1 =stream4.collect(Collectors.toCollection(() -> new ArrayList<>()));
        list1.forEach(System.out::print);

        System.out.println("---------------");
        Stream<String> stream5 = Stream.of("hello1","world","hello world");
        Set<String> set =stream5.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set.getClass().getName());
        set.forEach(System.out::println);




    }
}
