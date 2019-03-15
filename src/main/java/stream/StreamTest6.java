package stream;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.Stream;
/**
 * @Auther: 梓
 * @Date: 2019/3/14 15:35
 * @Description:
 */
public class StreamTest6 {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
//        stream.findFirst().ifPresent(System.out::print);
//
//        System.out.println("-------------");
//       Stream<Integer> integerStream = Stream.iterate(1,item -> item +2).limit(12);

        //找出流中大于2的元素 然后将每个元素*2 然后忽略前2个元素 最后求出流中元素的总和。
        //System.out.println(integerStream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).max());
      // integerStream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).max().ifPresent(System.out::print);

        //同时调用最大值 最小值 总和
//      IntSummaryStatistics summaryStatistics =  integerStream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();
//        System.out.println(summaryStatistics.getMin());
//        System.out.println(summaryStatistics.getMax());
//        System.out.println(summaryStatistics.getCount());

        /**
         * stream has already been operated upon or closed
         *      流一旦被使用就不能再操作或者流被关闭就不能再操作
         */
//        Stream<Integer> stream = Stream.iterate(1,item -> item +2).limit(6);
//        System.out.println(stream);
//        System.out.println(stream.filter(item -> item > 2 ));
//        System.out.println(stream.distinct());

        /**
         *  如何规避  推荐使用链式
         */
        Stream<Integer> stream = Stream.iterate(1,item -> item +2).limit(6);
        System.out.println(stream);
        Stream<Integer> stream1 = stream.filter(item -> item > 2);
        System.out.println(stream1);
        Stream<Integer> stream2 = stream1.distinct();
        System.out.println(stream2);



    }
}
