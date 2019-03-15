package methodRe;

import java.util.function.Supplier;

/**
 * @Auther: 梓
 * @Date: 2019/3/8 16:49
 * @Description:
 */
public class SupplierTest1 {

    public static void main(String[] args) {
        Supplier<String> supplier = () ->"hello World";
        System.out.println(supplier.get());
    }




}
