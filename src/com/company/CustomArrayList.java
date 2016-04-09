package com.company;


import java.util.Arrays;

public class CustomArrayList<E> implements CustomMethods<E> {


    private static final int length = 10;
    private int size = 0;
    private Object[] arrayList;

    public CustomArrayList() {
        arrayList = new Object[length];
    }

    /**
     * Adds an object to the end of the collection.
     */
    @Override
    public void add(E t) {
        if (size == arrayList.length) {
            growArray();
        }
        arrayList[size++] = t;
    }

    /**
     * It shows the size
     */

    @Override
    public int size() {
        return size;
    }

    /**
     * Creates a shallow copy of the List collection.
     */
    @Override
    public CustomArrayList clone() {
        CustomArrayList<E> customList = new CustomArrayList<>();
        Object copyList[] = new Object[size];
        for (int i = 0; i < size; i++) {
            copyList[i] = arrayList[i];
            customList.add((E) copyList[i]);
        }
        return customList;
    }

    /**
     * It determines whether an element is in the collection .
     */
    @Override
    public boolean contains(E c) {
        for (int i = 0; i < size; i++) {
            if (c.equals(arrayList[i])) {
                System.out.println("coincidence with object" + " <<" + arrayList[i] + ">> " + " " + "with index" + " " + i);
                return true;
            }
        }
        System.out.println("There is no coincidence");
        return false;
    }

    /**
     * Shows the object by an index in the collection.
     */
    @Override
    public int indexOf(E i) {
        if (presenceOfObjectInList(i)) {
            for (int j = 0; j < size; j++) {
                if (i.equals(arrayList[j])) {
                    System.out.print("Index of object" + " <<" + arrayList[j] + ">> " + " = ");
                    return j;
                }
            }
        }
        System.out.println("object with such index not found");
        return -1;
    }

    /**
     * Removes all of the elements in the collection.
     */

    @Override
    public void clear() {
        size = 0;
        arrayList = new Object[size];
    }

    /**
     * Returns objects
     */

    @Override
    public E get(int index) {
        if (index >= 0 && index < size) {
            System.out.print("The object with index" + " " + index + ":" + " ");
            return (E) arrayList[index];
        }
        System.out.println("The object with index" + " " + index + " " + "was not found");
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Removes the object by an index in the collection.
     */

    @Override
    public boolean removeForIndex(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                arrayList[i] = arrayList[i + 1];
            }
            size--;
            System.out.println("Object" + "\t<<" + arrayList[index] + ">>\t" + "was removed");
            return true;
        }
        System.out.println("Incorrect index");
        return false;
    }

    /**
     * Removes the object in the collection.
     */
    @Override
    public boolean removeForObject(E object) {
        if (presenceOfObjectInList(object)) {
            for (int i = 0; i < size; i++) {
                if (object.equals(arrayList[i])) {
                    int index = i;
                    for (int j = index; j < size; j++) {
                        arrayList[j] = arrayList[j + i];
                    }
                }
                System.out.println("Object" + "\t<<" + object + ">>\t" + "was removed");
                size--;
                return true;
            }
        }

        return false;
    }

    /**
     * Copies the elements of the ArrayList to a new array list Object.
     */
    @Override
    public E[] toArray() {
        Object[] copyArray = new Object[size];
        for (int i = 0; i < size; i++) {
            copyArray[i] = arrayList[i];
        }
        return (E[]) copyArray;
    }

    /**
     * It shows the collection
     */
    @Override
    public void display() {
        System.out.print("Display list : ");
        if (size == 0) {
            System.out.println("List is empty");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(arrayList[i] + " ");
            }
        }
        System.out.println(" ");
    }

    /**
     * method of increasing the size of an array
     */
    private void growArray() {
        int newIncreasedSize = arrayList.length * 2;
        arrayList = Arrays.copyOf(arrayList, newIncreasedSize);
    }


    private boolean presenceOfObjectInList(E object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(arrayList[i])) {
                return true;
            }
        }
        return false;
    }

}
