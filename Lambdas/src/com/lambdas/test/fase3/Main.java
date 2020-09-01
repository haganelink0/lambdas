package com.lambdas.test.fase3;

public class Main {

	public static void main(String[] args) {
		
		Reverser rs = (word) -> {
			String result = "";
			for(int i = word.length()-1; i >= 0; i--)
	            result += word.charAt(i);
	         return result;
		};
		
		String name = "tomas";
		System.out.println(rs.reverse(name));
	}

}
