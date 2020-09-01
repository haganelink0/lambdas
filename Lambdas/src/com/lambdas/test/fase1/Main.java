package com.lambdas.test.fase1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	
	List<String> namesList = Arrays.asList("bob", "Ana", "ava","Alicia");

	List<String> finalList = startingWithA(namesList);
					
	System.out.println(finalList);
					
	
	
	List<Integer> numberList = new ArrayList<Integer>();
	numberList.add(12);
	numberList.add(39);
	
	List<String> finalNumber = evenOrOdd(numberList);
	
	System.out.println(finalNumber);
	
	List<String> words = Arrays.asList("carro", "albahaca", "mantequilla", "arroz", "mesa", "toledo");
	
	List<String> wordsWithO = hasAnO(words);
	
	System.out.println(wordsWithO);
	
	List<String> longWords = hasAnOandFive(words);
	
	System.out.println(longWords);
	
	List<String> months = Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
										"setiembre", "octubre", "noviembre", "diciembre");
	months.forEach(m -> System.out.println(m));

	months.forEach(System.out::println);
	
	}
	
	//returns a list with the names that start with capital A and that have only 3 letters
	public static List<String> startingWithA(List<String> list) {
		List<String> finalList = list.stream()
									 .filter( name -> name.charAt(0) == 'A' && name.length() == 3)
									 .collect(Collectors.toList());
		
		return finalList;
	}
	
	//returns a list of numbers marked as odd or even
	public static List<String> evenOrOdd(List<Integer> list) {
		List<String> results = list.stream()
									.filter(i -> i%2 == 0)
									.map(i -> "e"+i)
									.collect(Collectors.toList());

		results.addAll(list.stream()
						   .filter(i -> i%2 != 0)
						   .map(s -> "o"+s)
						   .collect(Collectors.toList()));
		return results;
	}
	
	//returns a list of all words that contains an O
	public static List<String> hasAnO(List<String> list) {
		List<String> result = list.stream()
								  .filter(s -> s.contains("o"))
								  .collect(Collectors.toList());
		return result;
	}
	
	//returns a list of all words that contains an O and has more than 5 letters
	public static List<String> hasAnOandFive(List<String> list) {
		List<String> result = list.stream()
								  .filter(s -> s.contains("o") && s.length() > 5)
								  .collect(Collectors.toList());
		return result;
	}
	
}
