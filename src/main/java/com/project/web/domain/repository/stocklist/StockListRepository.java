package com.project.web.domain.repository.stocklist;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.web.domain.model.StockList;

public interface StockListRepository  extends JpaRepository<StockList, String> {

}
