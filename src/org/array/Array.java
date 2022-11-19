package org.array;

public class Array {
	public static void main (String[]args) {
		int a[]=new int[9];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		a[7]=80;
		a[8]=90;
		
		System.out.println(a[5]);
		
		System.out.println("Using normal loop");
		
		    for (int x=0;x<a.length;x++) {
			
		System.out.println(a[x]);
		
		System.out.println("Enhanced for loop");
			
			for(int y:a) {
				System.out.println(y);
			}
		}
		
	}

}
