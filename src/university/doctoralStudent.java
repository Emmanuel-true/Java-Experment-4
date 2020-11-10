package university;

public class doctoralStudent implements studentManage,teacherManage {
    private String name;
    private String gender;
    private int age;
    private double fee;
    private double salary;
    private double yFee;
    private double ySalary;
    private double tax;
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

    /**
     * this is what tax i use
     * salary tax% number
     * <5000   0%     0
     * <8000   3%     0
     * <17000  10%    210
     * <30000  20%    1440
     * <40000  25%    2660
     * <60000  30%    4410
     * <85000  35%    7160
     * >85000  40%    15160
     * */

    void setSalary(double salary){
        //set salary
        this.salary = salary;
    }

    void setFee(double fee){
        //set Fee
        this.fee = fee;
    }
    double getSalary(){
        //once year salary
        ySalary = salary * 12;
        return ySalary;
    }

    double getFee(){
        //once year Fee, because fee one year just twice so fee*2
        yFee = fee * 2;
        return yFee;
    }

    double getTax(){
        //should tax how much money
        double ntm;
        ntm =salary - yFee/12;
        if (salary <= 5000){
            tax = ntm;
        }else if(salary>5000&&salary<=8000){
            tax = (((ntm - 5000) * 0.03)-0);
        }else if(salary>8000&&salary<=17000){
            tax = (((ntm - 5000) * 0.10)-210);
        }else if(salary>17000&&salary<=30000){
            tax = (((ntm - 5000) * 0.20)-1410);
        }else if(salary>30000&&salary<=40000){
            tax = (((ntm - 5000) * 0.25)-2660);
        }else if(salary>40000&&salary<=60000){
            tax = (((ntm - 5000) * 0.30)-4410);
        }else if(salary>60000&&salary<=85000){
            tax = (((ntm - 5000) * 0.35)-7160);
        }else{
            tax = (((ntm - 5000) * 0.40)-15160);
        }
        return tax*12;
    }

    @Override
    public double getStudentFee() {
        return yFee;
    }


    @Override
    public double checkStudentFee() {
        return yFee;
    }

    @Override
    public double getTeacherSalary() {
        return ySalary - getTax();
    }

    @Override
    public double checkTeacherSalary() {
        return ySalary - getTax();
    }
}
