package com.imaginnovate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imaginnovate.entity.PhoneNumber;


public interface PhoneRepo extends JpaRepository<PhoneNumber, Integer>{

}
