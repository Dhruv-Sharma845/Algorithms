package edu.cs.algorithms.model;

public class PrimitiveKeyComparator<T extends Comparable<T>> implements KeyComparator<T> {

    @Override
    public Integer compare(T first, T second) {
        return first.compareTo(second);
    }
}
