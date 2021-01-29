import pack.*;
class subClass extends class1 implements interface1 , interface2{
    public void hello1() {
        System.out.println("Hello from hello1...");
    }
    public void hello2() {
        System.out.println("Hello from hello2...");
    }
    public void hello3() {
        System.out.println("Hello from hello3...");
    }
    void classAllFunction(){
        this.hello1();
        this.hello2();
        this.hello3();
    }
}
public class Main {
    public static void main(String[] args) {
        subClass obj1 = new subClass();
        obj1.classAllFunction();
    }
}
