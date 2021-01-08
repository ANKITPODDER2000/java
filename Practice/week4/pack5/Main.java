import pack2.D;
class E extends D {
    private E() {
        System.out.println("Hi From Class E ..");
    }
    protected E(int secu){
        this();
    }
}
public class Main {
    public static void main(String[] args) {
        D obj1 = new D();
        System.out.println("-----------------------");
        E obj2 = new E(1);
    }
}
