package edu.oakland.helper;
import java.util.*;

/**
*	This class is responsible for generating a Arraylist of
*	Integers; it will be filled by the int[] array generated
*	by the ArrayGen.java class.
*
*	@author Chase Hulderman
*	@author Miguel Millan
*	@version version 2.0 - 160322
*	@since version 1.0
*/
public class ArrayListGen {
	private ArrayList<Integer> arr;
	private int[] intArray;
	
	/**
	*	Contructs an empty list with a given initial size.
	*
	*	@param initialSize the specified initial size assigned to size
	*/
	public ArrayListGen(int[] integerArray){
		intArray = integerArray;
		arr = new ArrayList<Integer>();
	}
	
	/**
	*	Populates the inner ArrayList 'arr' of this ArrayListGen object 
	*	using 'intArray,' then returns 'arr'.
	*	
	*	@return Returns arr, an ArrayList<Integer>
	*/
	public ArrayList<Integer> createArrayList(){
		for(int i =0; i<intArray.length; i++)
			arr.add(intArray[i]);
		
		return arr;
	}
}