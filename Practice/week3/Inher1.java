class superClass {
    superClass() {
        System.out.println("Helloo from superClass constructor1.");
    }
    superClass(int a) {
        System.out.println("Helloo from superClass constructor2.");
    }
    void sayHi(){
        System.out.println("Hi from superClass.");
    }
}
class subClass extends superClass{
    subClass() {
        // super();
        super(0);
        sayHi();
        super.sayHi();
        // super(); This isn't accepted!
        System.out.println("Helloo from subClass.");
    }
}
public class Inher1 {
    public static void main(String[] args) {
        subClass sub1 = new subClass();
        System.out.println("----------------------");
        superClass sup1 = new superClass();
    }
}
