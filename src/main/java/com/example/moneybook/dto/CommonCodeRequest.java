package com.example.moneybook.dto;

import lombok.Data;

@Data
public class CommonCodeRequest {
    private String name;

    private String description;

    private int sorting;
    
    private int parentId;
}
