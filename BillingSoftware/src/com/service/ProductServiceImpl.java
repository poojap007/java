package com.service;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductServiceImpl implements ProductService {
    private ProductDao dao;

    public ProductServiceImpl(ProductDao dao) {
        this.dao = dao;
    }

    public Product getProductDetails(int code) {
        return dao.getProductDetails(code);
    }

    public double calculatePrice(int quantity, double price) {
        return quantity * price;
    }

    public boolean validateProductCode(int code) {
        return code > 0 && String.valueOf(code).length() == 4;
    }

    public boolean validateQuantity(int quantity) {
        return quantity > 0;
    }
}
