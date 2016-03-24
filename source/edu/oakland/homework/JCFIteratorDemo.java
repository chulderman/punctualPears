package edu.oakland.homework;

import edu.oakland.helper.*;
import java.util.*;

/**
*	This is the manager class with the main method
*	that manages the other Java classes in the App; 
*
*	@author Chase Hulderman
*	@author Miguel Millan
*	@version version 2.0 - 160322
*	@since version 1.0
*/
public class JCFIteratorDemo {
	
	private int[] intArray;
	private int arraySize;
	private ArrayGen arrayGen;
	private ArrayListGen aLGen;
	private SingleLink sLink;
	private LinkedListGen sLLGen;
	private ArrayList<Integer> aList;
	
	public JCFIteratorDemo(){
	
	}

	/**
	*	Initializes all the instance variables of JCFIteratorDemo
	*/
	private void run() {
		arraySize = 20;
	
		arrayGen = new ArrayGen(arraySize);
		intArray = arrayGen.createArray(arraySize);
	
		aLGen = new ArrayListGen(intArray);
		aList = aLGen.getArrayList();
		
		sLink = new SingleLink();
		sLLGen = sLink.createList(intArray);
	
	}
	
	/**
	*	Finds odd numbers contained in aList and prints them.
	*/
	private void findOddNumbers(){
		Iterator<Integer> iter1 = aList.iterator();
			int tmp = 0;
			while(iter1.hasNext()){
				tmp = iter1.next();
				if(tmp % 2 == 1)
					System.out.println("Odd number found: " + tmp);
			}
	}
	/**
	*	Finds even numbers contained in sLLGen and prints them.
	*/
	private void findEvenNumbers(){
		Iterator<SingleLink> iter2 = sLLGen.iterator();
			int tmp = 0;
			while(iter2.hasNext()){
				tmp = iter2.next().getValue();
				if(tmp % 2 == 0)
					System.out.println("Even number found: " + tmp);
			}
	}
	
	
	public static void main(String[] args){
		JCFIteratorDemo manager = new JCFIteratorDemo();
		manager.run();
		manager.findOddNumbers();
		manager.findEvenNumbers();
	}
	
}