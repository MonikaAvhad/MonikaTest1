package com.CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(34);
		al.add(65);
		al.add(23);
		al.add(21);
		al.add(35);
		System.out.println(al);
		
		
		System.out.println(",,,,,Array1,,,,,,,");
		//Object o[]=al.toArray();
		//or
		
		Integer array[]=al.toArray(new Integer[al.size()]);
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println(",,,,,Array2,,,,,,");
		
		Integer a[]=new Integer[al.size()];
		
		for(int i=0;i<al.size();i++)
		{
			a[i]=al.get(i);
		}
		System.out.println(Arrays.toString(a));
	}

}
