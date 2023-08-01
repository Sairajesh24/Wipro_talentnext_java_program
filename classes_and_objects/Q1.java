package classes_and_objects;

import java.util.*;
class Box{
	Double len;
	Double wth;
	Double hgt;
	
	Box(Double len,Double wth,Double hgt){
		this.len=len;
		this.hgt=hgt;
		this.wth=wth;
	}
	public void volume() {
		System.out.println("volume of the box is:" + (len*hgt*wth));
	}
}
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double l=sc.nextFloat();
		double w=sc.nextFloat();
		double h=sc.nextFloat();
		sc.close();
		Box b1=new Box( l, w,h);
		b1.volume();
	}

}
