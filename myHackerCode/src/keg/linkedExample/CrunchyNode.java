/**
 * 
 */
package keg.linkedExample;

/**
 * @author Owner
 *
 */
public class CrunchyNode<V> {
	// instance variables
	private V element;
	private CrunchyNode<V> next;

	// constructor first
	public CrunchyNode() {
        this(null, null); 
    }

	public CrunchyNode(V element, CrunchyNode<V> next) {
        this.element = element;
        this.next = next;
    }

	public V getElement() {
		return element;
	}

	public CrunchyNode<V> getNext() {
		return next;
	}

	public void setElement(V element) {
		this.element = element;
	}

	public void setNext(CrunchyNode<V> next) {
		this.next = next;
	}
}
