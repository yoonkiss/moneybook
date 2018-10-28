package com.example.moneybook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.moneybook.model.CommonCode;

@Repository
public interface CommonCodeRepository extends JpaRepository<CommonCode, Integer> {
    List<CommonCode> findByParentIdIsOrderBySortingAsc(int parentId);
}
