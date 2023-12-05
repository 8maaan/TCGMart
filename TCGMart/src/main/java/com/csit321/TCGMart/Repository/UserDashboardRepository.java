package com.csit321.TCGMart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csit321.TCGMart.Entity.UserDashboardEntity;

@Repository
public interface UserDashboardRepository extends JpaRepository<UserDashboardEntity, Integer>{

}
