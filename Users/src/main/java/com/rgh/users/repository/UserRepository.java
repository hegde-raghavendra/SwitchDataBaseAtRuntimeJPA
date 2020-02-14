package com.rgh.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgh.users.entity.user;


public interface UserRepository extends JpaRepository<user, Integer>{

}
