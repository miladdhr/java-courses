
package session4.example1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {

    public static String readFile(String fileName) throws FileUtilsException {
        String content = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content += line + "\n";
            }
        } catch (FileNotFoundException e) {
            throw new FileUtilsException("فایل پیدا نشد: " + fileName, e);
        } catch (IOException e) {
            throw new FileUtilsException("خطا در خواندن فایل: " + fileName, e);
        } catch (SecurityException e) {
            throw new FileUtilsException("دسترسی به فایل مجاز نیست: " + fileName, e);
        }

        return content;
    }

    public static void writeFile(String data, String fileName) throws FileUtilsException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
        } catch (FileNotFoundException e) {
            throw new FileUtilsException("فایل پیدا نشد: " + fileName, e);
        } catch (IOException e) {
            throw new FileUtilsException("خطا در نوشتن فایل: " + fileName, e);
        } catch (SecurityException e) {
            throw new FileUtilsException("دسترسی به فایل مجاز نیست: " + fileName, e);
        }
    }
}
