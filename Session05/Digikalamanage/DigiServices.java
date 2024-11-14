package Digikalamanage;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class DigiServices {
	private static final Logger mylogger = Logger.getLogger(DigiServices.class.getName());

			public static List<Product> products;
			
			static {
				
				
				Product product1= new Product("Pants",Category.CLOTHING, 780,true)	;
				Product product2= new Product("iphone",Category.DIGITAL, 60000,false)	;
				Product product3= new Product("shirt",Category.CLOTHING, 550,true)	;
				Product product4= new Product("can",Category.HOME, 110,true)	;
				Product product5= new Product("TonFish",Category.Food, 85,false)	;
				Product product6= new Product("laptop",Category.DIGITAL, 54500,true)	;
				Product product7= new Product("cleaner",Category.HOME, 5650,true)	;
				Product product8= new Product("limonad",Category.Food, 40,false)	;
				
				products = List.of(product1,product2,product3,product4,product5,product6,product7,product8);
				
		        mylogger.info("Product list initialized with " + products.size() + " items.");
		        
			}
			
			
			public static List<Product> getproductslist(String productName,Category category) throws  ProductNotFoundException{
				
		        mylogger.info("making products with filters - Name: " + productName + ", Category: " + category);
				List<Product> productlist = products.stream()
						.filter(t -> t.productname().equals(productName) || productName == null )
						.filter(t ->t.category()==category || category == null)
						.collect(Collectors.toList());
				
						
				if (productlist.isEmpty()) {
					
		            mylogger.warning("No products found for filters - Name: " + productName + ", Category: " + category);
		            
		            throw new ProductNotFoundException("No products found ");
		        }
		        mylogger.info("Found " + productlist.size() + " products for filters - Name: " + productName + ", Category: " + category);
				return productlist;
			}
			 
}
