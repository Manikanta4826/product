package com.vicky.OnlineShopping.Repository;

import com.vicky.OnlineShopping.Entity.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CartRepository extends MongoRepository<Cart, Long> {
    List<Cart> findAll();
}
