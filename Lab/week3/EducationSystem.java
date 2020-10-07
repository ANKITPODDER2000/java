import java.util.Scanner;
class stuff{
	String name ;
	int code;
	stuff(String name , int code){
		this.name = name;
		this.code = code;
	}
	void show(){
		System.out.printf("Name : %s \nCode : %d\n",this.name , this.code);
	}
}


class officer extends stuff{
	char grade;
	officer(String name , int code , char grade){
		super(name , code);
		this.grade = grade;
	}
	void show(){
		super.show();
		System.out.printf("Grade : %c\n",this.grade);
	}
}

class teacher extends stuff{
	String subject;
	teacher(String name , int code , String subject){
		super(name , code);
		this.subject = subject;
	}
	void show(){
		super.show();
		System.out.printf("Subject : %s\n",this.subject);
	}
}


class typist extends stuff{
	int speed;
	typist(String name , int code , int speed){
		super(name , code);
		this.speed = speed;
	}
	void show(){
		super.show();
		System.out.printf("Speed : %d wpm\n",this.speed);
	}
}

class casualTypist extends typist{
	int daily_wage;
	casualTypist(String name , int code , int speed ,int daily_wage){
		super(name , code , speed);
		this.daily_wage = daily_wage;
	}
	void show(){
		super.show();
		System.out.printf("daily_wage : %d\n",this.daily_wage);
	}
}


class regularTypist extends typist{
	int remuneration;
	regularTypist(String name , int code , int speed ,int remuneration){
		super(name , code , speed);
		this.remuneration = remuneration;
	}
	void show(){
		super.show();
		System.out.printf("remuneration : %d\n",this.remuneration);
	}
}


public class EducationSystem{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		String name , subject;
		int code , speed , daily_wage , remuneration , words , time;
		char grade;

		System.out.println("Officers input : ");
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("Enter code : ");
		code = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter grade : ");
        grade = sc.nextLine().charAt(0);
        
        officer officerArray[] = new officer[1];
		officerArray[0] = new officer(name , code , grade);


		System.out.println("\nTeacher input : ");
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("Enter code : ");
		code = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter subject : ");
        subject = sc.nextLine();
        
        teacher teacherArray[] = new teacher[1];
		teacherArray[0] = new teacher(name , code , subject);

		System.out.println("\nCasual Typist input : ");
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("Enter code , no. of words , time (in min) & daily wage : ");
		code = sc.nextInt();
        words = sc.nextInt();
        time  = sc.nextInt();
        speed = words / time;
        daily_wage = sc.nextInt();
        
        casualTypist casualTypistArray[] = new casualTypist[1];
		casualTypistArray[0] = new casualTypist(name , code , speed , daily_wage);


		System.out.println("\nRegular Typist input : ");
		sc.nextLine();
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("Enter code , no. of words , time (in min) & daily wage : ");
		code = sc.nextInt();
        words = sc.nextInt();
        time  = sc.nextInt();
        speed = words / time;
		remuneration = sc.nextInt();
        System.out.println(remuneration);
        
        regularTypist regularTypistArray[] = new regularTypist[1];
		regularTypistArray[0] = new regularTypist(name , code , speed , remuneration);


		System.out.print("\nOfficer Details :\n");
		officerArray[0].show();

		System.out.print("\nTeacher Details :\n");
		teacherArray[0].show();

		System.out.print("\nCasual Typist Details :\n");
		casualTypistArray[0].show();

		System.out.print("\nRegular Typist Details :\n");
		regularTypistArray[0].show();
	}
}