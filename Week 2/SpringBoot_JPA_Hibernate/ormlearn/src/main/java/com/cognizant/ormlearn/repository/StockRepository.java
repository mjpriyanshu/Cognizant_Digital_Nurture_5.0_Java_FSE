package com.cognizant.ormlearn.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn.model.Stock;

public interface StockRepository extends JpaRepository<Stock,Integer>{

    // ===== Hands-on 2 =====

    // Facebook September 2019
    List<Stock> findByCodeAndDateBetween(
            String code,
            LocalDate start,
            LocalDate end);

    // Google close price > value
    List<Stock> findByCodeAndCloseGreaterThan(
            String code,
            double price);

    // Top 3 highest volume
    List<Stock> findTop3ByOrderByVolumeDesc();

    // Netflix lowest close
    List<Stock> findTop3ByCodeOrderByCloseAsc(
            String code);

}