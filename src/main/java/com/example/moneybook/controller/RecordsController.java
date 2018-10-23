package com.example.moneybook.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.moneybook.common.ResponseData;
import com.example.moneybook.dto.RecordFilter;
import com.example.moneybook.dto.RecordRequest;
import com.example.moneybook.exception.MoneyBookException;
import com.example.moneybook.model.Record;
import com.example.moneybook.service.RecordService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/v1")
@CrossOrigin
public class RecordsController {

    @Autowired
    private RecordService recordsService;

    @RequestMapping(value = "/record", method = RequestMethod.POST, consumes = "application/json")
    public ResponseData addRecord(@RequestBody RecordRequest record, HttpServletResponse http)
            throws MoneyBookException {
        Record newRecord = recordsService.addRecord(record);

        return new ResponseData(newRecord);
    }

    /*
     * record_at:
     * - this month
     * - from to
     * 
     * sort
     * - 
     */
    @RequestMapping(value = "/record", method = RequestMethod.GET, produces = "application/json")
    public ResponseData getRecords(@ModelAttribute RecordFilter filter, Pageable pageable) {
        filter.setPageable(pageable);
        return new ResponseData(recordsService.getRecords(filter));
    }

    @RequestMapping(value = "/record/{id}", method = RequestMethod.PUT)
    public ResponseData updateRecord(@PathVariable(value = "id") Integer id, @RequestBody RecordRequest request) {

        Record newRecord = recordsService.updateRecord(id, request);

        return new ResponseData(newRecord);
    }

    @RequestMapping(value = "/record/{id}", method = RequestMethod.DELETE)
    public ResponseData deleteRecord(@PathVariable(value = "id") Integer id) {

        recordsService.deleteRecord(id);
        return new ResponseData();
    }
}
