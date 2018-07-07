/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciscdapp;

/**
 *
 * @author sam
 */
public class Trunk {

    private boolean hasSpareTire;
    private boolean hasFirstAidKit;
    private boolean hasCarpet;
    private boolean hasJack;
    private String carpetColor;

    public Trunk(boolean hasSpareTire, boolean hasFirstAidKit, boolean hasCarpet, boolean hasJack, String carpetColor) {
        this.hasSpareTire = hasSpareTire;
        this.hasFirstAidKit = hasFirstAidKit;
        this.hasCarpet = hasCarpet;
        this.hasJack = hasJack;
        this.carpetColor = carpetColor;

    }

    public String spareTire() {
        String tire;
        if (hasSpareTire == true) {
            tire = "Spare Tire,";
        } else {
            tire = "";
        }
        return tire;
    }

    public String firstAid() {
        String tire;
        if (hasFirstAidKit == true) {
            tire = " First Aid Kit,";
        } else {
            tire = "";
        }
        return tire;
    }

    public String carpet() {
        String carp;
        if (hasCarpet) {
            carp = " Carpet";
        } else {
            carp = "";
        }
        return carp;
    }

    public String jack() {
        String jackz;
        if (hasJack) {
            jackz = " Jack,";
        } else {
            jackz = "";
        }
        return jackz;
    }

    public boolean getSpareTire() { //for writing to text only
        return this.hasSpareTire;
    }

    public boolean getFirstAidKit() { //for writing to text only
        return this.hasFirstAidKit;
    }

    public boolean getHasCarpet() { //for writing to text only
        return this.hasCarpet;
    }

    public boolean getHasJack() { //for writing to text only
        return this.hasJack;
    }

    public String getCarpetColor() { //for writing to text only
        return this.carpetColor;
    }

    public String toString() {
        String t = (spareTire() + firstAid() + jack() + " " + carpetColor + carpet());
        return t;
    }

}
