package com.example.moneybook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.moneybook.model.Record;

@Repository
public interface RecordsRepository extends JpaRepository<Record, Integer>, RecordsRepositoryCustom {

}
