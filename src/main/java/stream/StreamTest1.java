package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Auther: 梓
 * @Date: 2019/3/13 16:01
 * @Description:
 */
public class StreamTest1 {

    public static void main(String[] args) {

        //流的创建方式 1
        Stream stream1 = Stream.of("hello","world","hello world");

        //流的创建方式 2
        String[] myArray = new String[]{"hello","world","hello world"};
        Stream stream2 = Stream.of(myArray);
        Stream stream3 = Arrays.stream(myArray);

        //流的创建方式 3 最常见
        List<String> list = Arrays.asList(myArray);
        Stream stream4 = list.stream();

    }
}
