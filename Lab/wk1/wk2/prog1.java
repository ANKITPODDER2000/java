//Prog1
import java.util.Scanner;
class Queue{
	int []arr;
	int front = -1 , rear = -1;
	Scanner sc = new Scanner(System.in);
	String s = "";

	Queue(int n){
		arr = new int[n];
	}

	void insert(){
		if(rear == arr.length-1)
		{
			System.out.println("Queue is full");
			return;
		}
		if(front==-1)
		{
			front++;
		}
		System.out.print("Enter the val to insert in Queue : ");
		rear += 1;
		arr[rear] = sc.nextInt();
		//System.out.print(front+"..........."+rear);
	}

	void delete(){
		if(rear == -1)
		{
			System.out.println("Queue is empty");
			return;
		}
		System.out.println(arr[front]+" is deleted.");
		s += Integer.toString(arr[front]);
		if(front==rear){
			front = -1;
			rear  = -1;
		}
		else{
			front += 1;
		}
	}

	void display(){
		if(rear == -1)
		{
			System.out.println("Queue is empty");
			return;
		}
		String s = "";
		for(int i = front ; i<= rear ; i++)
			s += Integer.toString(arr[i]);
		System.out.println("Queue is : "+s);
	}

	void rev(){
		String rev = "";
		for(int i = s.length()-1 ; i>=0 ; i--)
			rev += s.charAt(i);
		System.out.println("String is : "+s);
		System.out.println("Rev string is : "+rev);
	}

}

class prog1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Queue : ");
		Queue q = new Queue(sc.nextInt());
		boolean con = true;
		while(con)
		{
			System.out.print("Enter 1 -> insert()\nEnter 2 -> delete()\nEnter 3->display()\nEnter 4-> Rev\nEnter q -> quit()\nEnter your Choice : ");
			char ch = sc.next().charAt(0);
			switch(ch){
				case '1':
					q.insert();
					break;
				case '2':
					q.delete();
					break;
				case '3':
					q.display();
					break;
				case '4':
					q.rev();
					break;
				case 'q':
					con = false;
					break;
				default:
					System.out.println("Enter a proper operation .");
					break;
			}
		}
	}
}