package university;

public class doctoralStudent extends salary implements studentManage,teacherManage {
    private String name;
    private String gender;
    private int age;
    public doctoralStudent(String name,String gender,int age){
        //new student....
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    String getName(){
        //System.out.println use
        return name;
    }

    String getGender(){
        //System.out.println use
        return gender;
    }

    int getAge(){
        //System.out.println use
        return age;
    }

    @Override
    public double getStudentFee() {
        //no use for because i put tax out
        return 0;
    }

    @Override
    public double checkStudentFee() {
        //no use for because i put tax out
        return 0;
    }

    @Override
    public double getTeacherSalary() {
        //no use for because i put tax out
        return 0;
    }

    @Override
    public double checkTeacherSalary() {
        //no use for because i put tax out
        return 0;
    }
}
