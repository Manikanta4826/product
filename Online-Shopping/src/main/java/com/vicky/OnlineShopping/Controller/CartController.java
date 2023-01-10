package com.vicky.OnlineShopping.Controller;

import com.vicky.OnlineShopping.Entity.Cart;
import com.vicky.OnlineShopping.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/product")
public class CartController {

    @Autowired
    private CartService service;

    @PostMapping("/save")
    public String addCart(@RequestBody Cart cart) {
        return service.addCart(cart);
    }

    @GetMapping("/getAll")
    public List<Cart> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCart(@PathVariable("id") Long productid) {
        return service.deleteCart(productid);
    }
    @PutMapping("/update/{id}")
    public Cart updateCart(@PathVariable(value="id") Long productid, @RequestBody Cart cart) {
        return service.updateCart(productid,cart);
    }
}