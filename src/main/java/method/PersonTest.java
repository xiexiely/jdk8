//package method;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.BiFunction;
//import java.util.stream.Collectors;
//
///**
// * @Auther: 梓
// * @Date: 2019/3/4 11:49
// * @Description:
// */
//public class PersonTest {
//
//    public static void main(String[] args) {
//
//        Person person1 = new Person("zhangsan",10);
//        Person person2 = new Person("lisi",20);
//        Person person3 = new Person("wangwu",130);
//        Person person4 = new Person("liulu",150);
//
//
//        List<Person> personList = Arrays.asList(person1,person2,person3,person4);
//
//        //根据用户的名字 作为查询条件 输出
//        PersonTest personTest = new PersonTest();
//        List<Person> personResult = personTest.getPersonByUsername("zhangsan",personList);
//        personResult.forEach(person -> System.out.println(person.getUsername()));
//
//        List<Person> personResult1 = personTest.getPersonByAge(20,personList);
//        personResult1.forEach(person -> System.out.println(person.getAge()));
//
//
//        List<Person> personResult3 = personTest.getByAge2(20,personList,(age,persons) ->{
//            return personList.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());
//        });
//        personResult3.forEach(person -> System.out.println(person.getAge()));
//
//
//        List<Person> personResult4 = personTest.getByAge2(20,personList,(age,persons) ->
//                personList.stream().filter(person -> person.getAge() < age)
//                                   .collect(Collectors.toList()));
//        personResult4.forEach(person -> System.out.println(person.getAge()));
//
//    }
//
//
//    public List<Person> getPersonByUsername(String username,List<Person>persons){
//        return persons.stream().filter(person -> person.getUsername().equals(username))
//                .collect(Collectors.toList());
//    }
//
//    public List<Person> getPersonByAge(Integer age , List<Person> persons){
////        BiFunction<Integer,List<Person>,List<Person>> biFunction = (ageOfPerson,personList) -> {
////            return personList.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());
////        };
//        BiFunction<Integer,List<Person>,List<Person>> biFunction = (ageOfPerson,personList) ->
//                personList.stream().filter(person -> person.getAge() > ageOfPerson)
//                        .collect(Collectors.toList());
//        return biFunction.apply(age,persons);
//    }
//
//
//    public List<Person> getByAge2(int age,List<Person>persons,BiFunction<Integer,List<Person>,List<Person>> biFunction){
//        return biFunction.apply(age,persons);
//    }
//
//}
