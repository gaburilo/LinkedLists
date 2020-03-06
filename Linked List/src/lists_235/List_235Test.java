package lists_235;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import org.junit.Test;

public class List_235Test {

	/**
	 * Allow changing between linked and array lists.
	 * Simply un/comment out the lines below to choose 
	 * which list implementation to test.
	 */
	public List_235<Integer> new_list() {
		return new Linked_List_235<Integer>();
//		return new Array_List_235<Integer>();
	}

	@Test
	public void testAddFirstGetFirst() {
		List_235<Integer> testList = new_list();

		testList.add_first(1);
		assertTrue(testList.get_first() == 1);

		testList.add_first(2);
		assertTrue(testList.get_first() == 2);

		testList.add_first(3);
		assertTrue(testList.get_first() == 3);
	}
	
	@Test
	public void testAddFirstGetLast() {
		List_235<Integer> testList = new_list();

		testList.add_first(1);
		assertTrue(testList.get_last() == 1);

		testList.add_first(2);
		assertTrue(testList.get_last() == 1);

		testList.add_first(3);
		assertTrue(testList.get_last() == 1);
	}
	
	@Test
	public void testAddLastGetFirst() {
		List_235<Integer> testList = new_list();

		testList.add_last(3);
		assertTrue(testList.get_first() == 3);

		testList.add_last(2);
		assertTrue(testList.get_first() == 3);

		testList.add_last(1);
		assertTrue(testList.get_first() == 3);
	}

	@Test
	public void testAddLastGetLast() {
		List_235<Integer> testList = new_list();

		testList.add_last(3);
		assertTrue(testList.get_last() == 3);

		testList.add_last(2);
		assertTrue(testList.get_last() == 2);

		testList.add_last(1);
		assertTrue(testList.get_last() == 1);
	}

	@Test
	public void testAddMiddleGetLast() {
		List_235<Integer> testList = new_list();

		testList.add_first(0);
		assertTrue(testList.get_last() == 0);
		
		testList.add_middle(0, 1);
		assertTrue(testList.get_last() == 1);
		
		testList.add_middle(1, 3);
		assertTrue(testList.get_last() == 3);
		
		testList.add_middle(1, 2);
		assertTrue(testList.get_last() == 3);
		
		testList.add_middle(3, 4);
		assertTrue(testList.get_last() == 4);
		
		testList.add_middle(12, 5);
		assertTrue(testList.get_last() == 5);
	}
	
	@Test
	public void testAddMiddleGetLastAndContains() {
		List_235<Integer> testList = new_list();

		testList.add_first(0);
		assertTrue(testList.get_last() == 0);
		
		testList.add_middle(0, 1);
		assertTrue(testList.get_last() == 1);
		
		testList.add_middle(1, 3);
		assertTrue(testList.get_last() == 3);
		
		testList.add_middle(1, 2);
		assertTrue(testList.get_last() == 3);
		
		testList.add_middle(3, 4);
		assertTrue(testList.get_last() == 4);
		
		testList.add_middle(12, 5);
		assertTrue(testList.get_last() == 5);

		assertTrue(testList.contains(0));
		assertTrue(testList.contains(1));
		assertTrue(testList.contains(2));
		assertTrue(testList.contains(3));
		assertTrue(testList.contains(4));
		assertTrue(testList.contains(5));
	}
	
	@Test
	public void testAddMiddleEmpty() 
	{
		List_235<Integer> testList = new_list();

		testList.add_middle(0, 1);

		assertTrue(testList.get_last() == 1);
		assertTrue(testList.get_first() == 1);
		assertTrue(testList.contains(1));

	}

	@Test
	public void testClearSize() 
	{
		List_235<Integer> testList = new_list();

		testList.add_first(1);
		testList.add_first(2);
		testList.add_first(3);
		testList.clear();
		assertEquals(0, testList.size());
	}
	
	@Test (expected = NoSuchElementException.class)
	public void testClearGetFirst() 
	{
		List_235<Integer> testList = new_list();

		testList.add_first(1);
		testList.add_first(2);
		testList.add_first(3);
		testList.clear();
		assertEquals(0, testList.size());
		
		testList.get_first();

	}
	
	@Test (expected = NoSuchElementException.class)
	public void testClearGetLast() 
	{
		List_235<Integer> testList = new_list();

		testList.add_first(1);
		testList.add_first(2);
		testList.add_first(3);
		testList.clear();
		assertEquals(0, testList.size());
		
		testList.get_last();

	}

	@Test
	public void testContains() 
	{
		List_235<Integer> testList = new_list();

		testList.add_first(1);
		testList.add_first(2);
		testList.add_first(3);

		assertTrue(testList.contains(1));
		assertTrue(testList.contains(3));
		assertFalse(testList.contains(4));
	}

	@Test
	public void testContainsRecursive() 
	{

		List_235<Integer> testList = new_list();

		testList.add_first(1);
		testList.add_first(2);
		testList.add_first(3);
		testList.add_first(4);
		testList.add_first(5);
		testList.add_first(6);

		assertTrue(testList.contains_recursive(1));
		assertTrue(testList.contains_recursive(6));
		assertTrue(testList.contains_recursive(4));

		assertFalse(testList.contains_recursive(-4));
		assertFalse(testList.contains_recursive(62));
	}


	@Test
	public void testGetFirst() 
	{
		List_235<Integer> testList = new_list();

		testList.add_first(1);
		testList.add_first(2);
		testList.add_first(3);

		List_235<Integer> testList1 = new_list();

		testList1.add_first(4);
		testList1.add_first(5);
		testList1.add_first(6);

		List_235<Integer> testList2 = new_list();

		testList2.add_first(7);
		testList2.add_first(8);
		testList2.add_first(9);

		assertEquals(new Integer(3), testList.get_first());
		assertEquals(new Integer(6), testList1.get_first());
		assertEquals(new Integer(9), testList2.get_first());

	}

	@Test (expected = NoSuchElementException.class)
	public void testGetFirstWithEmptyList()
	{
		List_235<Integer> testList = new_list();
		testList.get_first();
	}


	@Test
	public void testGetLast() 
	{
		List_235<Integer> testList = new_list();

		testList.add_first(1);
		testList.add_first(2);
		testList.add_first(3);

		List_235<Integer> testList1 = new_list();

		testList1.add_first(4);
		testList1.add_first(5);
		testList1.add_first(6);

		List_235<Integer> testList2 = new_list();

		testList2.add_first(7);
		testList2.add_first(8);
		testList2.add_first(9);

		assertEquals(new Integer(1), testList.get_last());
		assertEquals(new Integer(4), testList1.get_last());
		assertEquals(new Integer(7), testList2.get_last());
	}

	@Test (expected = NoSuchElementException.class)
	public void testGetLastWithEmptyList()
	{
		List_235<Integer> testList = new_list();
		testList.get_last();
	}

	@Test
	public void testRemoveFirst() 
	{
		List_235<Integer> testList = new_list();

		testList.add_last(3);
		testList.add_last(2);
		testList.add_last(1);

		assertEquals(new Integer(3), testList.get_first());

		testList.remove_first();
		assertEquals(new Integer(2), testList.get_first());

		testList.remove_first();
		assertEquals(new Integer(1), testList.get_first());

	}

	@Test (expected = NoSuchElementException.class)
	public void testRemoveFirstWithEmptyList()
	{
		
		List_235<Integer> testList = new_list();
		testList.add_last(1);
		testList.remove_first();
		assertEquals(new Integer(1), testList.get_first());
		testList.remove_first();
	}

	@Test
	public void testRemoveLast() 
	{

		List_235<Integer> testList = new_list();

		testList.add_last(3);
		testList.add_last(2);
		testList.add_last(1);
		
		assertEquals(new Integer(1), testList.get_last());

		testList.remove_last();
		assertEquals(new Integer(2), testList.get_last());

		testList.remove_last();
		assertEquals(new Integer(3), testList.get_last());

	}

	@Test (expected = NoSuchElementException.class)
	public void testRemoveLastWithEmptyList()
	{
		List_235<Integer> testList = new_list();
		testList.add_last(1);
		testList.remove_last();
		assertEquals(new Integer(1), testList.get_first());
		testList.remove_last();
	}

	@Test
	public void testSize() 
	{
		List_235<Integer> testList = new_list();

		assertEquals(0, testList.size());

		testList.add_last(3);
		testList.add_last(2);
		testList.add_last(1);

		assertEquals(3, testList.size());
		
		testList.remove_last();
		testList.remove_last();
		testList.remove_last();
		
		assertEquals(0, testList.size());

	}

	@Test
	public void testReverse() 
	{
		List_235<Integer> testList = new_list();

		testList.add_last(1);
		testList.add_last(2);
		testList.add_last(3);
		testList.add_last(4);
		testList.add_last(5);
		testList.add_last(6);


		testList.reverse();

		assertEquals(new Integer(1), testList.get_last());
		assertEquals(new Integer(6), testList.get_first());

	}

	@Test
	public void testComputeSizeRecursive() 
	{
		List_235<Integer> testList = new_list();

		assertEquals(0, testList.compute_size_recursive());

		testList.add_last(3);
		testList.add_last(2);
		testList.add_last(1);

		assertEquals(3, testList.compute_size_recursive());
	}

	@Test
	public void testToArrayListPostRecurse() 
	{
		List_235<Integer> testList = new_list();

		testList.add_last(0);
		testList.add_last(1);
		testList.add_last(2);
		testList.add_last(3);
		testList.add_last(4);

		ArrayList<Integer> comparingList=new ArrayList<Integer>();
		comparingList.add(4);
		comparingList.add(3);
		comparingList.add(2);
		comparingList.add(1);
		comparingList.add(0);
		
		assertEquals(comparingList, testList.to_ArrayList_post_recurse());
	}

	@Test
	public void testToArrayList() 
	{
		List_235<Integer> testList = new_list();

		testList.add_last(0);
		testList.add_last(1);
		testList.add_last(2);
		testList.add_last(3);
		testList.add_last(4);
		testList.add_last(0);
		testList.add_last(1);
		testList.add_last(2);
		testList.add_last(3);
		testList.add_last(4);
		testList.add_last(0);
		testList.add_last(1);
		testList.add_last(2);
		testList.add_last(3);
		testList.add_last(4);
		testList.add_last(0);
		testList.add_last(1);
		testList.add_last(2);
		testList.add_last(3);
		testList.add_last(4);

		ArrayList<Integer> comparingList=new ArrayList<Integer>();
		comparingList.add(0);
		comparingList.add(1);
		comparingList.add(2);
		comparingList.add(3);
		comparingList.add(4);
		comparingList.add(0);
		comparingList.add(1);
		comparingList.add(2);
		comparingList.add(3);
		comparingList.add(4);
		comparingList.add(0);
		comparingList.add(1);
		comparingList.add(2);
		comparingList.add(3);
		comparingList.add(4);
		comparingList.add(0);
		comparingList.add(1);
		comparingList.add(2);
		comparingList.add(3);
		comparingList.add(4);

		assertEquals(comparingList, testList.to_ArrayList());
	}
	
	@Test
	public void testAddManyFristLastMiddle() 
	{

		List_235<Integer> testList = new_list();
		
		for (int i = 0; i < 10000; i++) {
			testList.add_first((int) (Math.random() * 10000));			
		}
		for (int i = 0; i < 10000; i++) {
			testList.add_last((int) (Math.random() * 10000));			
		}
		for (int i = 0; i < 10000; i++) {
			testList.add_middle((int) (Math.random() * 9999), (int) (Math.random() * 10000));			
		}
		testList.add_first(0);
		testList.add_last(1);

		assertTrue(testList.get_first() == 0);

		assertTrue(testList.get_last() == 1);

	}
	
	@Test
	public void testAddMiddleMany() 
	{

		List_235<Integer> testList = new_list();		
		
		for (int i = 0; i < 5000; i++) {
			testList.add_middle((int) (Math.random() * 5000), (int) (Math.random() * 5000));			
		}
		testList.add_first(0);
		testList.add_last(1);

		assertTrue(testList.get_first() == 0);

		assertTrue(testList.get_last() == 1);

	}
	
	@Test
	public void testAddLastMany() 
	{

		List_235<Integer> testList = new_list();		
		
		for (int i = 0; i < 5000; i++) {
			testList.add_last((int) (Math.random() * 5000));			
		}
		testList.add_first(0);
		testList.add_last(1);

		assertTrue(testList.get_first() == 0);

		assertTrue(testList.get_last() == 1);

	}

	@Test
	public void testToString()
	{
		List_235<Integer> testList = new_list();
		
		if(testList instanceof Linked_List_235)
		{
			testList.add_last(0);
			testList.add_last(1);
			testList.add_last(2);
			testList.add_last(3);
			testList.add_last(4);

			assertEquals(testList.toString(),"[0]--> [1]--> [2]--> [3]--> [4]--> null");
		}
	}
}
