package methodRe;

import java.util.*;

/**
 * @Auther: 梓
 * @Date: 2019/3/2 16:45
 * @Description:
 */
public class StringComparator {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("张三","李四","王五");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(names);

        System.out.println("---lambda----");

//        names.sort((item1 , item2) -> {
//            return item2.compareTo(item1);
//        });

        Collections.sort(names ,( o1 , o2) -> o2.compareTo(o1) );

        System.out.println(names);

        Collections.sort(names , Comparator.reverseOrder());
    }
}
