package com.example.moneybook.dto;

import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class RecordRequest {
    private String userId;

    private String description;

    private int billingType;

    private int cardId;

    private int categoryId;

    private int amount;

    private int divided;

    private String comments;
    /*
     * @DateTimeFormat(pattern = "yyyy-mm-dd")
     * private LocalTime  recordAt;
     */
    private String recordAt;
}
