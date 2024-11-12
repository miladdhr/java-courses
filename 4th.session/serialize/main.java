package session4.example2;


import java.io.*;


public class Main {

       public static void main(String[] args) {

        String username = "Milad";
        String password = "123@milad";
        String cardNumber = "13741121";

        User user = new User(username, password, cardNumber);

        user.addAccount("account1");
        user.addAccount("account2");

        String filename = "user.ser";

        serializeUser(user, filename);

        User deserializedUser = deserializeUser(filename);

        if (deserializedUser != null) {

            System.out.println("نام کاربری: " + deserializedUser.getUsername());
            System.out.println("حساب‌های کاربری:");

            for (String account : deserializedUser.getAccounts()) {
                System.out.println(account);
            }
        }
    }

    
    public static void serializeUser(User user, String filename) {

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(user); 

            System.out.println("شیء با موفقیت سریالایز شد.");

        } catch (IOException e) {
            System.out.println("خطا در سریالایز کردن شیء: " + e.getMessage());
        }
    }

    
    public static User deserializeUser(String filename) {

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {

            return (User) in.readObject(); 

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("خطا در دیسریالایز کردن شیء: " + e.getMessage());
            return null; // در صورت خطا null باز می‌گرداند
        }
    }
}
