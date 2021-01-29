import java.util.Scanner;
import java.lang.Thread;

class Queue {
    int[] queue;
    int s;
    int front = -1;
    int rear = -1;

    Queue(int s) {
        this.s = s;
        queue = new int[s];
    }
}

class delete extends Thread {
    Queue q;
    delete(Queue q) {
        this.q = q;
    }
    public void run(){
        if (q.front == -1) {
            System.out.println("Queue is empty ..");
            return;
        }
        else if (q.front == q.rear) {
            System.out.println(q.queue[q.front] + " is popped.");
            q.front = -1;
            q.rear = -1;
            return;
        }
        System.out.println(q.queue[q.front] + " is popped.");
        q.front++;
    }
}

class insert extends Thread {
    Queue q;
    insert(Queue q) {
        this.q = q;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        if (q.rear == q.s-1) {
            System.out.println("Queue is full.");
            return;
        }
        else if (q.front == -1) {
            q.front++;
            q.rear++;
        }
        else {
            q.rear++;
        }
        System.out.print("Enter the number to insert : ");
        q.queue[q.rear] = sc.nextInt();
    }
}
class display extends Thread{
    Queue q;
    display(Queue q){
        this.q = q;
    }
    public void run(){
        if (q.front == -1) {
            System.out.println("Queue is empty ..");
            return;
        }
        else {
            System.out.print("Queue is : ");
            for (int i = q.front; i < q.rear + 1; i++) {
                System.out.print(q.queue[i] + " ");
            }
            System.out.println();
        }
    }
}
class MainThread extends Thread{
    Queue q;
    MainThread(Queue q){
        this.q = q;
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Enter 1 -> Insert\nEnter 2-> Delete\nEnter 3-> Display\nEnter 4->Quit.");
        do{
            System.out.print("Enter the operation : ");
            ch = sc.nextInt();
            Thread del = new delete(q);
            Thread ins = new insert(q);
            Thread dis = new display(q);
            switch (ch) {
                case 1:
                    ins.start();
                    try{
                        ins.join();
                    }
                    catch(Exception e){}
                    break;
                case 2:
                    del.start();
                    try{
                        del.join();
                    }
                    catch(Exception e){}
                    break;
                case 3:
                    dis.start();
                    try{
                        dis.join();
                    }
                    catch(Exception e){}
                    break;
                case 4:
                    break;
            }
        } while (ch != 4);
    }
}
public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the queue size : ");
        int size = sc.nextInt();
        Queue q = new Queue(size);
        MainThread obj = new MainThread(q);
        obj.start();
    }
}