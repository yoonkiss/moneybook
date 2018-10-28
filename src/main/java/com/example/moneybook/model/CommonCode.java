
package com.example.moneybook.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "common_code")
public class CommonCode {
    @Id
    @NotNull
    private int id;

    @NotNull
    private String name;

    private String description;

    private int sorting;
    
    private int parentId;

    @Column(name = "created_at", insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at", insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
}
