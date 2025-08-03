package com.main;

import java.util.Scanner;
import com.bean.Product;
import com.dao.*;
import com.service.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MainClass {
    public static void main(String[] args) {
        // DB Connection
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/pj");
        ds.setUsername("root");
        ds.setPassword("PoOjA@777");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
        ProductDao dao = new ProductDaoImpl(jdbcTemplate);
        ProductService service = new ProductServiceImpl(dao);

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Generate Bill by entering code and quantity\n2. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter product_code: ");
                        int code = sc.nextInt();
                        if (!service.validateProductCode(code)) {
                            throw new BillingException("Invalid product_code, must be > 0 and 4-digit");
                        }

                        System.out.print("Enter quantity: ");
                        int qty = sc.nextInt();
                        if (!service.validateQuantity(qty)) {
                            throw new BillingException("Invalid quantity, must be > 0");
                        }

                        Product p = service.getProductDetails(code);
                        double total = service.calculatePrice(qty, p.getProduct_price());

                        System.out.println("Product Name: " + p.getProduct_price());
                        System.out.println("Category: " + p.getProduct_price());
                        System.out.println("Description: " + p.getProduct_price());
                        System.out.println("Price: " + p.getProduct_price());
                        System.out.println("Quantity: " + qty);
                        System.out.println("Total: Rs." + total);
                    } catch (BillingException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Product not found or DB error");
                    }
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter option 1 to 2 only");
            }
        } while (choice != 2);
        sc.close();
    }
}
/* 1. Generate Bill by entering code and quantity
2. Exit
1
Enter product_code: 1003
Enter quantity: 4
Product not found or DB error
1. Generate Bill by entering code and quantity
2. Exit
1
Enter product_code: 1002
Enter quantity: 1
Product Name: 45000.0
Category: 45000.0
Description: 45000.0
Price: 45000.0
Quantity: 1
Total: Rs.45000.0
*/
