package edu.oakland.helper;

/**
*	This class is responsible for generating the LinkedList<SingleLink> imlementation of
*	SingleLinks including a list iterator for traversing.
*
*	@author Chase Hulderman
*	@author Miguel Millan
*	@version version 1.0.3
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
	*	insertLink() adds an Integer to the linked list.
	*	
	*	@param	n	Takes an Integer and adds it to the list. 
	*/
	public LinkedListIterator listIterator(){
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

	/**
	*	createList() coverts the ArrayListGen values to LinkedListGen values.
	*	
	*	@param	integerArray	Takes an ArrayListGen
	*	@return	newList			Returns a LinkedListGen with the elements of the ArrayListGen
	*/
	public LinkedListGen createList(ArrayListGen integerArray){
		LinkedListGen newList = new LinkedListGen();
		ArrayListIterator iter = new integerArray.listIterator();

		while(iter.hasNext()){
			newList.insertLink(iter.next());	
		}
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
			Integer value = ref.getValue();
			try {
				this.ref = ref.getNext();
			}catch (NullPointerException e){
				System.out.println("End of List");	
			}
			return value; 
		}
	}
}