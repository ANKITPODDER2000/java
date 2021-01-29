package pack;
public abstract class life implements pro_life, per_life {
    String name , college;
    int age, salary;
    public life(String name , String college , int age , int salary){
        this.name = name;
        this.college = college;
        this.age = age;
        this.salary = salary;
    }
    public void pro_history(){
        System.out.println("Personal details :\n-------------------------------------------------");
        System.out.printf("Name : %s \t Age : %d\n\n",name,age);
    }

    public void per_history() {
        System.out.println("Professional life :\n-------------------------------------------------");
        System.out.printf("College name : %s \t Salary : %d lakh/CTC .\n", college, salary);
    }
    public abstract void history();
}