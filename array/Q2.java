package array;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5455,645,67,356,774};
		int min=a[0];
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("min:"+min+",max:"+max);
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
//        int min = Arrays.stream(a).min().orElse(0);
//        int max = Arrays.stream(a).max().orElse(0);
//
//        System.out.println("min: " + min + ", max: " + max);
//    }
//}

