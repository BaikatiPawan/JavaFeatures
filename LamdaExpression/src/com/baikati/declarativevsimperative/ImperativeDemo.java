package com.baikati.declarativevsimperative;

import java.util.Arrays;
import java.util.List;

public class ImperativeDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(78,15,2,3,4,10,99,22,9);
		int min = list.get(0);
		/*
		 * for(Integer val : list) { if(val<min) { min=val; } }
		 */
		for(int i=0;i<list.size();i++) {
			if(list.get(i)<min) {
				min = list.get(i);
			}
		}
		System.out.println(min);
	}
}
