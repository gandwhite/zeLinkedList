package utils;

import model.ListElement;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    int nextIndex();
}
