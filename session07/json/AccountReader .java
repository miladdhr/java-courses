package ir.freeland.json.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import ir.freeland.json.model.Account;

import java.io.File;
import java.io.IOException;

public class AccountReader {

    public static void main(String[] args) {
     
        File file = new File("account.json");

      
        ObjectMapper objectMapper = new ObjectMapper();

        try {
           
            Account account = objectMapper.readValue(file, Account.class);

        
            System.out.println(account);

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error reading or parsing the JSON file.");
        }
    }
}
