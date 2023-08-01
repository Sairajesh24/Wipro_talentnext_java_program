package thread_control_priorities;

class MyThread extends Thread {
	public void run() {
		Thread t=Thread.currentThread();
		for(int i=1;i<=10;i++) {
			if(i==6) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(t.getName()+t.getId()+":"+i);
		}
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1= new MyThread();
		t1.setName("SAI");
		t1.start();
	}

}
