# Java-Experment-4
## 北京石油化工学院第四次实验
######  2020322091 计G202 张昊宇

## 1. 实验目的
1. 掌握Java中抽象类和抽象方法的定义； 
2. 掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
3. 了解异常的使用方法，并在程序中根据输入情况做异常处理
### 内容

1. 某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。

2. 设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。

3. 编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额

---

## 2. 实验要求
- [x]  1. 在 博士研究生类实现各个接口定义的抽象方法;
- [x]  2. 对年学费和年收入进行统计，用收入减去学费，求得纳税额；
- [ ] 3. 国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
- [x] 4. 实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
- [x] 5. 根据输入情况，要在程序中做异常处理。

---

## 3.实验设计(包含关键方法)
1. 设计接口
```java
public interface teacherManage {
    double getTeacherSalary();
    //teacher's Salary
    double checkTeacherSalary();
    //teacher can check salary
```
2. 求出纳税额/12 按月算该缴税多少
```java
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
```
3. 税算法
```java
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
        return tax;
```
4. Scanner + try catch
```java

        try{
            //Scanner input
            Scanner a = new Scanner(System.in);
            System.out.println("请输入第一位博士研究生的工资");
            ds1.setSalary(a.nextDouble());
            System.out.println("请输入第一位博士研究生的学费");
            ds1.setFee(a.nextDouble());
            System.out.println("请输入第二位博士研究生的工资");
            ds2.setSalary(a.nextDouble());
            System.out.println("请输入第二位博士研究生的学费");
            ds2.setFee(a.nextDouble());
        }catch (NumberFormatException a){
            //Exception use
            System.out.println("math only");
        }
```

---

## 4.图
![流程图](https://github.com/Emmanuel-true/Java-Experment-4/blob/main/Screenshot%202020-11-09%20055559.png)
![包图](https://github.com/Emmanuel-true/Java-Experment-4/blob/main/Package%20university.png)

---

## 5.运行结果
```
请输入第一位博士研究生的工资
100000
请输入第一位博士研究生的学费
2000
请输入第二位博士研究生的工资
100000
请输入第二位博士研究生的学费
2000
名字:emmanuel 性别:man 年龄:28 工资:1200000.0 学费:4000.0 税:22706.66666666667
名字:asia 性别:women 年龄:27 工资:1200000.0 学费:4000.0 税:22706.66666666667
```

---

## 6.感想与体会

1. 头一次写计算税的算法卡了很长时间，~~可能现在还没写对~~
2. 好久没用scanner了，卡了一段时间
3. 这个项目我感觉用JavaScript可能更好写






