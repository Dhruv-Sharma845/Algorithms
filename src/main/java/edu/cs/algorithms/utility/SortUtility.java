package edu.cs.algorithms.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUtility {

    private static final Log logger = LogFactory.getLog(SortUtility.class);

    public static List<Integer> insertionSortForIntegers(List<Integer> items) {

        logger.info("Sorting integers: " + items);

        // if the items list is null or if the number of elements is less than 2
        // no need for sorting
        if(items==null || items.size() < Constants.MINIMUM_SIZE_FOR_VALID_SORTING) {
            return items;
        }

        List<Integer> clonedItems = new ArrayList<>(items);

        for(int i = 1; i < clonedItems.size(); i++) {
            for(int j = i; j > 0; j--) {
                if(clonedItems.get(j) < clonedItems.get(j-1)) {
                    Collections.swap(clonedItems, j,j-1);
                }
            }
        }

        return clonedItems;

    }
}
