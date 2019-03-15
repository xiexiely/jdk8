package methodRe;

import java.util.function.Supplier;

/**
 * @Auther: 梓
 * @Date: 2019/3/8 16:53
 * @Description:
 */
public class StudentTest {

    public static void main(String[] args) {
        System.out.println("----------Supplier---");
        Supplier<Student> studentSupplier = () -> new Student();
        System.out.println(studentSupplier.get().getAge());
        System.out.println("---构造方法引用----");
        Supplier<Student> studentSupplier1 = Student::new;
        System.out.println(studentSupplier1.get().getName());
    }
}
