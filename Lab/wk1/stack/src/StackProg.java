import java.util.Scanner;

class Stack{
	Scanner sc = new Scanner(System.in);
	int top = -1;
	char[] arr;
	Stack(int n){
		arr = new char[n];
	}
	void push(){
		if(top==arr.length-1)
		{
			System.out.println("Overflow");
			return;
		}
		top++;
		System.out.print("Enter val to insert : ");
		arr[top] = sc.next().charAt(0);
	}
	void pop(){
		if(top==-1){
			System.out.println("Underflow");
			return;
		}
		System.out.println("Popped : "+arr[top--]);
	}
	String getSen(){
		String s = "";
		for(int i=top;i>=0;i--){
			s += arr[i];
		}
		return s;
	}
}

class StackProg{
	static String rev(String sen){
		String rev = "";
		int len = sen.length()-1;
		for(int i = len ; i >=0; i--){
			rev += sen.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of stack : ");
		Stack S = new Stack(sc.nextInt());
		boolean con = true;
		while(con){

			System.out.print("Enter 1 -> push()\nEnter 2 -> pop() \nEnter q -> quit()\nEnter your Choice : ");
			char ch = sc.next().charAt(0);
			switch(ch){
				case '1':
					//System.out.print("Enter the value to insert : ")
					S.push();
					break;
				case '2':
					S.pop();
					break;
				case 'q':
					con = false;
					break;
				default:
					con = false;
					break;
			}
		}
		//System.out.println("Exit");
		String sen = S.getSen();
		System.out.println("String is : "+sen);
		System.out.println("Rev string is : "+StackProg.rev(sen));
	}
}