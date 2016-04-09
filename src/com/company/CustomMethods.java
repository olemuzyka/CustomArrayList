package com.company;


public interface CustomMethods<E> {
    public void add(E t);
    public int size();
    public CustomArrayList clone();
    public boolean contains(E c);
    public int indexOf(E i);
    public void clear();
    public E get(int index);
    public boolean isEmpty();
    public boolean removeForIndex(int index);
    public boolean removeForObject(E object);
    public E[] toArray();
    public void display();
}
