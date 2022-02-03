/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Objects;

/**
 *
 * @author Gabi
 */
public class ProductEntity {
    
    private String productName;
    private Double productPrice;

    public ProductEntity(String productName, Double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public ProductEntity() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "ProductEntity{" + "productName=" + productName + ", productPrice=" + productPrice + '}';
    }

   
    
    
 
    
}
