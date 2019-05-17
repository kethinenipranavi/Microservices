package com.capgemini.SpringBootMicroservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.SpringBootMicroservices.entity.ExchangeValue;

public interface ExchangeValueDao extends JpaRepository<ExchangeValue,Long>{

}
