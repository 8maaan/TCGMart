package com.csit321.TCGMart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csit321.TCGMart.Entity.SaleEntity;

@Repository
public interface SaleRepository extends JpaRepository<SaleEntity, Integer>{

}
