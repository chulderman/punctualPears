package edu.oakland.helper;

/**
*	This class is responsible for generating an int[] array
*	that JCFIteratorDemo.java will use to fill the other
*	JCF Data Structures; 
*
*	@author Chase Hulderman
*	@author Miguel Millan
*	@version version 1.0 - 160317
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
		this.arr = new int[arraySize];
	}

	/**
	* 	Fills the array with numbers between 0 and high
	* 	@param high the highest number of the interval of random numbers
	*/
	public int[] createArray(int high){
		for(int i=0; i<arraySize;i++)
			this.arr[i] = (int)(high*Math.random() + 1);
		
		return this.arr;
	}
}