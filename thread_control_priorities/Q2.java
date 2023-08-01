package thread_control_priorities;


class Sai extends Thread{
	public void run() {
		Thread t=Thread.currentThread();
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println(t.getName()+":"+t.getId()+":"+i);
			}
		}
	}
}
class Sai1 extends Thread{
	public void run() {
		Thread t=Thread.currentThread();
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				System.out.println(t.getName()+":"+t.getId()+":"+i);
			}
		}
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sai t=new Sai();
		Sai1 t1=new Sai1();
		t.setName("Thread");
		t1.setName("Thread1");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
	}

}
