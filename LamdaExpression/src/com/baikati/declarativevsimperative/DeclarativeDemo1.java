package com.baikati.declarativevsimperative;

import java.util.Arrays;
import java.util.List;

public class DeclarativeDemo1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(78,15,2,3,4,10,99,22,9);
		int min = list.stream().min(Integer::compareTo).get();
		System.out.println(min);
	}
}
