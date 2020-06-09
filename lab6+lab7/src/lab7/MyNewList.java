package lab7;

import lab6.Plane;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyNewList implements List<Plane> {
    private int startSize = 15;
    private float increaseSize = 0.3f;
    private Plane[] elements;
    private int size = 0;

    public MyNewList() {
        elements = new Plane[startSize];
    }

    public MyNewList(Plane plane) {
        add(plane);
    }

    public MyNewList(Collection<? extends Plane> collection) {
        addAll(collection);
    }

    private void resize() {
        int newSize = (int)(elements.length *
                (1+increaseSize));
        Plane[] newElements = new Plane[newSize];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Plane> iterator() {
        return new Iterator<Plane>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Plane next() {
                return elements[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(Plane plane) {
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Plane> collection) {
        boolean isCollectionChanged = false;
        for (Plane plane : collection) {
            add(plane);
            isCollectionChanged = add(plane);
        }
        return isCollectionChanged;
    }

    @Override
    public boolean addAll(int i, Collection<? extends Plane> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Plane get(int i) {
        return null;
    }

    @Override
    public Plane set(int i, Plane plane) {
        return null;
    }

    @Override
    public void add(int i, Plane plane) {

    }

    @Override
    public Plane remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Plane> listIterator() {
        return new ListIterator<Plane>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Plane next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public Plane previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(Plane plane) {

            }

            @Override
            public void add(Plane plane) {

            }
        };
    }

    @Override
    public ListIterator<Plane> listIterator(int i) {
        return null;
    }

    @Override
    public List<Plane> subList(int i, int i1) {
        return null;
    }
}
