package edu.oakland.helper;

/**
*	This class is responsible for generating an int[] array
*	that JCFIteratorDemo.java will use to fill the other
*	JCF Data Structures; 
*
*	@author Chase Hulderman
*	@author Miguel Millan
*	@version version 1.0 - 160216
*	@since version 1.0
*/

public class ArrayGen {
	private int[] arr;
	private int arraySize;
	
	public ArrayGen(){
		this(20);
	}
	
	public ArrayGen(int size){
		this.arraySize = size;
		this.arr = new int[arraySize];
	}

	public int[] createArray(int high){
		for(int i=0; i<arraySize;i++)
			this.arr[i] = (int)(high*Math.random() + 1);
		
		return this.arr;
	}
	
	public int[] createArray(){
		for(int i=0; i<arraySize;i++)
			this.arr[i] = (int)(20*Math.random() + 1);
		
		return this.arr;
	}
	
	public static void main(String[] args) {
		ArrayGen aGen = new ArrayGen();
		int[] arr1 = aGen.createArray();
		
		for(int i=0; i<arr1.length; i++)
			System.out.print(arr1[i] + " ");
	}
}