package Digikalamanage;

import java.util.List;
import java.util.stream.Collectors;


public class DigiServices {

			public static List<Product> products;
			
			static {
				
				
				Product product1= new Product("Pants",Category.CLOTHING, 780,true)	;
				Product product2= new Product("iphone",Category.DIGITAL, 60000,false)	;
				Product product3= new Product("shirt",Category.CLOTHING, 550,true)	;
				Product product4= new Product("can",Category.HOME, 110,true)	;
				Product product5= new Product("Tonmahi",Category.Food, 85,false)	;
				Product product6= new Product("laptop",Category.DIGITAL, 54500,true)	;
				Product product7= new Product("cleaner",Category.HOME, 5650,true)	;
				Product product8= new Product("limonad",Category.Food, 40,false)	;
				
				products = List.of(product1,product2,product3,product4,product5,product6,product7,product8);
				
			}
			
			
			public static List<Product> getproductslist(String productName,Category category) throws  ProductNotFoundException{
				
				List<Product> productlist = products.stream()
						.filter(t -> t.productname().equals(productName) || productName == null )
						.filter(t ->t.category()==category || category == null)
						.collect(Collectors.toList());
				
						
				if (productlist.isEmpty()) {
		            throw new ProductNotFoundException("No products found ");
		        }
				
				return productlist;
			}
			 
}
