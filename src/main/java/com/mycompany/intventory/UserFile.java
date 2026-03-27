package com.mycompany.intventory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


// This class handles the UserFile creation/reader for the items.
public class UserFile {
    
    private static File user;
    private static File file; // placeholder ng absolute path
    private static String userName, email, password;
    
    static LinkedList<Item> list;
    static BufferedReader reader;
    static BufferedWriter writer;
    Item i;
    
    String itemName, itemSize, itemType;
    double itemPrice;
    int itemQty;
    static int numOfLowStock;
    static int numOfItems;
    
    public UserFile () {
    
        list = new LinkedList<>();
        numOfItems = 0;
        
        try {
            file = new File("");
            user = new File(file.getAbsolutePath() + "\\Accounts\\" + 
                                userName + ".txt");
            user.createNewFile();
            
            reader = new BufferedReader(new FileReader(user));
            writer = new BufferedWriter(new FileWriter(user, true));
        
    
            String line;
            while ((line = reader.readLine()) != null) {
            
                itemName = line.substring(0, 
                                    line.indexOf("     "));
                line = line.substring(line.indexOf("     ") + 5, 
                                    line.length());
                
                
                
                itemSize = line.substring(0, 
                                line.indexOf("     "));
                line = line.substring(line.indexOf("     ") + 5, 
                                line.length());
                
                
                
                itemType = line.substring(0, 
                                line.indexOf("     "));
                line = line.substring(line.indexOf("     ") + 5, 
                                line.length());
                
                
                
                itemPrice = Double.parseDouble(line.substring(0, 
                                line.indexOf("     ")));
                line = line.substring(line.indexOf("     ") + 5, 
                                line.length());
                
                
                
                itemQty = Integer.parseInt(line.substring(0, 
                                line.length()));
                
                
                
                i = new Item(itemName, itemSize, itemType, 
                                    itemPrice, itemQty);
                list.add(i);
                
                numOfItems++;
            }
            
            reader.close();
            writer.close();
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
    
    
//Madumi to I know    
    public static boolean doItemExist(String name, String size, 
                                    String type, String price, int index) {
    
        boolean isName, isSize, isType, isPrice;
        int counter = 0; 
        //^^^hindi nya ichecheck yung index ng ineedit, useless pag addItem
        
        for (Item list1: list) {
            
            isName = false;
            isSize = false;
            isType = false;
            isPrice = false;
            
            if (list1.getiName().equalsIgnoreCase(name)) {
                isName = true;
            }
            
            if (list1.getiSize().equals(size)) {
                isSize = true;
            }
            
            if (list1.getiType().equals(type)) {
                isType = true;
            }
            
            if (("" + list1.getiPrice()).equals(price)) {
                isPrice = true;
            }
            
            if (isName && isSize && isType) {
                
                if (counter == index && isPrice) {
                    
                    //Same item same price
                    JOptionPane.showMessageDialog(null, 
                            "No information was edited.");
                    return true;
                    
                } else if (counter == index && !isPrice) {
                    //same item na edit price
                    return false;
                    
                }
                
                JOptionPane.showMessageDialog(null, 
                        "Item already exist.");
                return true;
            }
            
            counter++;
        }
        return false;
    }
    
    public static void addItem(String item) {
    
        try {
            writer = new BufferedWriter(new FileWriter(user, true));
            writer.write(item);
            writer.close();
            new UserFile();
            
            JOptionPane.showMessageDialog(null, 
                    "Item added successfully");
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
        
    }
    
    public static void editItem(String newItem, int index) {
    
        try {
            
            reader = new BufferedReader(new FileReader(user));
            String data = "";
            String line;
            int counter = 0; //this represent what index the readline is on
            while ((line = reader.readLine()) != null) {
            
                if (counter == index) {
                    line = line.replace(line, newItem);
                }
                counter++;
                data = data + line + "\n";
            }
            reader.close();
            
            writer = new BufferedWriter(new FileWriter(user, false));
            writer.write(data);
            writer.close();
            new UserFile();
            
            JOptionPane.showMessageDialog(null, 
                    "Item information updated successfully");
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
    
    public static void editQty(String newQty, int index) {
    
        try {
            
            reader = new BufferedReader(new FileReader(user));
            String data = "";
            String line;
            int counter = 0; //this represent what index the readline is on
            
            while ((line = reader.readLine()) != null) {
            
                if (counter == index) {

                    line = line.substring(0, line.
                                        lastIndexOf("     ") + 5);
                    line = line + newQty;
                    
                }
                counter++;
                data = data + line + "\n";
            }
            reader.close();
            
            writer = new BufferedWriter(new FileWriter(user, false));
            writer.write(data);
            writer.close();
            new UserFile();
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    
    }
    
    public static void deleteItem(int index) {
    
        try {
            
            reader = new BufferedReader(new FileReader(user));
            String data = "";
            String line;
            int counter = 0; //this represent what index the readline is on
            while ((line = reader.readLine()) != null) {
            
                if (counter == index) {
                    counter++;
                    continue;
                }
                counter++;
                data = data + line + "\n";
            }
            reader.close();
            
            writer = new BufferedWriter(new FileWriter(user, false));
            writer.write(data);
            writer.close();
            new UserFile();
            
            JOptionPane.showMessageDialog(null, 
                    "Item deleted successfully.");
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
    public static String getTotalQuantity () {
    
        int numOfItem = 0;
        
    //This for loop traverse the linkelist values, same as the next for loop
        
        for (Item list1 : list) {
            
            numOfItem += list1.getiQty();
            
        }
        
        return numOfItem + "";
    }
    
    public static String getLowStock () {
    
        numOfLowStock = 0;
        boolean nothingIsLow = true;
        boolean somethingIsLow = false;
        String lowStockMessage = "Low on stock!       \n";
    
        if (list.size() == 0) {
            return "Nothing is on stock.";
        }
        
        for (Item list1: list) {
        
            if (list1.getiQty() <= 20) {
                nothingIsLow = false;
                somethingIsLow = true;
                
                lowStockMessage = lowStockMessage 
                        + "Item: " + list1.getiName() 
                        + "   Size: " + list1.getiSize() 
                        + "   Amount left: " + list1.getiQty() + "\n";
                
                numOfLowStock++;
            }
        }
        
        if (somethingIsLow) {
            return lowStockMessage;
        }
        
        if (nothingIsLow) {
            return "Everything seems to be on stock.";
        }
        return "error";
    }
    
    public static String getItemNames () {
    
        String itemList = "";
        
        for (Item list1: list) {
        
            itemList = itemList + list1.getiSize() + " " + 
                                list1.getiName() + "\n";
        
        }
    
        return itemList;
    }

    public static String getUserName() {
        return userName;
    }

    public static String getEmail() {
        return email;
    }

    public static String getPassword() {
        return password;
    }

    public static void setUserName(String userName) {
        UserFile.userName = userName;
    }

    public static void setEmail(String email) {
        UserFile.email = email;
    }

    public static void setPassword(String password) {
        UserFile.password = password;
    }
}
