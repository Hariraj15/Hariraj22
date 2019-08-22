package org.test;

public class Childc extends Parentc {
	public Childc() {
		super(30);
		System.out.println("Child Default Constructor");
	}
	public Childc(int id){
		
		System.out.println("Para Constructor"+id);
	}
	public static void main(String[] args) {
		Childc c = new Childc();
		Childc c1= new Childc(40);
		
		
	}

}
