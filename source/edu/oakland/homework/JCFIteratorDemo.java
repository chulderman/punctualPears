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
	
	private int[] arrayRef;
	private ArrayListGen arrayListRef;
	private LinkedListGen linkListRef;
	
	public JCFIteratorDemo(){
	
	}
	
	/**
	*	Sets the arrayRef to point to the given int array.
	*
	*	@param arr given array of integers.
	*/
	public void setArrayRef(int[] arr){
		arrayRef = arr;
	}
	
	/**
	*	Sets the arrayListRef to point to the given ArrayListGen.
	*
	*	@param arrList given arrayListGen.
	*/
	public void setArrayListRef(ArrayListGen arrList){
		arrayListRef = arrList;
	}
	
	/**
	*	Sets the linkListRef to point to the given LinkedListGen.
	*
	*	@param linkList given LinkedListGen.
	*/
	public void setLinkListRef(LinkedListGen linkList){
		linkListRef = linkList;
	}
	
	/**
	*	Gets the arrayRef.
	*
	*	@return arrayRef
	*/
	public int[] getArrayRef(){
		return arrayRef;
	}
	
	/**
	*	Gets the arrayListRef.
	*
	*	@return arrayListRef
	*/
	public ArrayListGen getArrayListRef(){
		return arrayListRef;
	}
	
	/**
	*	Gets the linkListRef.
	*
	*	@return linkListRef
	*/
	public LinkedListGen getLinkListRef(){
		return linkListRef;
	}
	
	public static void main(String[] args) {
			JCFIteratorDemo manager = new JCFIteratorDemo();
			
			ArrayGen aGen = new ArrayGen(20);
			manager.setArrayRef(aGen.createArray(20));
			
			ArrayListGen aListGen = new ArrayListGen();
			manager.setArrayListRef(aListGen.populateArrayList(manager.getArrayRef()));
			
			LinkedListGen llGen = new LinkedListGen();
			manager.setLinkListRef(llGen.createList(manager.getArrayListRef()));
			
			//Next create an AL<integer> iterator and find
			//all odd numbers and print to cmd line
			Iterator<Integer> iter1 = manager.getArrayListRef().listIterator();
			int tmp = 0;
			while(iter1.hasNext()){
				tmp = iter1.next();
				if(tmp % 2 == 1)
					System.out.println("Odd number found: " + tmp);
			}
			/**
			//construct an iterator for a singleLinkedList 
			//and find all even numbers
			Iterator<SingleLink> iter2 = manager.getLinkListRef().listIterator();
			while(iter2.hasNext()){
				tmp = iter2.next().getValue();
				if(tmp % 2 == 1)
					System.out.println("Odd number found: " + tmp);
			}
			*/
			
	}
}