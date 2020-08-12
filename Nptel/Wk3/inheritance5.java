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

class Employee extends Student{
	int id;
	double income;
	
	Employee(String name,int age,boolean male,int roll,double score,int id,double income){
		super(name,age,male,roll,score);
		this.id  = id;
		this.income = income;
	}

	void details(){
		super.details();
		System.out.println("Id no := "+this.id);
		System.out.println("Income := "+this.income);
	}
}


public class inheritance5{
	public static void main(String[] args) {
		Employee s = new Employee("Rima",15,false,11,88.6,1145,45120.5);
		s.details();
	}
}