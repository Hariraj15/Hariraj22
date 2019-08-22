package org.test;

public class Parentc {
	public Parentc() {
		System.out.println("default constructor");
	}
	public Parentc(int id){
		this ("Hariraj");
		System.out.println("Parent Default constructor"+id);
	}
	public Parentc(String name) {
		System.out.println("String Constructor"+name);
	}
	

}
