package com.company;

public class Main {

    public static void main(String[] args) {
     StockManager stockManager=new StockManager();
     stockManager.dataBaseManager=new OracleManager();
     stockManager.add();
     stockManager.dataBaseManager.getData();


    }
}
