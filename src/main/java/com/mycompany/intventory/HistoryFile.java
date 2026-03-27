package com.mycompany.intventory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HistoryFile {
    
    private static BufferedReader reader;
    private static BufferedWriter writer;
    private static File file, user;
    private static LocalDateTime date;
    private static DateTimeFormatter dtf;
    
    private static String historyData; // dito lalagay mga history
    
    public HistoryFile() {
    
        try {
            
            file = new File("");
            user = new File(file.getAbsolutePath() + "\\Accounts\\" + 
                    UserFile.getUserName() + "History.txt");
            user.createNewFile();
            
            getHistory();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
    }
    
    public static void addHistory(String iName, String iType, 
                        String iSize, String iPrice, String historyType) {
    
        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        date = LocalDateTime.now();
        
        
        historyData = "--------------------------------------------------------"
              + "------------------------------------------------------------"
                + "\n" + historyData;
        historyData = historyType + "\n" + historyData;
        historyData = iName + " : " + iType + " : " + 
                        iSize + " : " + iPrice + "\n" + historyData;
        historyData = dtf.format(date) + "\n" + historyData;
        
        
        
        try {
            
            writer = new BufferedWriter(new FileWriter(user, false));
            writer.write(historyData);
            writer.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    public static String getHistory() {
    
        historyData = "";
        
        try {
            
            int counter = 0; //Limit ng history, hanggang 50 lang muna
            
            reader = new BufferedReader(new FileReader(user));
            
            String line;
            
            while ((line = reader.readLine()) != null && counter < 200) {
            
                historyData = historyData + line + "\n";
                counter++;
                
            }
            reader.close();
            
            return historyData;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return null;
    }
}
