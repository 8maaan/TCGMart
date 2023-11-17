package com.csit321.TCGMart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csit321.TCGMart.Entity.CardEntity;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Integer>{
	
}
