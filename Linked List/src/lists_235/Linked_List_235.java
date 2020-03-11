package lists_235;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;


public class Linked_List_235<Type> implements List_235<Type> {

	List<Type> list;            //UNUSED
	public Node<Type> firstNode;
	public Node<Type> lastNode;
	//public Node<Type> next;
	int size;
	int count;
	

	/**
	 * Constructor for the Linked List 
	 */
	public Linked_List_235() {
		firstNode = null;
		size = 0;
		 //Do we even need a list? I'm thinking we are doing everything a linked_list can already do. Creating nodes and implementing
										//these methods seem to be creating LinkedList. We are simply re-inventing the wheel to learn how they work right??
		//list.add(firstNode.data);
	}

	@Override
	public void add_first(Type data) {
		Node<Type> newFirstNode = new Node<Type>(data, null);
		newFirstNode.next = firstNode;
		firstNode = newFirstNode;   //How does this not make a list with firstNode, firstNode, or even a thousand more of the same??
		
	}

	@Override
	public void add_last(Type data) {
		if (firstNode == null) {
			firstNode.data = data;
			return;
		}
			
			else { Node<Type> current = firstNode; 
					while (current.next !=null) {
						current = current.next;
					}
					Node<Type> last = new Node<Type>(data, null);
					current.next = last;
			}
		}
	

	@Override
	public void add_middle(int after, Type data) {
		count = 0;
		Node<Type> current = firstNode;
		while (count < after) {
			current = current.next;
			count++;
		}
		Node<Type> saved = current.next;
		current.next = new Node<Type>(data, saved); //Is current.next referencing a whole new branch if we were to put it as the argument, or does creating
		//alt parameters (data, current.next		//a stored (ie saved, as above) node the soultion to keep us "on the train")?
		
	}

	@Override
	public void clear() {
		 this.firstNode = null;
		 this.size = 0;
			
		
	}

	@Override
	public boolean contains(Type item) {
		 Node<Type> current = firstNode; 
		 if (firstNode.equals(null)) 	  return false;
		 do {
				if (current.data == item) return true;
				current = current.next;
			}	while (current.next !=null);
					return false; 
	}

	@Override
	public boolean contains_recursive(Type item) {
		// current = firstNode     current.next
		if (this.firstNode.equals(null)) return false;
		return this.firstNode.contains_recursive(item);
		}

	public void helper_method() {
		
	}
	@Override
	public Type get_first() throws NoSuchElementException {
		return firstNode.data;
	}

	@Override
	public Type get_last() throws NoSuchElementException {
		 Node<Type> current = firstNode; 
			while (current.next !=null) {
				current = current.next;
			}
			return current.data;
	}

	@Override
	public Type remove_first() throws NoSuchElementException {
		Type type = firstNode.data;
		firstNode = null;
				size--;
		return type; //ask BR MAY
	}

	@Override
	public Type remove_last() throws NoSuchElementException {
		Node<Type> current = firstNode;
		while (current.next != null) {
			current = current.next;
		}
		Type type = current.data;
		current = null;
		size--;
		return type;
	}

	@Override
	public int size() {
		 Node<Type> current = firstNode; 
			while (current.next !=null) {
				current = current.next;
				size++;
			}
		return size;
	}

	@Override
	public void reverse() {
		 Node<Type> first = firstNode;
		 Node<Type> current = firstNode; 
		 //while (count < size % 2)
		 //{ count++;
		 //  DO RECURSION public Node<Type> recursion(first) { . . . firstsaved = first.next. . . return firstsaved}
		 
		 //first = current.next
		 //  loop and swap-save ie while first.next != null
		 //
		 //append a .next to variable
			while (current.next.next !=null) {
				current = current.next;
			}
			Node<Type> saved = current;
			current = first;
			firstNode = saved;
			
			//current.next.data = first.next.data;
			//current.next.next = first.next.next;
	}

	@Override
	public int compute_size_recursive() {
		// FIXME: See List_235.java JavaDoc Comments
		return 0;
	}

	@Override
	public ArrayList<Type> to_ArrayList_post_recurse() {
		// FIXME: See List_235.java JavaDoc Comments
		return null;
	}

	@Override
	public ArrayList<Type> to_ArrayList() {
		// FIXME: See List_235.java JavaDoc Comments
		return null;
	}
	
	/**
	 * Returns the whole linked list as a string. 
	 * 
	 * Please look at the Node<Type>.toSting method for how to implement.
	 * It will be done recursively. 
	 * 
	 * @return String containing the lists data points
	 */
	@Override
	public String toString()
	{
		return firstNode.toString();	
	}
	
	//****************************************************************************
	// Beginning of Node Class

	/**
	 * Node class that contains a pointer to another Node and data with that node.
	 * Contains various functions that give information on the node, it's data,
	 * and the linked nodes after it. 
	 *
	 * Pictorially, a node is:
	 *
	 *  data  next
	 *  ---------- 
	 *  | 5  |---+--->
	 *  ---------- 
	 *  
	 *  Note, while a 5 is used above any "Type" could be contained in the node
	 */
	//////////////////////////////					//////////////////////////////
	////////////////////////////////			//////////////////////////////
	//////////////////////////////					//////////////////////////////
	//////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
////////////////////////////////////////////////////////////
////////////////////////////////				//////////////////////////////
	//////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	//////////////////////////////
	////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	////////////////////////////////
	////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	//////////////////////////////
	//////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	//////////////////////////////
	//////////////////////////////					//////////////////////////////
	////////////////////////////////			//////////////////////////////
	//////////////////////////////					//////////////////////////////
	//////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
////////////////////////////////////////////////////////////
////////////////////////////////				//////////////////////////////
	//////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	//////////////////////////////
	////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	////////////////////////////////
	////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	//////////////////////////////
	//////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	//////////////////////////////
	//////////////////////////////					//////////////////////////////
	////////////////////////////////			//////////////////////////////
	//////////////////////////////					//////////////////////////////
	//////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
////////////////////////////////////////////////////////////
////////////////////////////////				//////////////////////////////
	//////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	//////////////////////////////
	////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	////////////////////////////////
	////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	//////////////////////////////
	//////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	//////////////////////////////
	//////////////////////////////					//////////////////////////////
	////////////////////////////////			//////////////////////////////
	//////////////////////////////					//////////////////////////////
	//////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
////////////////////////////////////////////////////////////
////////////////////////////////				//////////////////////////////
	//////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	//////////////////////////////
	////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	////////////////////////////////
	////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	//////////////////////////////
	//////////////////////////////////////////////////////////////				//////////////////////////////
	////////////////////////////////				//////////////////////////////
	//////////////////////////////
	
	static class Node<Type>
	{
		Type data;
		Node<Type> next;

		Node( Type the_data, Node<Type> after_me) {
			this.data = the_data;
			this.next = after_me;
		}

		/**
		 * Returns the number of nodes, including itself, that link to each other.
		 * 
		 * This function must be written recursively.
		 *         
		 *  Note: 1) it doesn't matter if something (or multiple somethings) points to this node, 
		 *        2) if this node doesn't point at anything, then the size would be 1.
		 *        
		 * @return the length of this "chain of nodes", including self.
		 */
		protected int length() {
			// FIXME: Recursively traverse the linked list to know the count.
			return 0;
		}

		/**
		 * Recursively determine if the item is in this node or the nodes after
		 * 
		 * @param item
		 *            - The value to find in the linked list
		 * @return true - if item in linked list
		 */
		protected boolean contains_recursive( Type item ) {
			if (data.equals(item)) {
				return true;
			}
			if (next == null) {
				return false;
			}			
			return next.contains_recursive(item);
		}


		/**
		 * This function must be written recursively, using the helper method below.
		 * 
		 * Create an array list containing the data from this node and all nodes after it. 
		 * 
		 * Call the helper method to recursively add to the array.
		 * 
		 * @return - A java.ArrayList that is reverse of the Linked List
		 */
		protected ArrayList<Type> to_ArrayList_post_recursive() {
			// FIXME: Create a new ArrayList, then pass the array list in the helper recursive method below.
			return null;
		}

		/**
		 * This is the helper method to the to_ArrayList_post_recursive() method above. 
		 * 
		 * Add the data to the array list AFTER the recursive call, thus "reversing" the list.
		 * 
		 * @param array - The array to add the values
		 */
		protected void to_ArrayList_post_recursive(ArrayList<Type> array) {
			// FIXME: Check and see if there is a "next" node
			// If so, recursively call the method
			// Then add the data to the ArrayList
		}

		/**
		 * This method must be implemented using recursion
		 *
		 * Creates a string that describes the current node and all following nodes, for
		 * example, a list of the nubmers 0, 1, 2, 3 would print as:
		 * 
		 * "[0]--> [1]--> [2]--> [3]--> null"
		 *
		 * WARNING: the syntax must be exact.  
		 *          "open square bracket, data, close square bracket, hyphen, hyphen, greater than, space,
		 *          ... null"
		 *
		 * @return a string representation of this chain of nodes
		 */
		public String toString() {
			// FIXME: Build the string as noted in the comments above.
			return null;
		}
	}
	
	//****************************************************************************
	// End of Node Class

}
