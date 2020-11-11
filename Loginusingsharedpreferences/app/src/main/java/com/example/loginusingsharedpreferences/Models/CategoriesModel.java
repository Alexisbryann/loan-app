package com.example.loginusingsharedpreferences.Models;

public class CategoriesModel {

    static String ProductName;
    static int image;

    public CategoriesModel(String productName, int image) {
        ProductName = productName;
        CategoriesModel.image = image;
    }

    public static String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public static int getImage() {
        return image;
    }

    public void setImage(int image) {
        CategoriesModel.image = image;
    }
}

