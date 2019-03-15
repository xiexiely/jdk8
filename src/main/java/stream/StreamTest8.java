package stream;

import java.util.stream.IntStream;

/**
 * @Auther: 梓
 * @Date: 2019/3/15 14:36
 * @Description:
 */
public class StreamTest8 {
    public static void main(String[] args) {
        /**
         * 有什么区别呢？
         */
        IntStream.iterate(0,i->(i+1) %2).distinct().limit(6).forEach(System.out::println);

        IntStream.iterate(0,i->(i+1) %2).limit(6).distinct().forEach(System.out::println);
    }
}
