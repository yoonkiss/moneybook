package com.example.moneybook.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.moneybook.model.CommonCode;

import lombok.Data;

@Data
public class CommonCodeResponse {
    private List<CommonCode> code;

    private List<CommonCode> subCode = new ArrayList<CommonCode>();
}
