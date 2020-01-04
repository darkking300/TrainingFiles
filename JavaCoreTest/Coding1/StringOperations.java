package com.assessment;

public class StringOperations {

	public static String reverse(String str){
		String[] arr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		for(String s: arr){
			temp.append(s+" ");
			temp.reverse();
			sb.append(temp);
			temp.setLength(0);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The Empire is no more";
		String str1 = "Welcome to the world of java";
		String str2 = "This is the world of java";
		System.out.println(reverse(str));
		System.out.println(reverse(str1));
		System.out.println(reverse(str2));
	}

}
