package session4.example1;

public class Main {
    public static void main(String[] args) {
        String validFileName = "validFile.txt";  
        String invalidFileName = "invalidFile.txt"; 
        String contentToWrite = " متن تست"; 

        try {
            FileUtils.writeFile(contentToWrite, validFileName);
            System.out.println("داده‌ها با موفقیت در فایل نوشته شدند: " + validFileName);
        } catch (FileUtilsException e) {
            System.out.println("خطا در نوشتن فایل: " + e.getMessage());
        }

        try {
            String content = FileUtils.readFile(validFileName);
            System.out.println("محتوای فایل با موفقیت خوانده شد: ");
            System.out.println(content);
        } catch (FileUtilsException e) {
            System.out.println("خطا در خواندن فایل: " + e.getMessage());
        }

        try {
            String content = FileUtils.readFile(invalidFileName);
            System.out.println("محتوای فایل " + invalidFileName + " خوانده شد: ");
            System.out.println(content);
        } catch (FileUtilsException e) {
            System.out.println("خطا در خواندن فایل: " + e.getMessage());
        }

        String invalidPath = "/invalidPath/invalidFile.txt";
        try {
            FileUtils.writeFile(contentToWrite, invalidPath);
            System.out.println("داده‌ها در مسیر غیرمجاز نوشته شدند: " + invalidPath);
        } catch (FileUtilsException e) {
            System.out.println("خطا در نوشتن فایل: " + e.getMessage());
        }
    }
}
