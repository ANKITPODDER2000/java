import java.util.Scanner;

class Account{
	String name , acc_type;
	long acc_no;

	Account(String name , long acc_no , String acc_type){
		this.name     = name;
		this.acc_no   = acc_no;
		this.acc_type = acc_type;
	}

	void display_balance(double amount){
		System.out.printf("Your current balance is : %.2f\n",amount);
	}

	void details(){
		System.out.printf("User details:\n===========================\nName : %s\nAccount no : %d\nAccount type : %s\n",this.name,this.acc_no,this.acc_type);
	}
}

class Savings extends Account{
	double penalty , min_balance , balance , interest;
	
	Savings(String name , long acc_no , String acc_type , double interest , double penalty , double min_amount){
		super(name , acc_no , acc_type);
		this.interest    = interest;
		this.penalty     = penalty;
		this.min_balance = min_amount;
		this.balance     = 0;
	}

	void deposit(double amount){
		this.balance += amount;
		System.out.println("Deposit is done successfully !");
	}

	void addInterest(){
		this.balance = this.balance + (this.balance * (this.interest / 100));
		System.out.println("Interest is added!");
	}

	void withdrawal(double amount){
		if(this.have_min_balance() == false){
			System.out.println("You don't have enough balance to withdrawal!");
			return;
		}
		if(this.balance - amount < 0){
			System.out.println("You don't have enough balance to withdrawal!");
			return;
		}

		this.balance -= amount;
		System.out.println("withdrawal successful!");
	}

	boolean have_min_balance(){
		if(this.balance < this.min_balance){
			return false;
		}
		return true;
	}

	void check_min_balance(){
		if(this.have_min_balance() == false){
			System.out.println("You don't have enough balance , please deposit money!");
			this.balance -= this.penalty;
		}
		else{
			System.out.println("You have enough balance , don't worry !");
		}
	}

	void display_balance(){
		super.display_balance(this.balance);
	}

	void details(){
		super.details();
		System.out.printf("Ineterest Rate : %.2f %%\nMin amount : %.2f\nPenalty : %.2f\nBalance : %.2f\n\n",this.interest , this.min_balance , this.penalty , this.balance);
	}
}

class Current extends Account{
	double interest , balance;
	Current(String name , long acc_no , String acc_type , double interest){
		super(name , acc_no , acc_type);
		this.interest = interest;
		this.balance  = 0;
	}

	void deposit(double amount){
		this.balance += amount;
		System.out.println("Deposit is done successfully !");
	}

	void withdrawal(double amount){
		if(this.balance - amount < 0){
			System.out.println("You don't have enough balance to withdrawal!");
			return;
		}

		this.balance -= amount;
		System.out.println("withdrawal successful!");
	}

	void addInterest(){
		this.balance = this.balance + (this.balance * (this.interest / 100));
		System.out.println("Interest is added!");
	}

	void details(){
		super.details();
		System.out.printf("Ineterest Rate : %.2f %%\nCurrent Balance : %.2f\n\n",this.interest , this.balance);
	}

	void display_balance(){
		super.display_balance(this.balance);
	}

}

public class Bank{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 -> if you want to create Savings acc \nEnter 2 -> if you want to create Current acc\nEnter your choice : ");
		int ch = sc.nextInt();
		double interest;
		System.out.print("Name : ");
		sc.nextLine();
		String name = sc.nextLine();
		switch(ch){
			case 1:
				double  penalty , min_amount;
				System.out.print("Enter interest , penalty , min_amount : ");
				interest   = sc.nextDouble();
				penalty    = sc.nextDouble();
				min_amount = sc.nextDouble();
				Savings acc1 = new Savings(name , 15423 , "Savings",	interest , penalty , min_amount);
				System.out.print("Enter 1->Deposit\nEnter 2->withdrawal\nEnter 3-> display_balance \nEnter 4 -> check_min_balance\nEnter 5 -> Show details\nEnter 6-> Add Interest\nEnter 7-> Quit\n");
				int op;
				do{
					System.out.print("Enter the option : ");
					op = sc.nextInt();
					switch(op){
						case 1:
							System.out.print("Enter amount to deposit : ");
							double a1 = sc.nextDouble();
							acc1.deposit(a1);
							break;
						case 2:
							System.out.print("Enter amount to withdrawal : ");
							double a2 = sc.nextDouble();
							acc1.withdrawal(a2);
							break;
						case 3:
							acc1.display_balance();
							break;
						case 4:
							acc1.check_min_balance();
							break;
						case 5:
							acc1.details();
							break;
						case 6:
							acc1.addInterest();
							break;
						case 7:
							break;
						default:
							System.out.println("Enter the proper operation num.");
							break;
					}
				}while(op != 7);
			case 2:
				System.out.print("Enter interest : ");
				interest   = sc.nextDouble();
				Current acc2 = new Current(name , 15423 , "Current",	interest);
				System.out.print("Enter 1->Deposit\nEnter 2->withdrawal\nEnter 3-> display_balance\nEnter 4 -> Show details\nEnter 5-> Add Interest\nEnter 6-> Quit\n");
				do{
					System.out.print("Enter the option : ");
					op = sc.nextInt();
					switch(op){
						case 1:
							System.out.print("Enter amount to deposit : ");
							double a1 = sc.nextDouble();
							acc2.deposit(a1);
							break;
						case 2:
							System.out.print("Enter amount to withdrawal : ");
							double a2 = sc.nextDouble();
							acc2.withdrawal(a2);
							break;
						case 3:
							acc2.display_balance();
							break;
						case 4:
							acc2.details();
							break;
						case 5:
							acc2.addInterest();
							break;
						case 6:
							break;
						default:
							System.out.println("Enter the proper operation num.");
							break;
					}
				}while(op != 6);
		}
	}
}