package com.vicky.OnlineShopping.Service;

import com.vicky.OnlineShopping.Entity.Cart;
import com.vicky.OnlineShopping.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface CartService {


    public String addCart(Cart cart);

    List<Cart> getAll();

    String deleteCart(Long productid);

    Cart updateCart(Long productid, Cart cart);
}
