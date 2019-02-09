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

    /**
     * sort the list of keys
     *
     * @param dataType
     * @param inputKeys
     * @return sorted list according to order of corresponding data type
     */
    List<String> sortListForPrimitiveTypes(String dataType, List<String> inputKeys);
}
