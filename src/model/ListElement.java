package model;

import java.util.List;

public class ListElement<T> {
    private T elementData;
    private ListElement<T> nextElement;

    public ListElement(){
        setElementData(null);
        setNextElement(null);
    }

    public ListElement(T elementData){
        setElementData(elementData);
        setNextElement(null);
    }

    public ListElement(T elementData, ListElement nextElement){
        setElementData(elementData);
        setNextElement(nextElement);
    }

    public T getElementData() {
        return elementData;
    }

    public void setElementData(T elementData) {
        this.elementData = elementData;
    }

    public ListElement<T> getNextElement() {
        return nextElement;
    }

    public void setNextElement(ListElement<T> nextElement) {
        this.nextElement = nextElement;
    }
}
