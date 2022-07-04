package ss10_dsa_list.BaiTap.MethodArrayList;

import java.util.Arrays;

public class MyList<E> {
    public static final int DEFAULT_CAPACITY = 10;
    private int size=0;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
        for (int i=0 ; i<elements.length ; i++) {
            elements[size++] = null;
        }
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements,minCapacity);
    }
    public void add(int index , E element) {
        if (index > size) {
            ensureCapacity(elements.length+index*2+1);
        } else {
            ensureCapacity(elements.length+1);
        }
        if (elements[index] != null) {
            int checkIndex = index+1;
            while (elements[checkIndex] != null) {
                checkIndex++;
            }
            for (int i=checkIndex ; i>=index ; i--) {
                elements[i] = (E) elements[i-1];
                if (i==index) {
                    elements[i] = element;
                }
            }

        } else {
            elements[index] = element;
        }
        size++;
    }
    public void remove(int index) {
        if (index<0 || index>elements.length || elements[index]==null) {
            throw new IndexOutOfBoundsException("Error");
        } else {
            for (int i = index ; i<elements.length-1 ; i++) {
                elements[i] = elements[i+1];
            }
            size--;
        }
    }
    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return elements.length;
    }
    public E get(int index) {
        return (E)elements[index];
    }
    public MyList<E> clone(){
        return  this;
    }
    public boolean contains(E object){
        boolean checkObject  = false;
        for(Object objectContain : elements){
            if(objectContain  == object){
                checkObject = true;
            }
        }
        return checkObject;
    }
    public int indexOf(E object) {
        for (int i=0 ; i<elements.length ; i++) {
            if (elements[i] == object) {
                return i;
            }
        }
        return -1;
    }
    public void clear(){
        for(int i =0; i < elements.length; i++){
            elements[i] = null;
        }
    }
}
