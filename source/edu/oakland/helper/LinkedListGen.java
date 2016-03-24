package edu.oakland.helper;
import java.util.*;
/**
*	This class is a LinkedListGen imlementation of
*	the Linked List including a list iterator for traversing.
*
*	@author Chase Hulderman
*	@author Miguel Millan
*	@version version 1.0.4 - 160324
*	@since version 1.0.0
*/

public class LinkedListGen{

	private SingleLink currentLink;

	/**
	*	Default class constructor - sets values to null.
	*/
	public LinkedListGen(){
		this.currentLink = null;
	}

	/**
	*	isEmpty() should only be empty for newly initialized lists.
	*	
	*	@return	true if the linked list is empty. 
	*/
	public boolean isEmpty(){
		return (this.currentLink == null);
	}

	/**
	*	iterator() creates an iterator for the LinkedListGen
	*	
	*	@return	iter	an iterator object for a LinkedListGen
	*/
	public LinkedListIterator iterator(){
		LinkedListIterator iter = new LinkedListIterator(this.currentLink);
		return iter;
	}

	/**
	*	insertLink() adds an Integer to the linked list.
	*	
	*	@param	n	Takes an Integer and adds it to the list. 
	*/
	public void insertLink(Integer n) {
		SingleLink newLink = new SingleLink(n);
		newLink.setNext(currentLink);
		this.currentLink = newLink;
		return;
	}	
	
	private class LinkedListIterator implements Iterator<SingleLink>{
		private SingleLink ref;
		private SingleLink currLink = null;

		private LinkedListIterator(SingleLink link){
			this.ref = link;
		}
		public boolean hasNext(){
			if(currLink == null)
				return true;
			else if(currLink.getNext() == null)
				return false;
			else
				return true;
		}
		public SingleLink next(){
			if(ref.getNext() == null){
				throw new NoSuchElementException();
			}else if(currLink == null){
				this.currLink = ref;
				return currLink;
			}else if(currLink.getNext() == null){
				return currLink;
			}
			
			currLink = currLink.getNext();
			return currLink; 
		}
		
		public void remove(){
		}
	}
}