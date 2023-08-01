package threadCreation;
//
//class MyThread extends Thread {
//	public MyThread(String name) {
//		super(name);
//	}
//
//	public void run() {
//		System.out.println(Thread.currentThread().getName());
//	}
//}
//
//public class Q1 {
//	public static void main(String[] args) {
//		MyThread scoobyThread = new MyThread("Scooby");
//		MyThread shaggyThread = new MyThread("Shaggy");
//
//		scoobyThread.start();
//		shaggyThread.start();
//	}
//}

//simpler way using extend method
/*public class Ques1 extends Thread {
    
    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        Ques1 t1 = new Ques1();
        Ques1 t2 = new Ques1();
        
        t1.setName("Scooby");
        t2.setName("Shaggy");
        
        t1.start();
        t2.start();
    }
}*/


//using runnable interface
public class Q1 implements Runnable {
    
    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        Q1 m1 = new Q1();
        
        Thread t1 = new Thread(m1, "Scooby");
        Thread t2 = new Thread(m1, "Shaggy");
        
        t1.start();
        t2.start();
    }
}
