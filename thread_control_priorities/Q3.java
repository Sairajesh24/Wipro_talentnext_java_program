package thread_control_priorities;

class MyThread10 extends Thread{
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+Thread.currentThread().getId()+":"+i);
		}
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread10 t1=new MyThread10();
		MyThread10 t2=new MyThread10();
		MyThread10 t3=new MyThread10();
		
		t1.setName("Sai");
		t2.setName("Rajesh");
		t3.setName("Patro");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
