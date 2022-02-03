package implement;

import entity.ProductEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import service.ProductService;

public class ProductServiceImplement implements ProductService {

    HashMap<String, ProductEntity> products;
    Scanner read;

    public ProductServiceImplement() {
        this.products = new HashMap();
        this.read = new Scanner(System.in);
    }

    @Override
    public ProductEntity startNewProduct() {
        ProductEntity newProduct = new ProductEntity();

        System.out.println("Insert the product name:");
        newProduct.setProductName(read.next());
        System.out.println("Insert the product price:");
        newProduct.setProductPrice(read.nextDouble());

        return newProduct;
    }

    @Override
    public void addProductToTheMap(ProductEntity newProduct) {

        products.put(newProduct.getProductName(), newProduct);

    }

    @Override
    public String showProducts() {

        String productsListed = "The products are : \n";

        for (Map.Entry<String, ProductEntity> unitaryProduct : products.entrySet()) {

            productsListed += unitaryProduct.getKey() + " , $ " + unitaryProduct.getValue().getProductPrice() + "\n";
        }
        return productsListed;
    }

    @Override
    public Boolean changeProductPrice(String productToChangePrice) {

        for (Map.Entry<String, ProductEntity> unitaryProduct : products.entrySet()) {
            if (unitaryProduct.getKey().equals(productToChangePrice)) {

                System.out.println("Insert the new Price for the product < " + unitaryProduct.getKey() + "> ");
                unitaryProduct.getValue().setProductPrice(read.nextDouble());

                return true;
            }

        }

        return false;
    }

    @Override
    public Boolean removeProduct(String productToRemove) {

        for (Map.Entry<String, ProductEntity> unitaryProduct : products.entrySet()) {
            if (unitaryProduct.getKey().equals(productToRemove)) {

                products.remove(unitaryProduct.getKey());
                return true;
            }
        }
//        Iterator<Map.Entry<String, ProductEntity>> it = products.entrySet().iterator();
//
//        while (it.hasNext()) {
//            Map.Entry<String, ProductEntity> next = it.next();
//            if (next.getKey().equals(productToRemove)) {
//
//                it.remove();
//                return true;
//            }
//
//        }

        return false;
    }

    @Override
    public String sortProductsByPrice() {

        String sortedProductsByPrice = "Products sorted by Price : \n";
        ArrayList<ProductEntity> productsListed = new ArrayList<ProductEntity>(products.values());
        Collections.sort(productsListed, utilities.ProductComparators.sortByProductPrice);
        for (ProductEntity productUnitary : productsListed) {

            sortedProductsByPrice += productUnitary.getProductName() + " , $ " + productUnitary.getProductPrice() + "\n";

        }

        return sortedProductsByPrice;
    }

    @Override
    public String sortProductsByName() {

        String sortedProductsByName = "Products sorted by Name : \n";
        ArrayList<ProductEntity> productsListed = new ArrayList<ProductEntity>(products.values());
        Collections.sort(productsListed, utilities.ProductComparators.sortByCountryName);
        for (ProductEntity productUnitary : productsListed) {
             
            sortedProductsByName += productUnitary.getProductName() + " , $" + productUnitary.getProductPrice() + " \n";
            
        }

        return sortedProductsByName;
    }

    public void menu() {

        int option;

        do {

            System.out.println(constants.ProductConstants.MENU_MESSAGE);

            option = read.nextInt();

            switch (option) {
                case 1:
                    ProductEntity newProduct = startNewProduct();
                    addProductToTheMap(newProduct);

                    break;
                case 2:
                    System.out.println(showProducts());

                    break;
                case 3:
                    System.out.println("Insert the name product to change its price:");
                    String productToChangePrice = read.next();

                    if (!changeProductPrice(productToChangePrice)) {
                        System.out.println("The product was not founded");
                    }

                    break;
                case 4:
                    System.out.println("Insert the product to remove:");
                    String productToRemove = read.next();
                    if (!removeProduct(productToRemove)) {
                        System.out.println("Product doesnt exist in the list");
                    }
                    break;
                case 5:
                    System.out.println(sortProductsByName());

                    break;
                case 6:
                    System.out.println(sortProductsByPrice());

                    break;

                case 7:

                    String optExit;

                    System.out.println("Are you sure you want to exit ?");

                    optExit = read.next();

                    if (optExit.equalsIgnoreCase("y")) {
                        System.out.println("The program has finished.");
                    } else {

                        option = 0;
                    }
                    break;
                default:
                    throw new AssertionError();
            }

        } while (option != 7);

    }

}
