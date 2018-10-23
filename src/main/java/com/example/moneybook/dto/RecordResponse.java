package com.example.moneybook.dto;

import com.example.moneybook.model.CommonCode;
import com.example.moneybook.model.CreditCard;
import com.example.moneybook.model.Record;

import lombok.Data;

@Data
public class RecordResponse {
    private String userId;

    private String description;

    private int billingType;

    private CreditCard card;

    private CommonCode commonCode1;
    private CommonCode commonCode2;

    private int amount;

    private int divided;

    private String comments;

    private String recordAt;

    public RecordResponse(Record record) {
        this.userId = record.getUserId();
        this.description = record.getDescription();
        this.billingType = record.getBillingType();
        this.amount = record.getAmount();
        this.divided = record.getDivided();
        this.comments = record.getComments();
        this.recordAt = record.getRecordAt().toString();
    }
}
