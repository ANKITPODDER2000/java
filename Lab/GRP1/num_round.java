class check1 {
    void numOperation(int v) {
        int a = Math.round(v);
        System.out.println(a);
    }
    
    void numOperation(float v) {
        float a = (float)Math.floor(v);
        System.out.println(a);
    }
    
    void numOperation(double v) {
        double a = Math.ceil(v);
        System.out.println(a);
    }
}
public class num_round {
    public static void main(String[] args) {
        check1 obj1 = new check1();
        obj1.numOperation(100);
        obj1.numOperation(100.50);
        obj1.numOperation(100.70F);
    }
}
