package com.lambdas.test.fase2;

public class Main {
	
	public static void main(String[] args) {
		
		Pi pi = () ->{ return 3.1415;};
		
		System.out.println(pi.getPiValue());
	}

}
