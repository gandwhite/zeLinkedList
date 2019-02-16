package utils;

import model.ListElement;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ListIterator<T> implements Iterator<T> {
    private ListElement<T> listElement;

    public ListIterator(ListElement<T> listElement){
        this.listElement = listElement;
    }

    public boolean hasNext(){
        return this.listElement.getNextElement()!=null;
    }

    public T next(){
        if(hasNext()){
            this.listElement = this.listElement.getNextElement();
            return this.listElement.getElementData();
        }
        else{
            return null;
        }
    }

    public int nextIndex(){
        throw new NotImplementedException();
    }
}
