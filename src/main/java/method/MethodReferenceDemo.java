package method;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: 梓
 * @Date: 2019/3/8 21:19
 * @Description:
 */
public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("0","12");
        list.forEach(item -> System.out.println(item));
        list.forEach(System.out::print);

    }

}
