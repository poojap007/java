package com.service;

import com.bean.Product;

public interface ProductService {
    public Product getProductDetails(int product_code);
    public double calculatePrice(int quantity, double product_price);
    public boolean validateProductCode(int product_code);
    public boolean validateQuantity(int quantity);
}
