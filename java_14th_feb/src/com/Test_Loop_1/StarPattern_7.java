package com.Test_Loop_1;

/*
* * * * * 
* * * * 
* * * 
* * 
*
*/

public class StarPattern_7 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}}
