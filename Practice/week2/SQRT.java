import java.io.DataInputStream;
class calculateSqrt{
    double x = 0.0;
    double sq = Math.sqrt(x);
    void findSqrt(){
        this.sq = Math.sqrt(x);
    }
}
public class SQRT {
    public static void main(String[] args) throws Exception  {
        DataInputStream in = new DataInputStream(System.in);
        System.out.print("Enter the number : ");
        String tempstring;
        System.out.flush();
        tempstring = in.readLine();
        Double num = Double.parseDouble(tempstring);
        
        calculateSqrt cal = new calculateSqrt();
        cal.x = num;
        cal.findSqrt();
        System.out.println("Square root of "+cal.x+" is = "+cal.sq);
    }
}
