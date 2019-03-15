package methodRe;

import lombok.Data;


/**
 * @Auther: 梓
 * @Date: 2019/3/8 16:52
 * @Description:
 */

public class Student {

    private String name = "zijing";

    private Integer age = 20;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(){

    }
}
