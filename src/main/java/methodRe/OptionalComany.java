package methodRe;

import methodRe.Comany;

import java.util.*;

/**
 * @Auther: 梓
 * @Date: 2019/3/8 20:46
 * @Description:
 */
public class OptionalComany {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("zhangshan");

        Employee employee1 = new Employee();
        employee1.setName("lisi");

        Comany comany = new Comany();
        comany.setName("comany1");

        List<Employee> employees = Arrays.asList(employee,employee1);
        comany.setEmployeeList(employees);

        //如果存在則返回，不存在返回空數組
//        List<methodRe.Employee> list = comany.getEmployeeList();
//        if (null != list){
//            return list;
//        }else
//            return new ArrayList<methodRe.Employee>();

        Optional<Comany> optional = Optional.ofNullable(comany);

        System.out.println( optional.map(theCompany -> theCompany.getEmployeeList())
                .orElse(Collections.emptyList()));



    }

    //不要試圖將Optional作為方法參數 或者在類中聲明optional的成員變量
    public void test(Optional optional){

    }
}
