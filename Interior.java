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
public class Interior {

    private String color1;
    private String color2;
    private boolean hasSunRoof;
    private boolean hasMoonRoof;

    public Interior (String color1, String color2, boolean hasSunRoof, boolean hasMoonRoof) {
        this.color1 = color1;
        this.color2 = color2;
        this.hasMoonRoof = hasMoonRoof;
        this.hasSunRoof = hasSunRoof;
    }

    public String sunRoof() {
        String sRoof;
        if (hasSunRoof) {
            sRoof = (" Sun Roof Installed.");
        } else {
            sRoof = "";
        }
        return sRoof;

    }

    public String moonRoof() {
        String mRoof;
        if (hasMoonRoof) {
            mRoof = (" Moon Roof Installed.");
        } else {
            mRoof = "";
        }
        return mRoof;
    }
    public String getColor1(){ //for writing to text only
    return this.color1;
}
    public String getColor2(){ //for writing to text only
        return this.color2;
    }
    public boolean getHasSunRoof(){ //for writing to text only
        return this.hasSunRoof;
    }
    public boolean getHasMoonRoof(){ //for writing to text only
        return this.hasMoonRoof;
    }

    public String toString() {
        String i = color1 + " and " + color2 + " colored interior." + " " + sunRoof() + " " + moonRoof();
        return i;
    }

}
