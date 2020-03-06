
package lists_235;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * 
 * This interface represents common actions done to Collections, whether
 * they are stacks, queues, bags, etc.
 *
 * You are to implement this interface as a Generic Linked List and as an Integer Array List
 * 
 * IMPORTANT: Please note that "Linked_List_235.java" is for Part 01. Where you see "Array_List_235.java",
 * that is provided for Part 02.
 * 
 * @author H. James de St. Germain, modified by Alex May
 */

public interface List_235<Type>
{
	
	/**
	 * Add to the beginning of the list.
	 * 
	 * <p>
	 * For Linked_List_235.java, this should behave in the same manner as the
	 * java.LinkedList Class. It will add a new node with the data to the 
	 * beginning of the linked list.
	 * 
	 * <p>
	 * For Array_List_235.java, this will add the value to the beginning of the "bounded" array.
	 * This will call the "expand" method in the Array_List_235.java file. 
	 * 
	 * @param data - The data to add
	 */
	void add_first( Type data );
	
	/**
	 * Add to the end of the list.
	 * 
	 * <p>
	 * For Linked_List_235.java, this should behave in the same manner as the
	 * java.LinkedList Class. It will add a new with the data node to the 
	 * end of the linked list.
	 * 
	 * <p>
	 * For Array_List_235.java, this will add the to the end of the "bounded" array. 
	 * This will call the "expand" method in the Array_List_235.java file. 
	 * 
	 * @param data - The data to add
	 */
	void add_last( Type data );

	/**
	 * Add to the middle of the list.
	 * 
	 * <p>
	 * For Linked_List_235.java, add the node after the given node "index". For
	 * example, if there are 8 nodes, (this would mean that the first node would
	 * be at "index" 0, and the last node would be at "index" 7) 
	 * and the "after" variable is 3, the node would be placed at "index" 4, or 
	 * be the 5th node in the linked list.
	 * 
	 * Another example. If "after" = 0, it would mean after the first node.
	 * 
	 * <p>
	 * For Array_List_235.java, this will add the value to the index after
	 * the "after" variable. This will call the "expand" AND "shift" method in the 
	 * Array_List_235.java file.
	 * 
	 * 
	 * @param after - The location in the list to place the data after.
	 *            If "after" is larger or equal to the length of the list, then
	 *            put the new node at the end of the list. if the value of after is larger than the
	 *            length of the list, then add to the end.
	 */
	void add_middle( int after, Type data );

	
	/**
	 * Clear the list.
	 * 
	 * <p>
	 * For Linked_List_235.java, this will remove all the nodes and set the size to 0.
	 * 
	 * <p>
	 * For Array_List_235.java, this will set the size to 0 and set all the values to null.
	 */
	void clear(); 

	/**
	 * Return true if the item is in the list.
	 * 
	 * <p>
	 * IMPORTANT: For full points, this method needs to be implemented in an ITERATIVE manner. 
	 * 
	 * @param item  - The item you are trying to find
	 * @return - true if the list contains the item.
	 */
	boolean contains( Type item ); 

	/**
	 * Return true if the item is in the list.
	 * 
	 * <p>
	 * IMPORTANT: For full points, this method needs to be implemented in an RECURSIVE manner. 
	 * 
	 * <p>
	 * For Array_List_235.java, this means that there should be a recursive helper method.
	 * 
	 * @param item  - The item you are trying to find
	 * @return - true if the list contains the item.
	 */
	boolean contains_recursive( Type item ); 

	//***************************************************************************************************
	// the following four methods throw an exception if the data does not exist (rather than return null) 
	
	
	/**
	 * Returns the first value in the list.
	 * 
	 * @return - The first value in the list.
	 * @throws NoSuchElementException
	 */
	Type get_first() throws NoSuchElementException;
	
	/**
	 * Returns the last value in the list.
	 * 
	 * @return - The last value in the list.
	 * @throws NoSuchElementException
	 */
	Type get_last()  throws NoSuchElementException; 
	
	/**
	 * Remove the first item from the list, and return it's value.
	 * 
	 * <p>
	 * For Linked_List_235.java, this will remove all the node at the beginning of the list.
	 * 
	 * <p>
	 * For Array_List_235.java, this will set the value a the "first" index to a temp value,
	 * set the value at the "first" index to null, and then increment the "first" index.
	 * 
	 * 
	 * @return - The value in the first element in the list that was removed.
	 * @throws NoSuchElementException
	 */
	Type remove_first() throws NoSuchElementException; // get value of first item and remove the node from the list
	
	/**
	 * Remove the last item from the list, and return it's value.
	 * 
	 * <p>
	 * For Linked_List_235.java, this will remove all the node at the end of the list.
	 * 
	 * <p>
	 * For Array_List_235.java, this will set the value a the "first" index to a temp value,
	 * set the value at the "first" index to null, and then increment the "first" index.
	 * 
	 * 
	 * @return - The value in the first element in the list that was removed.
	 * @throws NoSuchElementException
	 */
	Type remove_last()  throws NoSuchElementException;
	
	// the previous four methods throw an exception if the data does not exist (rather than return null) 
	//***************************************************************************************************

	/**
	 * Return the size of the list (non-recursive). Simply return the size class variable.
	 * 
	 * @return - The size of the list, or the number of elements in it.
	 */
	int size();

	/**
	 * With a single traversal of the list, IN PLACE,
	 * swap the order of the entire list, such that
	 * that which was last is first and that which was first is last.
	 */
	void reverse();

	/**
	 * Return the size of the list.
	 * 
	 * <p>
	 * For Linked_List_235.java, this must be computed recursively. Check for the case if there isn't
	 * a firstNode in the list. After that, simply call the Node<Type>.length() method.
	 * 
	 * <p>
	 * For Array_List_235.java, you can simply return the size method.
	 * 
	 * @return - The size of the list, or number of values in it.
	 */
	int compute_size_recursive();

	/**
	 * Return the list as a java.ArrayList in reverse order.
	 * 
	 * <p>
	 * For Linked_List_235.java, this must use post recursion to return the array list in reverse order.
	 * Simply use the Node<Type>.to_array_post_recursive(). This will recursively traverse
	 * the list, building up an ArrayList of the data.
	 * 
	 * <p>
	 * For Array_List_235.java, you will create a new reversely ordered array iteratively 
	 * 
	 * @return - a java.ArrayList of the data in the linked list in reverse order.
	 */
	ArrayList<Type> to_ArrayList_post_recurse();

	/**
	 * Iteratively traverse the list, building up an ArrayList of the data in order.
	 * do not use Node methods.
	 * 
	 * @return - a java.ArrayList of the List.
	 */
	ArrayList<Type> to_ArrayList();


}
