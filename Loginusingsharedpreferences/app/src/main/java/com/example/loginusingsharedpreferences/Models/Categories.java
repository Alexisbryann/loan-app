package com.example.loginusingsharedpreferences.Models;

import android.media.Image;

public class Categories {
     Image Phones;
     Image BlackFriday;
     Image OfficialStores;
     Image JumiaGlobal;
     Image Televisions;
     Image PlayAndWin;
     Image JumiaFood;
     Image JumiaPay;

    public Categories(Image phones, Image blackFriday, Image officialStores, Image jumiaGlobal,
                      Image televisions, Image playAndWin, Image jumiaFood, Image jumiaPay) {
        Phones = phones;
        BlackFriday = blackFriday;
        OfficialStores = officialStores;
        JumiaGlobal = jumiaGlobal;
        Televisions = televisions;
        PlayAndWin = playAndWin;
        JumiaFood = jumiaFood;
        JumiaPay = jumiaPay;
    }

    public Image getPhones() {
        return Phones;
    }

    public void setPhones(Image phones) {
        Phones = phones;
    }

    public Image getBlackFriday() {
        return BlackFriday;
    }

    public void setBlackFriday(Image blackFriday) {
        BlackFriday = blackFriday;
    }

    public Image getOfficialStores() {
        return OfficialStores;
    }

    public void setOfficialStores(Image officialStores) {
        OfficialStores = officialStores;
    }

    public Image getJumiaGlobal() {
        return JumiaGlobal;
    }

    public void setJumiaGlobal(Image jumiaGlobal) {
        JumiaGlobal = jumiaGlobal;
    }

    public Image getTelevisions() {
        return Televisions;
    }

    public void setTelevisions(Image televisions) {
        Televisions = televisions;
    }

    public Image getPlayAndWin() {
        return PlayAndWin;
    }

    public void setPlayAndWin(Image playAndWin) {
        PlayAndWin = playAndWin;
    }

    public Image getJumiaFood() {
        return JumiaFood;
    }

    public void setJumiaFood(Image jumiaFood) {
        JumiaFood = jumiaFood;
    }

    public Image getJumiaPay() {
        return JumiaPay;
    }

    public void setJumiaPay(Image jumiaPay) {
        JumiaPay = jumiaPay;
    }

}

