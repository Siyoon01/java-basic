package practice.class1.classEx2;

import java.util.Scanner;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] orderList = new ProductOrder[3];

        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;
        orderList[0] = product1;

        ProductOrder prduct2 = new ProductOrder();
        prduct2.productName = "김치";
        prduct2.price = 5000;
        prduct2.quantity = 1;
        orderList[1] = prduct2;

        ProductOrder prduct3 = new ProductOrder();
        prduct3.productName = "콜라";
        prduct3.price = 1500;
        prduct3.quantity = 3;
        orderList[2] = prduct3;

        int sum = 0;
        for(ProductOrder product : orderList) {
            sum += product.price * product.quantity;
            System.out.println("상품명: " + product.productName + ", 가격: " + product.price + ", 수량: " + product.quantity);
        }
        System.out.println("총 결제 금액: " + sum);

    }
}
