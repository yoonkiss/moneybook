package com.example.moneybook.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "regular_expenditure")
public class RegularExpenditure {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "category_id")
    private int categoryId;

    private String description;

    private int amount;

    @Column(name = "pay_type")
    private int payType;

    @Column(name = "created_at")
    private Date createdTime;
}
