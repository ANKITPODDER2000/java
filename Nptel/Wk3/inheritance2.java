class Box{
	double h,w,d;
	Box(double a,double b,double c){
		h = a;
		w = b;
		d = c;
	}
	double volume(){
		return h * w * d;
	}
}
class BoxWeight extends Box{
	double wei;
	BoxWeight(double a,double b,double c,double d){
		super(a,b,c);
		wei = d;
	}
}
class inheritance2{
	public static void main(String[] args) {
		BoxWeight b1 = new BoxWeight(1.0,2.0,4.0,0.5);
		System.out.println(b1.h);
		System.out.println("Volume of box is : " + b1.volume());

		Box b2 = new Box(0,0,0);
		System.out.println(b2.h);
		System.out.println("Volume of box is : " + b2.volume());
	}
}