package com.company;

import java.util.Scanner;

public class StockManager extends Stock {
    DataBaseManager dataBaseManager;
    public void add(){
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Enter ItemName : ");
        String ıtemName = getItemName();
        ıtemName = Keyboard.next();
        System.out.print("Enter Skt : ");
        String skt = getSkt();
        skt = Keyboard.next();
        System.out.print("Enter ItemCod : ");
        int ıtemCod = getItemCod();
        ıtemCod = Keyboard.nextInt();



    }


}
