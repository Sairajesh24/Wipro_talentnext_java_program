package threadCreation;
import java.util.Random;

public class Q2 implements Runnable {
    private String[] colors = {"white", "blue", "black", "green", "red", "yellow"};
    
    @Override
    public void run() {
        Random random = new Random();
        int index;
        
        while (true) {
            index = random.nextInt(colors.length);
            System.out.println(colors[index]);
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            if (colors[index].equals("red")) {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        Q2 q2 = new Q2();
        
        Thread thread = new Thread(q2);
        thread.start();
    }
}
