package com.example.moneybook.dto;

import lombok.Data;

@Data
public class RecordRequest {
    private String userId;

    private int type;

    private String description;

    private int account;

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
