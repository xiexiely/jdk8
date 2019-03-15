package method;

/**
 * @Auther: 梓
 * @Date: 2019/3/13 11:52
 * @Description:
 */
public class Student {

    private String name;

    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //排序方法[分数] 升序规则  -正 0 同 1倒序
    public static int compareStudentByScore(Student s1 ,Student s2){
        return s1.getScore() - s2.getScore();
    }

    //根据名字asrcl
    public static int compareStudentByName(Student s1 ,Student s2){
        return s1.getName().compareToIgnoreCase(s2.getName());
    }


    public  int compareByScore(Student student){
        return this.getScore() - student.getScore();
    }

    public  int compareBySName(Student student){
        return this.getName().compareToIgnoreCase(student.getName());
    }


}
