package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Auther: 梓
 * @Date: 2019/3/13 16:11
 * @Description:
 */
public class StreamTest3 {
    public static void main(String[] args) {

        //有一个整形类型的集合，List<Integer> 将每个数值*2  再把结果+起来

        List<Integer> list = Arrays.asList(1,2,9,4);

        //1.循环写法
        int sum =0;
        for(Integer i : list){
            sum += 2 * i;
        }
        System.out.println(sum);

        //2.Stream写法 转换值 一般使用 map 映射  累加 reduce
        Integer s = list.stream().map(i -> 2 * i).reduce(0, Integer::sum);
        System.out.println(s);

        User user1 = new User("梓","123");
        User user2 = new User("敬","456");

        List<User> userList = Arrays.asList(user1,user2);



    }

    static class User{

        private String name;

        private String password;

        public User(String name, String password) {
            this.name = name;
            this.password = password;
        }

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void add(){}


}
}
