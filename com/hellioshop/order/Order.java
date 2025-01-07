package com.hellioshop.order;

import com.hellioshop.product.Product;
import com.hellioshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
