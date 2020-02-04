package com.SBA.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

/*Create the username portion of a registration system that requires all usernames are unique.  
 * If a new user requests a name that is already used, an integer should be added to the end of the username 
 * to make it unique.  
 * The numbering begins with 1 and is incremented by 1 for each new instance per username. 

As an example, if username requests were for [bob, alice, bob, alice, bob, alice], 
the system should assign usernames [bob, alice, bob1, alice1, bob2, alice2].

Given a list of username requests in the order given, process all requests and 
return an array of the usernames as assigned by the function.*/

public class Problem2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> newList=new ArrayList<>();
		HashMap<String, Integer> map=new HashMap<>();
		Scanner scanner=new Scanner(System.in);
		int counter=0;
		ArrayList<String> list=new ArrayList<String>(Arrays.asList("bob","alice","bob","alice","bob","alice","Sehan"));
		System.out.println("Original list");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			
			//If  name repeats 
			
			if (map.containsKey(list.get(i))) {
				
				//Concatenate with its occurence
				
				map.put(list.get(i), map.get(list.get(i))+1);
				list.set(i, list.get(i)+map.get(list.get(i)));
			}
			// If it 
			else {
				map.put(list.get(i), 0);
			}
		}
		System.out.println("List with uniques names");
		for (String string : list) {
			System.out.println(string);
		}
	}

}
