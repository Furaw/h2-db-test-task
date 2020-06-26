package com.example.market.repository;

import com.example.market.entity.Basket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepo extends CrudRepository <Basket,Long> {
}
