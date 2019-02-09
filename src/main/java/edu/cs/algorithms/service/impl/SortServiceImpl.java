package edu.cs.algorithms.service.impl;

import edu.cs.algorithms.model.PrimitiveKeyComparator;
import edu.cs.algorithms.model.enums.KeyDataTypeEnum;
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

    @Override
    public List<String> sortListForPrimitiveTypes(String dataType, List<String> inputKeys) {

        // find datatype from predefined enum values
        KeyDataTypeEnum keyDataType = KeyDataTypeEnum.findDataTypeByDescription(dataType);

        // if the dataType received is not valid one
        // no need to process further
        if(keyDataType == null) {
            return null;
        }

        switch(keyDataType) {
            case INTEGER:
                List<Integer> castedInputKeys = new ArrayList<>();
                for(String elem : inputKeys) {
                    castedInputKeys.add(Integer.valueOf(elem));
                }
                List<Integer> sortedKeys = SortUtility.insertionSortForPrimitives(castedInputKeys,new PrimitiveKeyComparator<Integer>());
                List<String> castedSortedKeys = new ArrayList<>();
                for(Integer elem : sortedKeys) {
                    castedSortedKeys.add(elem.toString());
                }
                return castedSortedKeys;
            default:
                logger.error("Unknown primitive type");
        }

        return new ArrayList<>();
    }

}
