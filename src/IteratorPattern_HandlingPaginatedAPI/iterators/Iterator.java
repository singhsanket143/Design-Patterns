package IteratorPattern_HandlingPaginatedAPI.iterators;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
