package university;

public class doctoralStudent extends salary implements studentManage,teacherManage {
    String name;
    String gender;
    int age;
    public doctoralStudent(String name,String gender,int age){
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    String getName(){
        return name;
    }

    String getGender(){
        return gender;
    }

    int getAge(){
        return age;
    }

    @Override
    public double getStudentFee() {
        return 0;
    }

    @Override
    public double checkStudentFee() {
        return 0;
    }

    @Override
    public double getTeacherSalary() {
        return 0;
    }

    @Override
    public double checkTeacherSalary() {
        return 0;
    }
}
