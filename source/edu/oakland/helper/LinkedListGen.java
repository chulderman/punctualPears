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
		return (this.currentLink == null);
	}
	public LinkedListIterator listIterator(){
		LinkedListIterator iter = new LinkedListIterator(this.currentLink);
		return iter;
	}
	public void insertLink(Integer n) {
		SingleLink newLink = new SingleLink(n);
		newLink.setNext(currentLink);
		this.currentLink = newLink;
		return;
	}	
	public LinkedListGen createList(ArrayListGen integerArray){
		LinkedListGen newList = new LinkedListGen();
		ArrayListIterator iter = new newList.listIterator();
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