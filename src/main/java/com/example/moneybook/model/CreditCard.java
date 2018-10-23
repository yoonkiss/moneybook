package com.example.moneybook.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "creadit_card")
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "user_id")
    private String userId;
    
    //@OneToMany(mappedBy = "card")
    //private List<Record> records = new ArrayList<Record>();
    
    private String name;
    
    private String startedAt;
    private String endAt;
    private String billingAt;

}
