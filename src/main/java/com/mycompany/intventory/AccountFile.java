package com.mycompany.intventory;

// This file will read all the available account in the txt file

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AccountFile {
    
    private static BufferedReader accReader;
    private static int userAcc;
    static LinkedList accList;
    private File file; //para sa file
    
    public AccountFile() {
    
        try {
            
            file = new File("");
            accList = new LinkedList();
            accReader = new BufferedReader(new FileReader
                    (file.getAbsolutePath() + "\\Accounts\\Accounts.txt"));
            
            String list; //placeholder ng mga account info
            while ((list = accReader.readLine()) != null) {
                
                accList.add(list);
                
            }
            accReader.close();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    
    
    public boolean noSuchAccount (String emailname) {
    
    //FOR THE EMAIL
        for (int i = 0; i < accList.size(); i++) {
            
            String checker = accList.get(i).toString(); 
            // temporary placement ng String
            
            if (checker.substring(checker.indexOf("     ") + 5,
            checker.lastIndexOf("     ")).equals(emailname)) {
                
                userAcc = i;
                return false; // false pag may account
                
            }
            
            if (checker.substring(0, 
            checker.indexOf("     ")).equals(emailname)) {
                
                userAcc = i;
                return false; // false pag may account
                
            }
        }
        
        JOptionPane.showMessageDialog(null, 
                "Account does not exist");
        return true; // true pag walang account
    }
    
    
    
    public boolean isPasswordCorrect (String password) {
    
        String user = accList.get(userAcc).toString();
        
        if (user.substring(user.lastIndexOf("     ") + 5)
                                            .equals(password)) {
            
            setUserInfo(user);
            return true;
            
        }
    
        JOptionPane.showMessageDialog(null, 
                "Incorrect Password!");
        return false;
    }
    
    
    
    public boolean doesEmailExist (String email) {
    
        String checker; //placeholder ng info
        
        for (int i = 0; i < accList.size(); i++) {
            
            checker = accList.get(i).toString();
            if (checker.substring(checker.indexOf("     ") + 5, 
                checker.lastIndexOf("     ")).equals(email)) {
                
                JOptionPane.showMessageDialog(null, 
                                        "Email already in use");
                return true;
            }
        }
        return false;
    }
    
    
    
    public boolean isNameUsed (String name) {
    
        String checker;
        
        for (int i = 0; i < accList.size(); i++) {
            
            checker = accList.get(i).toString();
            if (checker.substring(0, 
                checker.indexOf("     ")).equals(name)) {
                
                JOptionPane.showMessageDialog(null,
                                    "Username already in use");
                return true;
            }
        }
        return false;
    
    }
    
    
    
//This will set the information of the user account to UserFile
    public void setUserInfo(String info) {
    
        UserFile.setEmail(info.substring(info.indexOf("     ") + 5, 
                                    info.lastIndexOf("     ")));
        UserFile.setUserName(info.substring(0, 
                                        info.indexOf("     ")));
        UserFile.setPassword(info.substring(
                                       info.lastIndexOf("     ") + 5));
    
    }

}
