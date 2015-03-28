package com.project.app.domain.repository.stocklist;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.app.domain.model.StockList;

public interface StockListRepository  extends JpaRepository<StockList, String> {

}
