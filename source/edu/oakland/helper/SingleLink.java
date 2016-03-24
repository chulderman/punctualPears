package edu.oakland.helper;

/**
*	This class is responsible for generating Links to
*	build the LinkedListGen<SingleLink> 
*
*	@author Chase Hulderman
*	@author Miguel Millan
*	@version version 1.0.3
*	@since version 1.0.0
*/

public class SingleLink {
	
	private SingleLink nextLink;
	private Integer value;

	/**
	*	Default class constructor - sets values to null.
	*/
	public SingleLink(){
		this.value = null;
		this.nextLink = null;
	}

	/**
	*	Class constructor
	*
	*	@param	i	Set's link value by int
	*/
	public SingleLink(int i){
		this.value = new Integer(i);
		this.nextLink = null;
	}
	
	/**
	*	Class constructor
	*
	*	@param	n	Sets link value by Integer
	*/
	public SingleLink(Integer n){
		this.value = n;
		this.nextLink = null;
	}

	/**
	*	Class constructor
	*
	*	@param	link	Sets SingleLink's link reference
	*/
	public SingleLink(SingleLink link){
		this.value = null;
		this.nextLink = link;
	}

	/**
	*	Class constructor
	*
	*	@param	i		Sets link value by int
	*	@param	link	Sets SingleLink's link reference
	*/
	public SingleLink(int i, SingleLink link){
		this.value = new Integer(i);
		this.nextLink = link;
	}

	/**
	*	Class constructor
	*
	*	@param	i		Sets link value by Integer
	*	@param	link	Sets SingleLink's link reference
	*/
	public SingleLink(Integer n, SingleLink link){
		this.value = n;
		this.nextLink = link;
	}

	// Begin Mutators //
	
	/**
	*	Sets (or re-sets) the link's new link reference.
	*	
	*	@param	e	SingleLink reference address
	*/
	public void setNext(SingleLink e){
		this.nextLink = e;
		return;
	}

	/**
	*	Sets (or re-sets) the link value by recieving an Integer.
	*	
	*	@param	n	Recieves Integer and sets (or re-sets) the SingleLink value
	*/
	public void setValue(Integer n){
		this.value = n;
		return;
	}

	/**
	*	Overloaded method. Sets (or re-sets) the link value by converting an int to Integer
	*	
	*	@param	i	Recieves int and sets SingleLink value as Integer. 
	*/
	public void setValue(int i){
		this.value = new Integer(i);
		return;
	}
	// End Mutators //

	// Begin Accessors //

	/**
	*	Retrieves the next link.
	*	
	*	@return	Returns the reference for the next SingleLink link.
	*/
	public SingleLink getNext(){
		return this.nextLink;
	}

	/**
	*	Retrieves link value.
	*	
	*	@return	returns link value as an Integer
	*/
	public Integer getValue(){
		return this.value;
	}
	// End Accessors //

	/**
	*	createList() coverts the ArrayListGen values to LinkedListGen values.
	*	
	*	@param	intArray	Takes an int[] array
	*	@return	newList		Returns a LinkedListGen with the elements of the ArrayListGen
	*/
	public LinkedListGen createList(int[] intArray){
		LinkedListGen newList = new LinkedListGen();

		for(int i : intArray){
			newList.insertLink(new Integer(i));
		}
		return newList;
	}
}