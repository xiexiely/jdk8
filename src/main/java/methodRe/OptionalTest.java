package methodRe;

import java.util.Optional;

/**
 * @Auther: 梓
 * @Date: 2019/3/8 20:25
 * @Description:
 */
public class OptionalTest {

    public static void main(String[] args) {

//        Optional<String> optional = Optional.of("hello");
        Optional<String> optional = Optional.empty();
        //取值
        if (optional.isPresent()){
            System.out.println(optional.get());
        }

        //推薦使用 構建一個為空的Optional
        optional.ifPresent(item -> System.out.println(item));
        System.out.println("---------------");
        System.out.println(optional.orElse("world"));
        System.out.println("----------------");
        System.out.println(optional.orElseGet(() -> "nihao"));




    }
}
