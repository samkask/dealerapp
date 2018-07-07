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
public class Option {

    private String name;
    private String description;

    Option(String name, String description) {
        this.name = name;
        this.description = description;
    }

//    public String Option(){
//        return name + description;
//    }
    public String toString() {
        String o = name + "-" + description;
        return o;
    }
     public String getName() { //for writing to text only
         return name;
}
     public String getDescription(){ //for writing to text only
         return description;
     }
}
