package com.java.lambdasAss1;

import java.util.ArrayList;
import java.util.List;

public class FirstLetterOfEachString {
	public static void main(String[] args) {
		List<String> array = new ArrayList<String>();
		array.add("Sai");
		array.add("Krishna");
		array.add("SaiKrishna");
		array.add("Chinna");
		System.out.println("Names :\n"+array);
		System.out.println("**********************************");
	
		String result = array.stream().map(sai -> Character.toString(sai.charAt(0))).reduce(" ", (a, b) -> a + b);
		System.out.println(result);
	
	}
}
