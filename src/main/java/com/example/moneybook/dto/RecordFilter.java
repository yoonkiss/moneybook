package com.example.moneybook.dto;

import org.springframework.data.domain.Pageable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecordFilter {

    private String recordAtFrom;
    private String recordAtTo;
    //@DateTimeFormat(pattern = "yyyy-mm-dd")
    private String recordAt;

    private Pageable pageable;

}
