public class Program2 {
    public static void main(String[] args) {
        try{
            int i = args.length;
            String myString[] = new String[i];
            for(int j = 0 ; j < i ; j++)
                myString[j] = args[j];
            double myDivision = (2 * i + 1) / i;
            int myArr[] = { 10, 20, 300 };
            System.out.print("Args : ");
            for(int j = 0 ; j < i ; j++)
                System.out.print(myString[j] + " ");
            System.out.println();
            System.out.printf("myDivision = %.2f\n", myDivision);
            System.out.printf("My lucky number is : %d\n", myArr[i]);
        }
        catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("I will be executed for all times!!!");
        }
    }
}
