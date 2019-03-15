package method;

import lombok.Data;

import java.util.function.Predicate;

/**
 * @Auther: 梓
 * @Date: 2019/3/4 13:50
 * @Description:
 */
public class PredicateTest {

    public static void main(String[] args) {

//        Predicate<String> predicate = p -> p.length()>5;
//
//        System.out.println(predicate.test("hello1"));

        String isUsername = "hhh";
        Integer isPassword = 45;
        User user1 = new User();
        Predicate<String> userPredicate = (String username) -> username.equals(isUsername);
//        System.out.println(user1.getClass().getName());
        System.out.println(userPredicate.test("梓"));
    }

    @Data
   static class User{

        private String username;

        private Integer password;

    }

}
