package edu.oakland.homework;

import edu.oakland.helper.*;
import java.util.*;

/**
*	This is the manager class with the main method
*	that manages the other Java classes in the App; 
*
*	@author Chase Hulderman
*	@author Miguel Millan
*	@version version 1.0 - 160216
*	@since version 1.0
*/
public class JCFIteratorDemo {
	public JCFIteratorDemo(){
	
	}
	
	private int[] arrayRef;
	private ArrayList<Integer> arrayListRef;
	private SingleLinkedList linkListRef;
	
	
	
	public static void main(String[] args) {
			ArrayGen aGen = new ArrayGen();
			arrayRef = aGen.createArray();
			
			ArrayListGen aListGen = new ArrayListGen();
			arrayListRef = aListGen.createArrayList(arrayRef);
			
			LinkedListGen LLGen = new LinkedListGen();
			linkListRef = LLGen.createSingleLinkedList(arrayListRef);
			
			//Next create an AL<integer> iterator and find
			//all odd numbers and print to cmd line
			Iterator<Integer> iter1 = arrayListRef.iterator();
			int tmp = 0;
			while(iter1.hasNext()){
				tmp = iter1.next();
				if(tmp % 2 == 1)
					System.out.println("Odd number found: " + tmp);
			}
			
			//construct an iterator for a singleLinkedList 
			//and find all even numbers
			Iterator<SingleLinkedList> iter2 = linkListRef.iterator();
			while(iter2.hasNext()){
				tmp = iter2.next().getValue();
				if(tmp % 2 == 1)
					System.out.println("Odd number found: " + tmp);
			}
			
			
			
			
	}
	
	
}