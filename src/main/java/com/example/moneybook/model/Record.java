package com.example.moneybook.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "records")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String userId;

    private String description;

    private int billingType;

    @ManyToOne
    @JoinColumn(name="card_id") //mapping to FK, optional for card_credit_card_id
    private CreditCard card;

    private int categoryId;

    private int amount;

    private int divided;

    private String comments;

    @Transient
    private int dividedAmount;

    private LocalDate recordAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;


}
