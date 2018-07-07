/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciscdapp;

import java.util.Arrays;

/**
 *
 * @author sam
 */
public class Car {

    private String make;
    private int year;
    private String model;
    private int price;
    private String color;
    private CarType type;
    private Engine engine;
    private Interior interior;
    private Trunk trunk;
    private Option[] options;
    private int entries;

    public Car(String make, int year, String model, int price, String color, CarType type) {
        this.make = make;
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color;
        this.type = type;
        this.options = new Option[10];
        this.entries = 0;
    }

    public Car(String make, int year, String model, int price, String color, CarType type, Engine engine, Interior interior, Trunk trunk) {

        this(make, year, model, price, color, type);

        this.engine = engine;
        this.interior = interior;
        this.trunk = trunk;
        this.type = type;
        this.options = new Option[10];
        this.entries = 0;
    }

    public String getColor() {
        return this.color;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public CarType getType() {
        return this.type;
    }

    public void SetEngine(Engine engine) {
        this.engine = engine;
    }

    public void SetInterior(Interior interior) {
        this.interior = interior;
    }

    public void SetTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    public void AddOption(Option option) {
        Option[] op = new Option[entries + 1];
        for (int i = 0; i < entries; i++) {
            op[i] = this.options[i];
        }
        op[entries] = option;
        entries++;
        this.options = op;
    }
    public boolean spareTire(){ //for writing to text only
        return trunk.getSpareTire();
    }
    public boolean FirstAidKit(){ //for writing to text only
        return trunk.getFirstAidKit();
    }
    public boolean HasCarpet(){ //for writing to text only
        return trunk.getHasCarpet();
    }
    public boolean HasJack(){ //for writing to text only
        return trunk.getHasJack();
    }
    public String CarpetColor(){ //for writing to text only
        return trunk.getCarpetColor();
    }
    public String InteriorColor1(){ //for writing to text only
        return interior.getColor1();
    }
    public String InteriorColor2(){ //for writing to text only
        return interior.getColor2();
    }
    public boolean HasSunRoof(){ //for writing to text only
        return interior.getHasSunRoof();
    }
    public boolean HasMoonRoof(){ //for writing to text only
        return interior.getHasMoonRoof();
    }

    public String OpenTrunk() { 
        return trunk.toString();
    }

    public String CheckEngine() {
        return engine.toString();

    }

    public String CheckInterior() {
        return interior.toString();
    }

    public String CheckOptions() {
        return Arrays.toString(options);
    }
    

    public String toString() {
        String s = color + " " + year + " " + make + " " + model + " " + type + " for $" + price;
        return s;

    }

    public String CompareTo() {
        String c = "The " + year + " " + make + " " + model;
        return c;

    }

    public int getOptions() {

        return this.options.length;

    }

    public int getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    public Engine getEngine() {
        return this.engine;
    }

}
