package com.loop.utilities;

public class TestExcel {
    public static void main(String[] args) {

        ExcelUtils excelUtils =new ExcelUtils("C:/Users/akbar/OneDrive/Desktop/New OpenDocument Text.odt", "Akbar");

        System.out.println("data from excel = " + excelUtils.getCellData(7,3));
    }
}
