package stream;

import java.util.stream.IntStream;

/**
 * @Auther: 梓
 * @Date: 2019/3/13 16:05
 * @Description:
 */
public class StreamTest2 {

    public static void main(String[] args) {

        IntStream.of(new int[]{1,5,8,7,6}).forEach(System.out::print);
        System.out.println();
        System.out.println("----构造一个以3开头不包含8 3-8-----");
        IntStream.range(3,8).forEach(System.out::print);
        System.out.println();
        System.out.println("----构造一个以3开头包含8 3-8-----");
        IntStream.rangeClosed(3,8).forEach(System.out::print);

    }
}
