import java.lang.Thread;
class totalDivisors extends Thread{
    int divisors , num;
    totalDivisors(int num) {
        this.num = num;
        this.divisors = 0;
    }
    public void run(){
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors += 1;
            }
        }
        // System.out.println(this.divisors);
    }
}
class MainThrade extends Thread {
    public void run() {
        int max_num = 1, divisors = 1;
        for (int i = 2; i <= 100000; i++) {
            totalDivisors threadObj = new totalDivisors(i);
            threadObj.start();
            try{
                threadObj.join();
            }
            catch(Exception e){}
            if (divisors < threadObj.divisors) {
                divisors = threadObj.divisors;
                max_num = i;
            }
        }
        System.out.println("Maximum number of divisors is : "+divisors+"\nNumber is : "+max_num);
    }
}
class Prog1 {
    public static void main(String[] args) {
        MainThrade obj = new MainThrade();
        obj.start();
    }
}