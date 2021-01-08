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
        System.out.println("------------------------");
        A obj3 = new A(); /**
                             If the access specifier of the constructor of Class A is 
                             declared as "protected" the we can't create any object of
                             that class (out side of the package.) , but other classes can
                             inherit the class.
                          */
    }
}
