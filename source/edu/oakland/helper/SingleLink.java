package edu.oakland.helper;

/**
*	This class is responsible for generating Links to
*	build the SinglyLinkedList<SingleLink> 
*
*	@author Chase Hulderman
*	@author Miguel Millan
*	@version version 1.0.1
*	@since version 1.0.0
*/

public class SingleLink {
	
	private SingleLink nextLink;
	private Integer value;

	public SingleLink(){
		this.value = null;
		this.nextLink = null;
	}
	public SingleLink(int i){
		this.value = i;
		this.nextLink = null;
	}
	public SingleLink(Integer n){
		this.value = n;
		this.nextLink = null;
	}
	public SingleLink(int i, SingleLink link){
		this.value = i;
		this.nextLink = link;
	}
	public SingleLink(Integer n, SingleLink link){
		this.value = n;
		this.nextLink = link;
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