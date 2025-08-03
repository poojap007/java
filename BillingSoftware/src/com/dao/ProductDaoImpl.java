package com.dao;

import com.bean.Product;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProductDaoImpl implements ProductDao {
    private JdbcTemplate jdbcTemplate;

    public ProductDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Product getProductDetails(int product_code) {
        String query = "SELECT * FROM product WHERE product_code = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{product_code}, 
            new BeanPropertyRowMapper<>(Product.class));
    }
}
