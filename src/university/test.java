package university;
import java.util.*;

public class test {
    public static void main(String[] args){
        //new two student
        doctoralStudent ds1 = new doctoralStudent("emmanuel","man",28);
        doctoralStudent ds2 = new doctoralStudent("asia","women",27);

        try{
            //Scanner input
            Scanner a = new Scanner(System.in);
            System.out.println("请输入第一位博士研究生的工资:");
            ds1.setSalary(a.nextDouble());
            System.out.println("请输入第一位博士研究生的学费:");
            ds1.setFee(a.nextDouble());
            System.out.println("请输入第二位博士研究生的工资:");
            ds2.setSalary(a.nextDouble());
            System.out.println("请输入第二位博士研究生的学费:");
            ds2.setFee(a.nextDouble());
        }catch (NumberFormatException a){
            //Exception use
            System.out.println("math only");
        }catch (Exception e){
            //Exception use
            System.out.println("math only");
        }

        System.out.println(" 名字:" + ds1.getName() + " 性别:"+ ds1.getGender() + " 年龄:" + ds1.getAge() + " 工资:"+ ds1.getSalary() + " 学费:" + ds1.getFee() + " 税:" + ds1.getTax());
        System.out.println(" 名字:" + ds2.getName() + " 性别:"+ ds2.getGender() + " 年龄:" + ds2.getAge() + " 工资:"+ ds2.getSalary() + " 学费:" + ds2.getFee() + " 税:" + ds2.getTax());
        System.out.println(" 名字:" + ds1.getName() + " 学费:" + ds1.checkStudentFee());
        System.out.println(" 名字:" + ds2.getName() + " 学费:" + ds2.checkStudentFee());
        System.out.println(" 名字:" + ds1.getName() + " 工资:"+ ds1.checkTeacherSalary());
        System.out.println(" 名字:" + ds2.getName() + " 工资:"+ ds2.checkTeacherSalary());


    }
}