package com.suma;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class CollectionsPractice {

	public static void main(String[] args) {
	
	//ArrayList	
	String str[] = new String[10];
			str[0]= "Suma";
			str[1]="ABC";
	ArrayList<String> strAL= new ArrayList<String>();
	
	strAL.add("ALsuma");
	strAL.add("ALABC");
	for(int i=0;i<str.length;i++) {
		if(str[i] !=null)
		System.out.println(str[i]);
	}
	
	//for
	System.out.println("Using for");
	for(int j=0;j<strAL.size();j++)
	System.out.println(strAL.get(j));
	
	
	//foreach
	System.out.println("Using foreach");
	for (String element : strAL) {
		System.out.println(element);
	}

	
	Iterator itr = strAL.iterator();
	System.out.println("Iterate using Iterator: ");
	while(itr.hasNext())
		System.out.println(itr.next());
	}
	
	
	//Stack
	
	Stack<String> stk =new Stack<>();
	
}
