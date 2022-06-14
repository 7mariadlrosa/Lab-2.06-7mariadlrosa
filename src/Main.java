import java.util.Map;

public class Main {

    public static Map<String, Student> gradeIncreaser(Map<String, Student> studentMap){

        for(Student student : studentMap.values()) student.setGrade(student.getGrade() + student.getGrade()*0.1);
        return studentMap;
    }
    
    public static void main(String[] args) {
    }
}