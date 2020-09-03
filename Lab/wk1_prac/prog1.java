class fib{
    int a = 0 , b = 1 ,c;
    
    void printSeries(){
        System.out.print("Series is : "+a+" "+b+" ");

        while(true){
            c = b + a;
            a = b;
            b = c;
            if(c>20)
                return;
            System.out.print(c+" ");
        }
    }
}
class prog1{
    public static void main(String[] args) {
        fib f = new fib();
        f.printSeries();
    }
}