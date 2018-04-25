package by.htp.list.model;

public interface Actions<E> {

	void addLast(E e);

	void addFirst(E e);

E getElement (int index);

int getSize();
}
