package com.vicky.OnlineShopping.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Product")
public class Cart {
    @Id
    private Long productid;
    private String productname;
    private Long productcost;
    private Long quantity;

    @Override
    public String toString() {
        return "Cart{" +
                "productid=" + productid +
                ", productname='" + productname + '\'' +
                ", productcost=" + productcost +
                ", quantity=" + quantity +
                '}';
    }

    public Cart(Long productid, String productname, Long productcost, Long quantity) {
        this.productid = productid;
        this.productname = productname;
        this.productcost = productcost;
        this.quantity = quantity;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Long getProductcost() {
        return this.productcost;
    }

    public void setProductcost(Long productcost) {
        this.productcost = productcost;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
    public Cart(){

    }
}
