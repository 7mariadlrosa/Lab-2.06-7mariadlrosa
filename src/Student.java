public class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public void setGrade(double grade) {
        if(grade > 100){
            System.out.println("Grade cannot be 100+. 100 is set");
            this.grade = 100;
        } else {
            this.grade = grade;
        }
    }

    //GETTERS
    public String getName() {
        return name;
    }
    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}