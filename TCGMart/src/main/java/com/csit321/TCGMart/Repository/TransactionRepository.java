package com.csit321.TCGMart.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csit321.TCGMart.Entity.TransactionEntity;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Long>{
	List<TransactionEntity> findByCardBuyer(int cardBuyer);
}
