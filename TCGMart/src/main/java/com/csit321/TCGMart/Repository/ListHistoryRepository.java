package com.csit321.TCGMart.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csit321.TCGMart.Entity.ListHistoryEntity;

@Repository
public interface ListHistoryRepository extends JpaRepository<ListHistoryEntity, Integer>{
	List<ListHistoryEntity> findByUid(int uid);
}
