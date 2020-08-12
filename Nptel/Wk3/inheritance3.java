class SuperClass{
	int i,j;
	SuperClass(){
		this(0,0);
	}
	SuperClass(int i , int j){
		this.i = i;
		this.j = j;
	}

	void Show(){
		System.out.println("i := "+this.i);
		System.out.println("j := "+this.j);
	}
}

class SubClass extends SuperClass{
	int k;
	SubClass(){
		super();
		this.k = k;
	}
	SubClass(int i,int j,int k){
		super(i,j);
		this.k = k;
	}
	void Show(){
		super.Show();
		System.out.println("k := "+this.k);
	}
}

public class inheritance3{
	public static void main(String[] args) {
		SuperClass sup1 = new SuperClass();
		sup1.Show();
		System.out.println("=============================");

		SubClass sub1 = new SubClass();
		sub1.Show();
		System.out.println("=============================");

		SubClass sub2 = new SubClass(5,5,5);
		sub2.Show();
		System.out.println("=============================");

		SuperClass sup2 = new SubClass(3,3,3);
		sup2.Show();
		System.out.println("=============================");
	}
}