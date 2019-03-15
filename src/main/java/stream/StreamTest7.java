package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: 梓
 * @Date: 2019/3/15 14:24
 * @Description: 中间操作与终止操作的区别
 */
public class StreamTest7 {

    public static void main(String[] args) {
        /**
         *  将集合元素 取出首字母改成大写 其他不变
         */
        List<String> list = Arrays.asList("hello","world","hello world");
//        list.stream().map(item -> item.substring(0,1).toUpperCase() + item.substring(1))
//                .forEach(System.out::println);

        /**
         *  如果流没有终止操作 就不会执行
         */
        list.stream().map(item -> {
            String result = item.substring(0,1).toUpperCase()+ item.substring(1);
            System.out.println("test");
            return result;
        }).forEach(System.out::println);



    }


}
