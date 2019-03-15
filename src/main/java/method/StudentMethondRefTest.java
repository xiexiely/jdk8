package method;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Auther: 梓
 * @Date: 2019/3/13 13:39
 * @Description:
 */
public class StudentMethondRefTest {

    public String getString(Supplier<String> supplier){
        return supplier.get()+"test";
    }

    public String getString2 (String str , Function<String,String> function){
        return function.apply(str);
    }

    public static void main(String[] args) {

        Student student1 = new Student("zhangsan",4);
        Student student2 = new Student("lisi",5);
        Student student3 = new Student("wangwu",3);
        Student student4 = new Student("zhaoliu",6);

        List<Student> studentList = Arrays.asList(student1,student2,student3,student4);

        //lambda 集合排序
        studentList.sort((s1,s2) -> Student.compareStudentByScore(s1,s2));
        studentList.forEach(student -> System.out.print(" "+student.getScore()));
        System.out.println();
        System.out.println("-----------1.类名::静态方法名-------------");
        //方法引用
        studentList.sort(Student::compareStudentByScore);
        studentList.forEach(student -> System.out.print(" "+student.getScore()));

        System.out.println();
        System.out.println("-----------2.引用(对象名)::实例方法名-------------");
        //lambda表达式写法
        StudentComparator studentComparator = new StudentComparator();
        studentList.sort((s1,s2)-> studentComparator.comparatorStudentByScore(s1,s2));
        studentList.forEach(student -> System.out.print(" "+student.getScore()));
        //方法引用
        studentList.sort(studentComparator::comparatorStudentByScore);
        studentList.forEach(student -> System.out.print(" "+student.getScore()));

        System.out.println();
        System.out.println("-----------3.类名::实例方法名-------------");
        //lambda表达式写法
        studentList.sort(Student::compareByScore);
        studentList.forEach(student -> System.out.print(" "+student.getScore()));
        System.out.println();
        System.out.println("-----------4.jdk自带的排序-------------");
        List<String> cities =Arrays.asList("qiandao","chongqing","tianjin","beijing");
//        Collections.sort(cities,(ctiy1,city2) -> ctiy1.compareToIgnoreCase(city2));
//        cities.forEach(city-> System.out.print(" "+city));
        //等价于
        Collections.sort(cities,String::compareToIgnoreCase);
        cities.forEach(city-> System.out.print(" "+city));

        System.out.println();
        System.out.println("-----------5.构造方法引用::类名::new-------------");
        StudentMethondRefTest studentMethondRefTest = new StudentMethondRefTest();
        System.out.println(studentMethondRefTest.getString(String::new));

        System.out.println(studentMethondRefTest.getString2("hello",String::new));

    }
}
