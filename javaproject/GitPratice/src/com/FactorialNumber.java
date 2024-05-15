package com;

import java.util.stream.IntStream;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int n=5;
		int i=IntStream.rangeClosed(1, n).reduce(1, (x,y)->x*y);
		System.out.println(i);
	}
}
