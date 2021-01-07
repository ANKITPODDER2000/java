class Scope1{
    public static void main(String[] args) {
        int x = 0;
        // int y;
        if (x == 0) {
            int y = 0; //If we declared a variable before , then we can't declare that variable again int the child scope
            x = 10;
            System.out.printf("value of x = %d and y = %d\n", x, y);
        }
        // System.out.printf("value of x = %d and y = %d\n", x, y);
        System.out.printf("value of x = %d .\n", x);
        int y = 50;
        System.out.printf("value of x = %d and y = %d\n", x, y);
    }
}