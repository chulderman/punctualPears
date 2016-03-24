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
	public ArrayListGen(int[] intArray){
		this.intArray = intArray;
		this.arr = createArrayList(intArray);
	}
	
	/**
	*	Populates the inner ArrayList 'arr' of this ArrayListGen object 
	*	using 'intArray,' then returns 'arr'.
	*	
	*	@return Returns arr, an ArrayList<Integer>
	*/
	private ArrayList<Integer> createArrayList(int[] intArray){
		ArrayList<Integer> newArrayList = new ArrayList<Integer>();
		for(int i : intArray){
			newArrayList.add(intArray[i]);
		}
		return newArrayList;
	}

	//Public Accessors
	public ArrayList<Integer> getArrayList(){
		return this.arr;
	}
	public int[] getIntArray(){
		return this.intArray;
	}

	//Public Mutators
	public void setArrayList(int[] newIntArray){
		this.intArray = newIntArray;
		this.arr = createArrayList(newIntArray);
	}
	public void setArrayList(ArrayList<Integer> newArrayList){
		this.arr = newArrayList;
	}
	public void setIntArray(int[] newIntArray){
		this.intArray = newIntArray;
	}
}