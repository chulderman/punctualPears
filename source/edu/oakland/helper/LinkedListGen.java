package edu.oakland.helper;

/**
*	This class is responsible for generating the LinkedList<SingleLink> imlementation of
*	SingleLinks including a list iterator for traversing.
*
*	@author Chase Hulderman
*	@author Miguel Millan
*	@version version 1.0.2
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

	public boolean isEmpty(){
		return (this.currentLink = null);
	}
	public LinkedListIterator listIterator(){
		LinkedListIterator iter = new LinkedListIterator(this.currentLink);
		return iter;
	}
	public void insertLink(Integer n, SingleLink link){
		SingleLink newLink = new SingleLink(n, link);
		newLink.setNext(currentLink);
		this.currentLink = newLink;
		return;
	}	
	public LinkedListGen createList(ArrayListGen integerArray){
		LinkedListGen newList = new LinkedListGen();
		// Fill linked list with the integer array //
		return newList;
	}

	private class LinkedListIterator {
		private SingleLink ref;

		private LinkedListIterator(SingleLink link){
			this.ref = link;
		}
		public boolean hasNext(){
			return (ref != null);
		}
		public Integer next(){
			if(ref.getNext() == null) {
				return null;
			}
			Integer value = ref.getValue();
			this.ref = ref.getNext();
			return value;
		}
	}
}