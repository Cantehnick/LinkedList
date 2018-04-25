package by.htp.list.model;

public class Node<E> {

private Node<E> prevElement;  
private Node<E> nextElement; 
private E currentElem;


public Node(E currentElem, Node<E> prevElement, Node<E> nextElement) {
	super();
	this.currentElem = currentElem;
	this.prevElement = prevElement;
	this.nextElement = nextElement;
}


public Node<E> getPrevElement() {
	return prevElement;
}


public void setPrevElement(Node<E> prevElement) {
	this.prevElement = prevElement;
}


public Node<E> getNextElement() {
	return nextElement;
}


public void setNextElement(Node<E> nextElement) {
	this.nextElement = nextElement;
}


public E getCurrentElem() {
	return currentElem;
}


public void setCurrentElem(Object e) {
	this.currentElem = currentElem;
}



	
}


















