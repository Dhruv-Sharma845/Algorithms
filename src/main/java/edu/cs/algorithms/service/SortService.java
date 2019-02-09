package edu.cs.algorithms.service;

import java.util.List;

public interface SortService {

    /**
     * sort the integers with elementary sorting method("Insertion Sort")
     *
     * @param inputKeys
     * @return Sorted Keys according to numeric order
     */
    List<Integer> sortIntegers(List<Integer> inputKeys);
}
