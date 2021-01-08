import MyPack.*;
class subClass extends A{
    subClass() {
        super();
    }
}
public class Main {
    public static void main(String[] args) {
        B obj1 = new B();
        System.out.println("------------------------");
        subClass obj2 = new subClass();
    }
}
