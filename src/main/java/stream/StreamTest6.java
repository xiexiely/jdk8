package stream;

import java.util.UUID;
import java.util.stream.Stream;
/**
 * @Auther: 梓
 * @Date: 2019/3/14 15:35
 * @Description:
 */
public class StreamTest6 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
        stream.findFirst().ifPresent(System.out::print);


        System.out.println("----z---------");
        Stream.iterate(1,item -> item +2).limit(1).forEach(System.out::println);

        //找出流中大于2的元素 然后将每个元素*2 然后忽略前2个元素 最后求出流中元素的总和。


    }
}
