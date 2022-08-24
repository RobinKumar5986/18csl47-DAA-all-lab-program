import java.util.*;

class square implements Runnable {
    public int x;

    public square(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("Square of " + x + " is: " + x * x);
    }
}

class cube implements Runnable {
    public int x;

    public cube(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("Cube of " + x + " is: " + x * x * x);
    }
}

class A extends Thread {
    public void run() {
        int num = 0;
        Random r = new Random();
        try {
            for (int i = 0; i < 2; i++) {
                num = r.nextInt(100);
                System.out.println("Main Thread and Generated Number is " + num);
                Thread.sleep(1000);
                System.out.println("--------------------------------------");
                Thread t1 = new Thread(new square(num));
                t1.start();
                Thread t2 = new Thread(new cube(num));
                t2.start();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

public class program_3b {
    public static void main(String[] args) {
        A a = new A();
        a.start();
    }
}