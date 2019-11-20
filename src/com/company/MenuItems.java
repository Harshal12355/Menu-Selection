package com.company;

public class MenuItems {
    public  String strItemName="";
    public double dbBasePrice=0.0;
    public int dbBurgerAmount = 0;
    public double dbTotalAmount=0.0;


    public MenuItems(String strItemName, double dbBasePrice, int dbBurgerAmount) {
        this.strItemName = strItemName;
        this.dbBasePrice = dbBasePrice;
        this.dbBurgerAmount = dbBurgerAmount;
        this.dbTotalAmount = dbBurgerAmount * dbBurgerAmount;
    }





}
