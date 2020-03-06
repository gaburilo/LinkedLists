package lists_235;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Linked_List_235<Type> implements List_235<Type> {

	public Node<Type> firstNode;
	int size;

	/**
	 * Constructor for the Linked List 
	 */
	public Linked_List_235() {
		// TODO: Set up the firstNode and size.
	}

	@Override
	public void add_first(Type data) {
		// FIXME: See List_235.java JavaDoc Comments
	}

	@Override
	public void add_last(Type data) {
		// FIXME: See List_235.java JavaDoc Comments
	}

	@Override
	public void add_middle(int after, Type data) {
		// FIXME: See List_235.java JavaDoc Comments
	}

	@Override
	public void clear() {
		// FIXME: See List_235.java JavaDoc Comments
	}

	@Override
	public boolean contains(Type item) {
		// FIXME: See List_235.java JavaDoc Comments
		return false;
	}

	@Override
	public boolean contains_recursive(Type item) {
		// FIXME: See List_235.java JavaDoc Comments
		return false;
	}

	@Override
	public Type get_first() throws NoSuchElementException {
		// FIXME: See List_235.java JavaDoc Comments
		return null;
	}

	@Override
	public Type get_last() throws NoSuchElementException {
		// FIXME: See List_235.java JavaDoc Comments
		return null;
	}

	@Override
	public Type remove_first() throws NoSuchElementException {
		// FIXME: See List_235.java JavaDoc Comments
		return null;
	}

	@Override
	public Type remove_last() throws NoSuchElementException {
		// FIXME: See List_235.java JavaDoc Comments
		return null;
	}

	@Override
	public int size() {
		// FIXME: See List_235.java JavaDoc Comments
		return 0;
	}

	@Override
	public void reverse() {
		// FIXME: See List_235.java JavaDoc Comments
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
			// FIXME: Recursively traverse the linked list to find if the item is in the linked list.
			return false;
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
