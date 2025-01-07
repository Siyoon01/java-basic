package com.hellioshop.order;

import com.hellioshop.product.Product;
import com.hellioshop.user.User;

public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
