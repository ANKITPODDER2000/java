import java.util.Scanner;
class Stack{
    Scanner sc = new Scanner(System.in);
    int arr[], size = 0, top;

    Stack(int n) {
        size = n;
        arr = new int[n];
        top = -1;
    }

    void push(int num){
        if (top == size - 1) {
            System.out.println("Stack overflow.");
            return;
        }
        top++;
        arr[top] = num;
        System.out.printf("%d is pushed into the stack.\n", arr[top]);
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow.");
            return 0;
        }
        int temp = arr[top];
        top--;
        return temp;
    }

    String rev(char[] arr) {
        String s = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            s += arr[i];
        }
        return s;
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack underflow.");
            return;
        }
        String s = "";
        while (top != -1) {
            s += pop();
        }
        System.out.println("String is : " + s);
        char strarr[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            strarr[i] = s.charAt(i);
        }
        String revstr = rev(strarr);
        System.out.println("Reverse String is : " + revstr);
    }

    void print(){
        if (top == -1) {
            System.out.println("Stack underflow.");
            return;
        }
        System.out.print("Stack is : ");
        for (int i = 0; i <= top; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }
}
public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the stack size : ");
        int n , op ,val;
        n = sc.nextInt();
        Stack obj = new Stack(n);
        System.out.println("Enter 1-> Push\nEnter 2->Pop\nEnter 3-> Display String\nEnter 4-> print stack\nEnter 5->Quit");
        do{
            System.out.print("Enter the operation : ");
            op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.print("Enter the value to push : ");
                    val = sc.nextInt();
                    obj.push(val);
                    break;
                case 2:
                    val = obj.pop();
                    System.out.printf("%d is popped from stack",val);
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    obj.print();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Enter a valid operation .");
            }
        } while (op != 5);
    }
}
