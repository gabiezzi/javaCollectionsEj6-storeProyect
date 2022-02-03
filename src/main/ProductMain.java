/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import implement.ProductServiceImplement;

/**
 *
 * @author Gabi
 */
public class ProductMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProductServiceImplement newService = new ProductServiceImplement();
        newService.menu();
        

    }
    
}
