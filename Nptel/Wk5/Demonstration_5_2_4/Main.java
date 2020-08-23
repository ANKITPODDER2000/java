//Compilation Error example
Class A{                                      //first letter in class must be in Small
	abstract void Did(){					  //We can't define body for a abstart class & alse
		System.out.println("Hi there!");      // 		we can't declare an abstrat method in non abstract 
	}										  //  		class also
}
/*class B extends A{
	public void Did(){
		System.out.println("HI there!");
	}
}*/
Public class Main{                            //first letter of public must be in small
	Public Static void main(string args[]){	  //Public -> public & Static -> static & string -> String
		A a = new A();
	}
}