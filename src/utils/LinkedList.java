package utils;

import model.ListElement;

public class LinkedList<T> {
    private ListElement<T> baseElement;
    private ListElement<T> headElement;
    private ListElement<T> lastElement;
    private int length;
    //private Iterator<T> iterator;

    public LinkedList(){
        //setHeadElement(new ListElement<>());
        setLength(0);
        //iterator = new ListIterator<>(this.getBaseElement());
    }

    public LinkedList(T data){
        setBaseElement(new ListElement<>());
        getBaseElement().setNextElement(new ListElement<>(data));
        setHeadElement(getBaseElement().getNextElement());
        setLastElement(getBaseElement().getNextElement());
        setLength(1);
        //iterator = new ListIterator<>(this.getBaseElement());
    }

    public boolean add(T elementData){
        if(getBaseElement()==null){
            setBaseElement(new ListElement<>());
            getBaseElement().setNextElement(new ListElement<>(elementData));
            setHeadElement(getBaseElement().getNextElement());
            setLastElement(getBaseElement().getNextElement());
        }
        else{
            getLastElement().setNextElement(new ListElement<>(elementData));
            setLastElement(getLastElement().getNextElement());
        }
        setLength(getLength()+1);
        return true;
    }

    public T get(int index){
        if(index > this.length){
            //todo exception index out of bounds
            return null;
        }
        ListIterator<T> iterator = new ListIterator<>(this.getBaseElement());
        //todo
        for(int i = 0; i < index; i++){
            iterator.next();
        }
        return iterator.next();
    }

    public ListElement<T> getBaseElement() {
        return baseElement;
    }

    public void setBaseElement(ListElement<T> baseElement) {
        this.baseElement = baseElement;
    }

    public ListElement<T> getHeadElement() {
        return headElement;
    }

    public void setHeadElement(ListElement<T> headElement) {
        this.headElement = headElement;
    }

    public ListElement<T> getLastElement() {
        return lastElement;
    }

    public void setLastElement(ListElement<T> lastElement) {
        this.lastElement = lastElement;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}