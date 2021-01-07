class GlobalField {
    static String str = "This is the Global String!";
    static int a = 10;
    static double b = 20.5;
}
public class Static1 {
    public static void main(String[] args) {
        System.out.printf("Global string is = %s\n", GlobalField.str);
        System.out.printf("Global int    is = %d\n", GlobalField.a);
        System.out.printf("Global double is = %.2f\n", GlobalField.b);

        GlobalField.str = "This is the modified Global String!";
        GlobalField.a = 50;
        GlobalField.b = 100.5;

        System.out.printf("Global string is = %s\n", GlobalField.str);
        System.out.printf("Global int    is = %d\n", GlobalField.a);
        System.out.printf("Global double is = %.2f\n", GlobalField.b);
    }
}
