
package Digikalamanage;

public class MaindigikalaApplication {

    public static void main(String[] args) {
    	
        try {
            DigiServices.getproductslist("shirt", Category.CLOTHING).forEach(System.out::println);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            DigiServices.getproductslist("iphone", null).forEach(System.out::println);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            DigiServices.getproductslist(null, Category.Food).forEach(System.out::println);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            DigiServices.getproductslist(null, null).forEach(System.out::println);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
