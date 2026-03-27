package com.mycompany.intventory;


//This class stores the data of each item that comes from the file separately
public class Item {
    
    private String iName;
    private String iSize;
    private String iType;
    private double iPrice;
    private int iQty;

    public Item(String iName, String iSize, String iType, 
                                    double iPrice, int iQty) {
        
        this.iName = iName;
        this.iSize = iSize;
        this.iType = iType;
        this.iPrice = iPrice;
        this.iQty = iQty;
        
    }

    public String getiName() {
        return iName;
    }

    public String getiSize() {
        return iSize;
    }

    public String getiType() {
        return iType;
    }

    public double getiPrice() {
        return iPrice;
    }

    public int getiQty() {
        return iQty;
    }
    
    
    
}
