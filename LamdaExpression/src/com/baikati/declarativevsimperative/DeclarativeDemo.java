package com.baikati.declarativevsimperative;

import java.util.stream.IntStream;

public class DeclarativeDemo {
	public static void main(String[] args) {
		IntStream stream1 = IntStream.of(2,3,5,7,8,1);
		stream1.forEach(System.out::print);
		System.out.println("");
		IntStream range = IntStream.range(1, 11);
		range.forEach(System.out::print);
		System.out.println();
		int sum = IntStream.of(1,2,3,4,5).sum();
		System.out.println(sum);
		
		int sum1 = IntStream.range(1, 10).sum();
		System.out.println(sum1);
	}
}
