package com.StringDemo;

public class StringTotoCharArray {

	public static void main(String[] args) 
	{

		String s1="hello";  
		
		//char[] ch=s1.toCharArray(); 
		
		for(int i=0;i<s1.length();i++)
		{  
			char s=s1.charAt(i);
			System.out.println(s);
		//System.out.println(ch[i]);  
		}  
	}

}
