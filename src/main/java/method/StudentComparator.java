package method;

/**
 * @Auther: 梓
 * @Date: 2019/3/13 13:57
 * @Description:
 */
public class StudentComparator {

    public int comparatorStudentByScore(Student s1,Student s2){
        return s1.getScore() - s2.getScore();
    }

    public int comparatorStudentByName(Student s1 , Student s2 ){
        return s1.getName().compareToIgnoreCase(s2.getName());

    }

}
