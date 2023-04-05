package com.StringDemo;

import java.util.Scanner;

public class ReverseWordExceptFirstAndLast {

	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        for (int i = 1; i < words.length - 1; i++)
        {
            String word = words[i];
            char[] chars = word.toCharArray();

            int left = 0;
            int right = chars.length - 1;

            while (left < right)
            {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            words[i] = new String(chars);
        }

        String result = words[0];
        for (int i = 1; i < words.length - 1; i++)
        {
            result += " " + words[i];
        }
        result += " " + words[words.length - 1];

        System.out.println(result);
    }
}