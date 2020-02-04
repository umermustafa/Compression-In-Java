package com.SBA.week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*Problem 01:

We use different compression techniques in order to reduce the size of the messages sent over the web.
An algorithm is designed to compress a given string by describing the total number of consecutive occurrences of each character next to it. 
For example, consider the string "alaasass", we can group the consecutive occurrence of each character:

'a' occurs one time.
'l' occurs one time.
'a' occurs two times consecutively.
's' occurs one time.
'a' occurs one time.
's' occurs two times consecutively.
If a character only occurs once, it is added to the compressed string. 
If it occurs consecutive times, the character is added to the string followed by an integer representing the number of consecutive occurrences. Thus the compressed form of the string is "ala2sas2". */

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the word I will compress it for you");
		String compressed="";
		ArrayList<Character> characters=new ArrayList<>();
		String input=scanner.next().trim().toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			characters.add(input.charAt(i));
		}
		boolean flag=false;
		int counter=1;
		for (int i = 1; i < characters.size(); i++) {
			
			//if next character is same
			
			if (characters.get(i-1)==characters.get(i)) {
				counter++;
				flag=false;
			}
			else if(characters.get(i-1)!=characters.get(i) ){
				flag=true;
				if (counter==1) {
					compressed=compressed+characters.get(i-1);
				}else {
					compressed=compressed+characters.get(i-1)+counter;
					counter=1;
				}
				
			}
		}
		// if consecutive equal
		if (!flag) {
			compressed=compressed+characters.get(characters.size()-1)+counter;
		}
		// If consecutives are not equal
		else {
			compressed=compressed+characters.get(characters.size()-1);
		}
		System.out.println(input);
		System.out.println("Length of original string "+input.length());
		System.out.println("\nCompressed String: "+compressed);
		System.out.println("Length of compressed string "+compressed.length());
	}

}
