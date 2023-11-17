package com.csit321.TCGMart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csit321.TCGMart.Entity.UsersEntity;

@Repository
public interface UsersRepository  extends JpaRepository<UsersEntity, Integer>{

}
