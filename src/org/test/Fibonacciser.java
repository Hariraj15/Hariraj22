package org.test;



public class Fibonacciser {
	public static void fibonacci(int num) {
	int i=0;
	int j=1;
	int k=i+j;
	System.out.println(i);
	System.out.println(j);
	System.out.println(k);
	for(int a=3;a<=num;a++) {
		i=j;
		j=k;
		k=i+j;
		System.out.println(k);
		
	}
		
	}
	public static void main(String[] args) {
		fibonacci(10);
	}
	

	}
