package com.vicky.OnlineShopping.Service;

import com.vicky.OnlineShopping.Entity.Cart;
import com.vicky.OnlineShopping.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository repository;

    @Override
    public String addCart(Cart cart) {
        repository.save(cart);
        return "Item inserted";
    }

    @Override
    public String deleteCart(Long productid) {
        repository.deleteById(productid);
        return "Item deleted";
    }

    @Override
    public Cart updateCart(Long productid, Cart cart) {
        Cart c = repository.findById(productid).orElse(null);
        c.setProductname(cart.getProductname());
        c.setProductcost(cart.getProductcost());
        c.setQuantity(cart.getQuantity());
        return repository.save( cart);
    }

    @Override
    public List<Cart> getAll() {
        return repository.findAll();

    }
}
