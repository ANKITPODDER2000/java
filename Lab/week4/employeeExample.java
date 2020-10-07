import java.util.Scanner;
abstract class employee{
	String name;
	int code,basic_salary,age;
	char grade;
	abstract int nextsalary();
	void displayDetails(){
		System.out.printf("Employee's name : %s\ncode : %d\nGrade : %c\nAge : %d\n",name,code,grade,age);
	}
}

class Manager extends employee{
	int da,hra,ca,med_ins;
	Manager(String name , int code , char grade,int age ,int basic_salary,int da,int hra){
		super.name = name;
		super.code = code;
		super.grade = grade;
		this.age = age;
		super.basic_salary = basic_salary;

		this.da = da;
		this.hra = hra;
	}
	int nextsalary(){
		int s = this.basic_salary + this.da + this.hra;
		return s;
	}
	void displayDetails(){
		System.out.println("Manager's Details :\n==========================");
		super.displayDetails();
		System.out.printf("salary : %d\n",nextsalary());
	}
}

class Clerk extends employee{
	int da,hra;
	Clerk(String name , int code , char grade,int age ,int basic_salary,int da,int hra){
		super.name = name;
		super.code = code;
		super.grade = grade;
		this.age = age;
		super.basic_salary = basic_salary;

		this.da = da;
		this.hra = hra;
	}
	int nextsalary(){
		int s = this.basic_salary + this.da + this.hra;
		return s;
	}
	void displayDetails(){
		System.out.println("Clerk's Details :\n==========================");
		super.displayDetails();
		System.out.printf("salary : %d\n",nextsalary());
	}
}

class employeeExample{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int code , salary,da,hra,ca,med_ins,age;
		char grade;
		
		System.out.print("Enter employee name : ");
		name = sc.nextLine();
		System.out.print("Enter employee grade : ");
		grade = sc.nextLine().charAt(0);
		System.out.print("Enter employee code ,age , basic salary , da & hra : ");
		code = sc.nextInt();
		age = sc.nextInt();
		salary = sc.nextInt();
		da = sc.nextInt();
		hra = sc.nextInt();
		Manager emp1 = new Manager(name,code,grade,age,salary,da,hra);
		emp1.displayDetails();
		System.out.println("Employee's salary : "+emp1.nextsalary());


		System.out.print("Enter clerk name : ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter employee grade : ");
		grade = sc.nextLine().charAt(0);
		System.out.print("Enter employee code ,age , basic salary , da & hra  : ");
		code = sc.nextInt();
		age = sc.nextInt();
		salary = sc.nextInt();
		da = sc.nextInt();
		hra = sc.nextInt();
		Clerk emp2 = new Clerk(name,code,grade,age,salary,da,hra);
		emp2.displayDetails();
		System.out.println("Employee's salary : "+emp2.nextsalary());
	}
}