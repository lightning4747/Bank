package com.batman.bank.handler;
import com.batman.bank.model.User;
import com.batman.bank.util.Validator;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class SignupHandler {
  
    private static final String file = "E:\\solo-project\\MyBankingProject\\resources\\users.txt";

    public boolean registeruser(String username, String password, String mail) {
        
        try {
            if(!Validator.isvalidusername(username)) {
                return false;
            }

            if(!Validator.isvalidpassword(password)) {
                return false;
            }

            if(!Validator.isvalidmail(mail)) {
                return false;
            }

        } catch (Exception e) {
            return false;
        }
        
        return true;
        
    }

    public boolean userexists(String mail) {

        try {
           if (!Files.exists(Paths.get(file))) return false;
            return Files.lines(Paths.get(file)).anyMatch(
                line -> {
                    String[] parts = line.split(", ");
                    return parts.length >=2 && parts[1].equalsIgnoreCase(mail.trim());
                }
            
            );
            
        } catch (IOException e) {
            System.out.print("Bow");
            
        }
      return false;
    }

    public boolean saveuser(User user) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(user.getusername() + ", " + user.getmail() + ", " + user.getpassword() + ", ");
            writer.newLine();

            return true;


        }

        catch(IOException e ) {
            return false;

        }
    }


}



