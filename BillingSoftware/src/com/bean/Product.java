package com.bean;

public class Product {
    private int product_code;
    private String product_name;
    private String product_category;
    private String product_description;
    private double product_price;

    // Getter and Setter for product_code
    public int getProduct_code() {
        return product_code;
    }
    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    // Getter and Setter for product_name
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    // Getter and Setter for product_category
    public String getProduct_category() {
        return product_category;
    }
    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    // Getter and Setter for product_description
    public String getProduct_description() {
        return product_description;
    }
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    // ✅ THIS IS MISSING IN YOUR CASE
    // Getter and Setter for product_price
    public double getProduct_price() {
        return product_price;
    }
    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }
}
