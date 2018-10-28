package com.example.moneybook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.moneybook.common.ResponseData;
import com.example.moneybook.service.CommonCodeService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/v1")
@CrossOrigin
public class CommonCodeController {


    @Autowired
    private CommonCodeService ccService;


    @RequestMapping(value = "/code", method = RequestMethod.GET, produces = "application/json")
    public ResponseData getCommonCode() {
        return new ResponseData(ccService.getCommonCode());
    }

}
