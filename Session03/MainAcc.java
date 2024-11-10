package ThirdSession;

import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainAcc {

	public static void main(String[] args) {
// روش 1 برای لیست کردن
//		Account p01 = new Account(1000,"center","ali");
//		Account p02 = new Account(3000,"bazar","reza");
//		Account p04 = new Account(5000,"Shariati","hamed");
//		Account p05 = new Account(5000,"mirdamad","milad");
//			
//		Account[] arrayAccount = {p01,p02,p03,p03,p04,p05};
//		List arrayAccounts     = Arrays.asList(arrayAccount);
		
		
//	روش 2 برای لیست کردن		
  		 List<Account> arrayAccount = new ArrayList<>();
        arrayAccount.add(new Account(100,"center Branch", "Ali"));
        arrayAccount.add(new Account(50,"bazar Branch", "Hamed"));
        arrayAccount.add(new Account(75,"Shariati Branch", "Reza"));
        arrayAccount.add(new Account(0,"mirdamad Branch", "Mahsa"));        
        arrayAccount.add(new Account(120,"center Branch", "Milad"));
        arrayAccount.add(new Account(55,"Shariati Branch", "Hossein"));

		
		
        System.out.println("Account list:");

		
	     for (Account account : arrayAccount) {
             System.out.println(account);
         }     
	     
	     
	 Collections.sort(arrayAccount, new Comparator<Account>() {
         @Override
         public int compare(Account a1, Account a2) {
             return Double.compare(a2.getBalance(),a1.getBalance());
         }
     });

     System.out.println("لیست حساب‌ها (مرتب شده از بیشتر به کمتر):");
     for (Account account : arrayAccount) {
         System.out.println(account);
     }
	  
     
     Collections.sort(arrayAccount, new Comparator<Account>() {
         @Override
         public int compare(Account a1, Account a2) {
             return Double.compare(a1.getBalance(),a2.getBalance());
         }
     });
     
     System.out.println("لیست حساب‌ها (مرتب شده از کمتر به بیشتر):");
     for (Account account : arrayAccount) {
         System.out.println(account);
     }
     
     
     Map<String, List<Account>> branchAccountsMap = new HashMap<>();     
     
     for (Account account : arrayAccount) {
    	 
         List<Account> branchAccounts = branchAccountsMap.getOrDefault(account.getBranch(), new ArrayList<>());
         branchAccounts.add(account);
         
         branchAccountsMap.put(account.getBranch(), branchAccounts);
     }

     for (String branch : branchAccountsMap.keySet()) {
         System.out.println("Branch: " + branch);
         for (Account account : branchAccountsMap.get(branch)) {
             System.out.println(account);
         }
         System.out.println();
     }
     
     
     branchAccountsMap.remove("mirdamad Branch");
     
 
     for (String branch : branchAccountsMap.keySet()) {
         System.out.println("Branch: " + branch);
         for (Account account : branchAccountsMap.get(branch)) {
             System.out.println(account);
         }
         System.out.println();
     }
     
     
//     Exercise Part 2 
     
     
     
     System.out.println("Accounts Atart with A");
     List<Account> accountsStartingWithA = arrayAccount.stream()
             .filter(account -> account.getName().startsWith("A"))
             .collect(Collectors.toList());
     
     accountsStartingWithA.forEach(System.out::println);
     
     
     System.out.println("Uppercase Accounts Name:");
     arrayAccount.forEach(account -> {
         account.setName(account.getName().toUpperCase()); 
     });
     
     System.out.println(" Start with A and Balance>10 :");  
     List<Account> filteredAccounts = arrayAccount.stream()
             .filter(account -> account.getName().startsWith("A") && account.getBalance() > 10)
             .collect(Collectors.toList());

     filteredAccounts.forEach(System.out::println);
     
     
     
	}
}
