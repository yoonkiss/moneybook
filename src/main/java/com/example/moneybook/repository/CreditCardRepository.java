package com.example.moneybook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.moneybook.model.CreditCard;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {
}
