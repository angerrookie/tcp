package com.mysql.test;

import java.util.Scanner;

public class WordToNumber {
	private static final String []STRINGS = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static StringBuffer toNumber(String string) {
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < STRINGS.length; j++) {
				for (int j2 = 0; j2 < STRINGS[j].length(); j2++) {
					if (string.charAt(i)==STRINGS[j].charAt(j2)) {
						sBuffer.append(j+1);
					}
				}
			}
		}
		return sBuffer;		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		string = string.toLowerCase();
		System.out.println(toNumber(string));
	}
}
