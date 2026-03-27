package com.mycompany.intventory;

import javax.swing.JOptionPane;

public class Validation {
    
//This class entire purpose is to check if the user input is correct  
    
    public static boolean isEmailEmpty(String email) {
    
        if (email.equals("Enter Email") || email.equals("")) {
            
            JOptionPane.showMessageDialog(null, 
                    "Please enter an email address.");
            return true;
        }
        return false;
    }
    
    public static boolean isPasswordEmpty(String password) {
    
        if (password.equals("Enter Password") || 
                            password.equals("")) {
            
            JOptionPane.showMessageDialog(null, 
                    "Please enter a password.");
            return true;
        }
        return false;
    }
    
    public static boolean isUsernameEmpty(String username) {
    
        if (username.equals("Enter Username") || username.isBlank()) {
            
            JOptionPane.showMessageDialog(null,
                            "Please enter a username.");
            return true;
        }
    
        return false;
    }
    
    public static boolean isEmailNameEmpty(String emailname) {
    
        if (emailname.equals("Enter Email or Username") || 
                            emailname.isBlank()) {
            
            JOptionPane.showMessageDialog(null,
                            "Please enter an email or username.");
            return true;
        }
    
        return false;
    
    }
    
    public static boolean isEmailInvalid(String email) {
    
        if ((!email.contains("@") || !email.contains(".com"))
                || email.contains(" ") || email.contains("@.com")) {
            
            JOptionPane.showMessageDialog(null,
                        "Please enter valid e-mail format!");
            return true;
        }
    
        return false;
    }
    
    public static boolean doesPassMatch(String pass, String rePass) {
    
        if (pass.equals(rePass)) {
            
            return true;
        }
    
        JOptionPane.showMessageDialog(null,
                            "Password does not match.");
        return false;
    }
    
    // returns true if password is wrong
    public static boolean isPasswordInvalid(String pass, String name,
                                                        String email) {
    
        if (pass.length() < 8) {
            
            JOptionPane.showMessageDialog(null, 
                                        "Password is too short." + 
                                      "\nMust be at least 8 characters");
            return true;
            
        } else if (pass.contains(" ")) {
            
            JOptionPane.showMessageDialog(null, 
                            "Spaces in password are not allowed.");
            return true;
            
        } else if (pass.equals(name)) {
            
            JOptionPane.showMessageDialog(null, 
                            "Password cannot be the same as username.");
            return true;
            
        } else if (pass.equals(email)) {
            
            JOptionPane.showMessageDialog(null, 
                            "Password cannot be the same as email.");
            return true;

        }
    
        return false;
    }
    
    public static boolean isUsernameInvalid(String uName) {
    
        if (uName.length() > 16) {
            
            JOptionPane.showMessageDialog(null, 
                    "Username is too long" + 
                  "\nCannot exceed 16 characters");
            return true;
        }
        
        if (uName.contains(" ")) {
            
            JOptionPane.showMessageDialog(null, 
                    "Username cannot contain spaces.");
            return true;
        }
        return false;
    }
}
