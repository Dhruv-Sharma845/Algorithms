package edu.cs.algorithms.service.impl;

import edu.cs.algorithms.service.SortService;
import edu.cs.algorithms.utility.SortUtility;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SortServiceImpl implements SortService {

    private static final Log logger = LogFactory.getLog(SortServiceImpl.class);

    @Override
    public List<Integer> sortIntegers(List<Integer> inputKeys) {

        List<Integer> sortedKeys = SortUtility.insertionSortForIntegers(inputKeys);
        if(sortedKeys == null) {
            logger.error("Sorted Array is null/empty");
            return new ArrayList<>();
        }
        return sortedKeys;
    }

}
