package com.example.moneybook.repository;

import org.springframework.data.domain.Page;

import com.example.moneybook.dto.RecordFilter;
import com.example.moneybook.dto.RecordResponse;

public interface RecordsRepositoryCustom 
{
    public Page<RecordResponse> search (RecordFilter filter);

}