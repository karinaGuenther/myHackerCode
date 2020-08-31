package com.anirak.mysnippets;
/**
 * 
 */

/**
 * @author Owner
 *
 */
public class simpleSinglyLinkedListExample<V>
{

	// Instance Variables. Add the tail reference.
	protected CrunchyNode<V> head, tail;
	protected long size;

	// Empty list constructor first
	public simpleSinglyLinkedListExample()
	{
		head = null;
		tail = null;
		size = 0;
	}

	// Method to add CrunchyNodes to the list. Storage space for the CrunchyNode
	// is already allocated in the calling method
	public void addFirst(CrunchyNode<V> CrunchyNode)
	{
		// Set the tail only if this is the very first CrunchyNode
		if (tail == null)
			tail = CrunchyNode;
		CrunchyNode.setNext(head); // Make next of the new CrunchyNode refer to the head
		head = CrunchyNode; // Give head a new value

		// change the size
		size++;
	}

	// Add new CrunchyNode after current CrunchyNode, checking to see if we are
	// at the tail
	public void addAfter(CrunchyNode<V> currentCrunchyNode, CrunchyNode<V> newCrunchyNode)
	{
		if (currentCrunchyNode == tail)
			tail = newCrunchyNode;
		newCrunchyNode.setNext(currentCrunchyNode.getNext());
		currentCrunchyNode.setNext(newCrunchyNode);

		// change the size
		size++;
	}

	// Add new CrunchyNode after the tail CrunchyNode.
	public void addLast(CrunchyNode<V> CrunchyNode)
	{
		CrunchyNode.setNext(null);
		tail.setNext(CrunchyNode);
		tail = CrunchyNode;
		size++;
	}

	// Methods to remove CrunchyNodes from the list. (Unfortunately, with a single
	// linked list. there is no way to remove last. Need a previous reference to do
	// that.
	public CrunchyNode<V> removeFirst()
	{
		if (head == null)
			System.err.println("Error:  Attempt to remove from an empty list");

		// save the one to return
		CrunchyNode<V> temp = head;

		// do reference manipulation
		head = head.getNext();
		temp.setNext(null);
		size--;

		return temp;

	}

	// Remove the CrunchyNode at the end of the list. tail refers to this
	// CrunchyNode, but since the list is single linked, there is no way to refer
	// to the CrunchyNode before the tail CrunchyNode. Need to traverse the
	// list.
	public CrunchyNode<V> removeLast()
	{
		// Declare local variables/objects
		CrunchyNode<V> CrunchyNodeBefore;
		CrunchyNode<V> CrunchyNodeToRemove;

		// Make sure we have something to remove
		if (size == 0)
			System.err.println("Error:  Attempt to remove fron an empty list");

		// Traverse through the list, getting a reference to the CrunchyNode before
		// the trailer. Since there is no previous reference.
		CrunchyNodeBefore = getFirst();

		for (int count = 0; count < size - 2; count++)
			CrunchyNodeBefore = CrunchyNodeBefore.getNext();

		// Save the last CrunchyNode
		CrunchyNodeToRemove = tail;

		// Let's do the pointer manipulation
		CrunchyNodeBefore.setNext(null);
		tail = CrunchyNodeBefore;
		size--;

		return CrunchyNodeToRemove;
	}

	// Remove a known CrunchyNode from the list. No need to search or return a
	// value. This method makes use of a 'before' reference in order to allow list
	// manipulation.
	public void remove(CrunchyNode<V> CrunchyNodeToRemove)
	{
		// Declare local variables/references
		CrunchyNode<V> CrunchyNodeBefore, currentCrunchyNode;

		// Make sure we have something to remove
		if (size == 0)
			System.err.println("Error:  Attempt to remove fron an empty list");

		// Starting at the beginning check for removal
		currentCrunchyNode = getFirst();
		if (currentCrunchyNode == CrunchyNodeToRemove)
			removeFirst();
		currentCrunchyNode = getLast();
		if (currentCrunchyNode == CrunchyNodeToRemove)
			removeLast();

		// We've already check two CrunchyNodes, check the rest
		if (size - 2 > 0)
		{
			CrunchyNodeBefore = getFirst();
			currentCrunchyNode = getFirst().getNext();
			for (int count = 0; count < size - 2; count++)
			{
				if (currentCrunchyNode == CrunchyNodeToRemove)
				{
					// remove current CrunchyNode
					CrunchyNodeBefore.setNext(currentCrunchyNode.getNext());
					size--;
					break;
				}

				// Change references
				CrunchyNodeBefore = currentCrunchyNode;
				currentCrunchyNode = currentCrunchyNode.getNext();
			}
		}
	}

	// The gets to return the head and/or tail CrunchyNodes and size of the list
	public CrunchyNode<V> getFirst()
	{
		return head;
	}

	public CrunchyNode<V> getLast()
	{
		return tail;
	}

	public long getSize()
	{
		return size;
	}
}
