package edu.oakland.helper;

/**
*	This class is responsible for generating the SinglyLinkedList<SingleLink> from
*	SinglLinks created by the SingleLink class;
*
*	@author Chase Hulderman
*	@author Miguel Millan
*	@version version 1.0.0
*	@since version 1.0.0
*/

public class LinkedListGen extends LinkedList<SingleLink> {

	private SingleLink currentLink;

	/**
	*	Default class constructor - sets values to null.
	*/
	public LinkedListGen(){
		this.currentLink = null;
	}

	public boolean isEmpty(){
		return (this.currentLink = null);
	}
	public void insertLink(Integer n, SingleLink link){
		SingleLink newLink = new SingleLink(n, link);
		newLink.setNext(currentLink);
		this.currentLink = newLink;
		return;
	}
}