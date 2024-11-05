package session1.exercise5;

public class Account {

    private double balance;          
    private String branch;           
    private boolean isLocked;       
    private String lastTransaction;    

    // کانستراکتور فقط با مانده
    public Account(double balance) {
        this.balance = balance;
        this.branch = "نامشخص";      
        this.isLocked = false;       
        this.lastTransaction = "هیچ تراکنشی ثبت نشده";
    }

    // کانستراکتور با مانده و شعبه
    public Account(double balance, String branch) {
        this.balance = balance;
        this.branch = branch;
        this.isLocked = false;       
        this.lastTransaction = "هیچ تراکنشی ثبت نشده";
    }

    // متد برای نمایش اطلاعات حساب
    public void printAccountInfo() {
        System.out.println("اطلاعات حساب:");
              System.out.println("مانده حساب: " + balance);
        System.out.println("شعبه: " + branch);
        System.out.println("قفل بودن حساب: " + (isLocked ? "بله" : "خیر"));
        System.out.println("آخرین تراکنش: " + lastTransaction);
    }

    // متد برداشت
    public void withdraw(double amount) {
        if (isLocked) {
            System.out.println("حساب قفل است. امکان برداشت وجود ندارد.");
            return;
        }

        if (amount > balance) {
            System.out.println("خطا: مبلغ برداشت بیشتر از مانده حساب است.");
        } else {
            balance -= amount; 
            lastTransaction = "برداشت به مبلغ " + amount; 
            System.out.println("برداشت انجام شد. مبلغ: " + amount);
        }
    }

    // متد قفل کردن حساب
    public void lockAccount() {
        isLocked = true;
    }

    // متد باز کردن قفل حساب
    public void unlockAccount() {
        isLocked = false;
    }
}
