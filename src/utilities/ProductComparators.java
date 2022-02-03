/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import entity.ProductEntity;
import java.util.Comparator;

public class ProductComparators {

    public static Comparator<ProductEntity> sortByCountryName = new Comparator<ProductEntity>() {
        @Override
        public int compare(ProductEntity product1, ProductEntity product2) {

            return product1.getProductName().compareTo(product2.getProductName());
        }

    };

    public static Comparator<ProductEntity> sortByProductPrice = new Comparator<ProductEntity>() {
        @Override
        public int compare(ProductEntity product1, ProductEntity product2) {

            return product1.getProductPrice().compareTo(product2.getProductPrice());
        }

    };

}
