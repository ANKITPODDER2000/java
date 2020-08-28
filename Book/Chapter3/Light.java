public class Light{
	public static void main(String[] args) {
		int lightspeed = 186000;
		int day = 1000;
		long distance = day * 24 * 60 * 60 * ((long)lightspeed);
		System.out.println("Light tarverse "+ distance +" miles in "+ day +" days.");
	}
}