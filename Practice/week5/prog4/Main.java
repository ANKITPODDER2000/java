import pack.B;
class sub implements B{
    public void A_() {
        System.out.println("Hello From A.");
    }
    public void B_() {
        A_();
        System.out.println("Hello From B.");
    }
}
public class Main {
    public static void main(String[] args) {
        sub obj = new sub();
        obj.B_();
    }
}
