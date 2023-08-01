package array;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int sum=0;
		for (int i=0;i<a.length;i++) {
			sum+=a[i];
			
		}
		float avg=(float)sum/a.length;
		System.out.print("sum:"+sum+",avg:"+avg);
	}

}
//another method
//import java.util.Arrays;
//
//public class Q1 {
//
//    public static void main(String[] args) {
//        int a[] = {1, 2, 3, 4};
//
//        int sum = Arrays.stream(a).sum();
//        double avg = Arrays.stream(a).average().orElse(0);
//
//        System.out.println("sum: " + sum + ", avg: " + avg);
//    }
//}

