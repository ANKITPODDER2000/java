public class Scope2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i = " + i);
        }
        // System.out.println("Value of i = " + i);the scope of i is the for loop , so we can't access the i , outside the for loop
    }
}
