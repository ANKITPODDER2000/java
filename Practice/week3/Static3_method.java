class Helper {
    static int val=50;
    static void sayHi() {
        System.out.println("Hi from static helper method!");
    }
    static void greed() {
        sayHi();
    }
    void greed(int a) {
        System.out.println("Hello from non-static method");
    }
}
public class Static3_method {
    public static void main(String[] args) {
        Helper h = new Helper();
        Helper.greed();
        h.greed(); /* This is a warning but we can do this , we can use a 
                      static context(methods or fileds) in non-static way
                      but it isn't preferable
                   */
        h.greed(0);
        System.out.printf("Value of h.val = %d and Helper.val = %d\n", h.val, Helper.val);
    }
}