
package Digikalamanage;

import java.util.logging.Logger;

public class MaindigikalaApplication {
    private static final Logger mylogger = Logger.getLogger(MaindigikalaApplication.class.getName());

    public static void main(String[] args) {
    	
        try {
            mylogger.info("Requesting products with name 'shirt' in category CLOTHING:");
            DigiServices.getproductslist("shirt", Category.CLOTHING).forEach(System.out::println);
            
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            mylogger.info("Requesting products with name 'iphone' (any category):");
            DigiServices.getproductslist("iphone", null).forEach(System.out::println);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            mylogger.info("Requesting products in category FOOD (any name):");
            DigiServices.getproductslist(null, Category.Food).forEach(System.out::println);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            mylogger.info("Requesting all products:");
            DigiServices.getproductslist(null, null).forEach(System.out::println);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
