class Public{
	String name;
	int age;
	boolean male;
	Public(String name,int age,boolean male){
		this.name = name;
		this.age = age;
		this.male = male;
	}

	void details(){
		System.out.println("Name := "+this.name);
		System.out.println("Age := "+this.age);
		System.out.println("Male := "+this.male);
	}
}

class Student extends Public{
	int roll;
	double score;
	
	Student(String name,int age,boolean male,int roll,double score){
		super(name,age,male);
		this.roll  = roll;
		this.score = score;
	}

	void details(){
		super.details();
		System.out.println("Roll no := "+this.roll);
		System.out.println("Score := "+this.score+" %");
	}
}

class Employee extends Public{
	int id;
	double income;
	
	Employee(String name,int age,boolean male,int id,double income){
		super(name,age,male);
		this.id  = id;
		this.income = income;
	}

	void details(){
		super.details();
		System.out.println("Id no := "+this.id);
		System.out.println("Income := "+this.income);
	}
}


public class inheritance4{
	public static void main(String[] args) {
		Student s = new Student("Raj",15,true,11,88.6);
		s.details();

		System.out.println("\n-------------------------------\n");

		Employee e = new Employee("Rima",24,false,1254,45000.00);
		e.details();
	}
}