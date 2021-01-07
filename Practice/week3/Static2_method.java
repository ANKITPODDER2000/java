class Method {
    static void sayHi() {
        System.out.println("Hi from Method object.");
    }
}
public class Static2_method {
    static void sayHi() {
        System.out.println("Hi from Static2_method object.");
    }
    public static void main(String[] args) {
        sayHi();
        Method.sayHi();
    }
}
