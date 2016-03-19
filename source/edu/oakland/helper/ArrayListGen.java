package edu.oakland.helper;
import java.util.*;

/**
*	This class is responsible for generating a Arraylist of
*	Integers; it will be filled by the int[] array generated
*	by the ArrayGen.java class.
*
*	@author Chase Hulderman
*	@author Miguel Millan
*	@version version 1.0 - 160319
*	@since version 1.0
*/
public class ArrayListGen {
	private Integer[] arr;
	private int size;
	
	/**
	*	Contructs an empty list with a given initial size.
	*
	*	@param initialSize the specified initial size assigned to size
	*/
	public ArrayListGen(int initialSize){
		size = 0;
		arr = new Integer[initialSize];
	}
	
	/**
	*	Constructs an empty list with an initial capacity of ten.
	*/
	public ArrayListGen(){
		this(10);
	}
	
	/**
	*	Populates the inner array 'arr' of this ArrayListGen object 
	*	using a given array of integers, then returns itself.
	*	
	*	@param givenArray the array of integers given.
	*	@return Returns this ArrayListGen object
	*/
	public ArrayListGen populateArrayList(int[] givenArray){
		for(int i =0; i<givenArray.length; i++)
			this.add(givenArray[i]);
		
		return this;
	}
	
	/**
	*	Add's a new integer to the inner array 'arr'.
	*
	*	@param newInt integer to be added to 'arr'.
	*/
	public void add(int newInt){
		if(size + 1 >= arr.length)
			this.increaseCapacity();
		arr[size] = newInt;
		size++;
	}
	
	/**
	*	Creates a new array of greater capacity and adds all the elements of 
	* 	the previous array to it.
	*/
	public void increaseCapacity(){
		Integer[] newArray = new Integer[2*arr.length];
		for(int i = 0; i < arr.length; i++)
			newArray[i] = arr[i];
		
		arr = newArray;
	}
	
	/**
	*	Gets the element at the specified index.
	*
	*	@param index index of the element to be retreived
	*	@return returns the Integer at the specified index of arr
	*/
	public Integer get(int index){
		return arr[index];
	}
	
	/**
	*	Sets the specified Integer to the specified index and returns
	*	the previous Integer located at that index.
	* 	
	*	@param index the target index.
	*	@param newInt Integer to be set to index.
	*	@return tmpInt 
	*/
	public Integer set(int index, Integer newInt){
		Integer tmpInt = arr[index];
		arr[index] = newInt;
		
		return tmpInt;
	}
	
	/**
	*	Retreives an ArrayListIterator object for this ArrayListGen.
	*	
	*	@return iter an ArrayListIterator
	*/
	public ArrayListIterator listIterator(){
		ArrayListIterator iter = new ArrayListIterator(this.arr, this.size);
		return iter;
	}
	
	/**
	*	This inner class provides an iterator for the ArrayListGen class
	* 	enabling traversal of its data.
	*	
	*	@author Miguel Millan
	*	@version version 1.0 - 160319
	*	@since version 1.0
	*/
	private class ArrayListIterator implements Iterator<Integer>{
		private Integer[] intArray;
		private int numberOfElements;
		private int currentIndex;

		/**
		*	Constructs an ArrayListIterator utilizing a given array of 
		* 	Integers and an integer describing the number of elements
		* 	in the array.
		*
		*	@param innerArray must be the inner array 'arr' of this
		*						ArrayListGen object
		*	@param numOfElem the number of elements in innerArray
		*/
		private ArrayListIterator(Integer[] innerArray, int numOfElem){
			intArray = innerArray;
			numberOfElements = numOfElem;
			currentIndex = -1;
		}
		
		/**
		*	@return Returns true if the ArrayListGen has a next element, 
		*			returns false otherwise.
		*/
		public boolean hasNext(){
			return (currentIndex + 1 < numberOfElements);
		}
		
		/**
		*	Returns the next value of the intArray and increments the 
		*	currentIndex.
		*
		*	@return value 
		*/
		public Integer next(){
			Integer value = -1;
			try {
				value = intArray[++currentIndex];
			}catch (NullPointerException e){
				System.out.println("End of List");	
			}
			return value; 
		}
		
		public void remove(){
		}
	}
}