/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.ProductEntity;

/**
 *
 * @author Gabi
 */
public interface ProductService {
    
    public ProductEntity startNewProduct();
    public void addProductToTheMap(ProductEntity newProduct);
    public String showProducts();
    public Boolean changeProductPrice(String productToChangePrice);
    public Boolean removeProduct(String productToRemove);
    public String sortProductsByPrice();
    public String sortProductsByName();
    public void menu();
    
    
    
}
