package by.htp.list.model;

import java.util.Iterator;

public class StudentGroup<E> implements Actions<E>, Iterable<E> {

	private Node<E> firstNode;
	private Node<E> lastNode;
	private int size;

	public StudentGroup() {
		firstNode = new Node<E>(null, null, lastNode);
		lastNode = new Node<E>(null, firstNode, null);
	}

	@Override
	public void addLast(Object e) {
		if (e != null) {
			Node<E> prev = lastNode;
			prev.setCurrentElem(e);
			lastNode = new Node<E>(null, prev, null);
			prev.setNextElement(lastNode);
			size++;
		}
	}

	@Override
	public void addFirst(Object e) {
		if (e != null) {
			Node<E> next = firstNode;
			next.setCurrentElem(e);
			firstNode = new Node<E>(null, null, next);
			next.setPrevElement(firstNode);
			size++;
		}
	}

	@Override
	public E getElement(int index) {

		Node<E> target = firstNode.getNextElement();
		for (int i = 0; i < index; i++) {
			target = getNextElementNode(target);
		}

		return target.getCurrentElem();
	}

	private Node<E> getNextElementNode(Node<E> current) {

		return current.getNextElement();
	}

	@Override
	public int getSize() {

		return size;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<E>() {
			int counter = 0;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return counter < size;
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				return getElement(counter++);
			}
		};

	}

}