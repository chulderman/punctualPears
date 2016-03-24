package edu.oakland.helper;

/**
*	This class is responsible for generating an int[] array
*	that JCFIteratorDemo.java will use to fill the other
*	JCF Data Structures; 
*
*	@author Chase Hulderman
*	@author Miguel Millan
*	@version version 1.1 - 160324
*	@since version 1.0
*/

public class ArrayGen {
	private int[] arr;
	private int arraySize;

	/**
	*	Overloaded contructor, initializes ArraySize and arr.
	*   @param size the size of the array
	*/
	public ArrayGen(int size){
		this.arraySize = size;
		this.arr = createArray(size, size);
	}

	/**
	* 	Fills the array with numbers between 1 and high
	*
	* 	@param	high		the highest number of the interval of random numbers
	*	@param	size		the size of the array.
	*	@return	newArray	an int[] array with the random numbers.
	*/
	private int[] createArray(int high, int size){
		int[] newArray = new int[size];
		for(int i=0; i<size;i++)
			newArray[i] = (int)(high*Math.random() + 1);
		
		return newArray;
	}
	/**
	* 	getArray() gets the int[] array
	*
	*	@return	the object int[] array.
	*/
	public int[] getArray(){
		return this.arr;
	}
	/**
	* 	getSize() gets the size of the object array.
	*
	*	@return	an int representing size of the object array
	*/
	public int getSize(){
		return this.arraySize;
	}

	/**
	* 	setArray() sets the object's int[] array
 	*
	* 	@param	array	an int[] array.
	*/
	public void setArray(int[] array){
		this.arr = array;
	}

	/**
	* 	setSize() sets the object's arraySize
	*
	* 	@param	size	an int representing the size of the object's array.
	*/
	public void setSize(int size){
		this.arraySize = size;
	}
}