package edu.cs.algorithms.controller;

import edu.cs.algorithms.service.SortService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/algorithms/sort")
public class SortController {

    //Logger for the class
    private static final Log logger = LogFactory.getLog(SortController.class);

    @Autowired
    SortService sortService;

    @PostMapping("/integers")
    public List<Integer> sortIntegers(@RequestBody List<Integer> inputKeys) {
        return sortService.sortIntegers(inputKeys);
    }

    @PostMapping("/primitive/{data-type}")
    public List<String> sortListGeneric(@PathVariable("data-type") String dataType, @RequestBody List<String> inputKeys) {
        return sortService.sortListForPrimitiveTypes(dataType, inputKeys);
    }

}
