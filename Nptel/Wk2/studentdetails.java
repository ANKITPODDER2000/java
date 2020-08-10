class student{
	String name , dept;
	int sem ;
	boolean fee ;

	student(String name , String dept , int sem){
		this(name,dept,sem,false);
	}

	student(String name , String dept , int sem , boolean fee){
		this.name = name;
		this.dept = dept;
		this.sem  = sem ;
		this.fee  = fee ;
	}

	public String payfee(){
		if(this.fee)
			return "=====================    You already submitted your fee !    " + this.name +" =====================";
		this.fee = true;
		return "=====================    Thanks for you payment.    " + this.name +" =====================";
	}

	public void information(){
		System.out.println("\nStudent Information :\n=========================");
		if(this.fee)
			System.out.printf("Name : %s\nDept : %s\nSem : %d\nfee : True\n",this.name,this.dept,this.sem);
		else
			System.out.printf("Name : %s\nDept : %s\nSem : %d\nfee : False\n",this.name,this.dept,this.sem);
	}
}
public class studentdetails{
	public static void main(String[] args) {
		student s1 = new student("Rajib Jha" , "CSE" , 6);
		student s2 = new student("Rishab Adhikary" , "IT" , 6 , true);
		
		s1.information();
		s2.information();
		
		System.out.println(s1.payfee());
		System.out.println(s2.payfee());

		s1.information();
		s2.information();
	}
}