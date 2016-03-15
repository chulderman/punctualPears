package edu.oakland.helper;

/**
*	This class is responsible for generating Links to
*	build the SinglyLinkedList<SingleLink> 
*
*	@author Chase Hulderman
*	@author Miguel Millan
*	@version version 1.0 - 160216
*	@since version 1.0
*/

public class SingleLink {
	
	private SingleLink nextLink;
	private Integer value;

	public SingleLink(){
	
	}
	public void setNext(SingleLink e){
		this.nextLink = e;
		return;
	}
	public void setValue(Integer n){
		this.value = n;
		return;
	}
	public void setValue(int i){
		this.value = new Integer(i);
		return;
	}
	public SingleLink getNext(){
		return this.nextLink;
	}
	public Integer getValue(){
		return this.value;
	}

}