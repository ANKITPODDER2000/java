import java.util.Random;
import java.util.Scanner;
import java.lang.Exception;
import java.util.Date;

class checkAmount extends Exception {
    public checkAmount(double amount) {
        super("Please enter a valid amount for deposit or withdrawl " + amount + "$ is not a valid amount.");
        // System.out.println("Please enter a valid amount for deposit or withdrawl ."+amount+"$ is not a valid amount.");
    }
}
class notEnoughAmount extends Exception{
    public notEnoughAmount(double amount) {
        super("You have to deposit " + Math.ceil(amount) + "$ to withdrawl this amount.");
    }
}
class BankAccount{
    private String name, phone_number;
    private int age;
    private long account_number;
    private double amount , min_balance;
    Random rand = new Random();

    public BankAccount(String name, String phone_number, double amount , int age) {
        this.name = name;
        this.phone_number = phone_number;
        this.amount = amount;
        this.age = age;
        this.account_number = (int) (rand.nextDouble() * 100000);
        this.min_balance = rand.nextDouble() * 2000;
    }

    public void deposit(double amount) throws checkAmount {
        if (amount <= 0) {
            throw new checkAmount(amount);
        } else {
            this.amount += amount;
        }
    }
    public void withdrawl(double amount) throws checkAmount , notEnoughAmount {
        if (amount <= 0) {
            throw new checkAmount(amount);
        }
        else {
            double remaining_amount = this.amount - amount;
            if (remaining_amount <= min_balance) {
                throw new notEnoughAmount(this.min_balance - remaining_amount);
            }
            else {
                this.amount -= amount;
            }
        }
    }
    public void checkBalance(){
        System.out.println("Your Current balance is : " + amount+" ( "+new Date().toString()+ " ).");
    }
    public void details(){
        System.out.println("\nBank Details : \n-----------------------------------------");
        System.out.printf(
                "Name : %s\nAge : %d\nPhone number : %s\nAccount number : %d\nAmount : %.2f\nMin amount : %.2f\n-----------------------------------------\n\n",
                name, age, phone_number, account_number,this.amount,this.min_balance);
    }
}
public class Program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, phone_number;
        double amount;
        int age , op = 0;
        System.out.print("Enter your name : ");
        name = sc.nextLine();
        System.out.print("Enter your age : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your phone number : ");
        phone_number = sc.nextLine();
        System.out.print("Enter the initial amount : ");
        amount = sc.nextDouble();
        BankAccount user1 = new BankAccount(name, phone_number, amount , age);
        user1.details();
        System.out.println(
                "Possible operations are : \nEnter 1 -> Deposit \nEnter 2 -> Withdrawl\nEnter 3 -> Check Balance\nEnter 4 -> Check Details\nEnter 5 -> Quit\n");
        do{
            try {
                System.out.print("Enter the operation : ");
                op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.print("Enter the amount for deposit : ");
                        amount = sc.nextDouble();
                        user1.deposit(amount);
                        break;
                    case 2:
                        System.out.print("Enter the amount for withdrawl : ");
                        amount = sc.nextDouble();
                        user1.withdrawl(amount);
                        break;
                    case 3:
                        user1.checkBalance();
                        break;
                    case 4:
                        user1.details();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Enter the Proper operation code.");
                        break;
                }
            } 
            catch (Exception e) {
                System.out.println(e.toString());
            }
        } while (op != 5);
        System.out.println("\n\nEnd of the prgram.");
    }
}