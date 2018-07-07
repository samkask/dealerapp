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
public class Engine {
    private FuelType fuelType;
    private int noOfCylinders; 
    private int capacity;
    private int horsePower; 
    private float mpg;
    
    public Engine (FuelType fuelType, int noOfCylinders, int capacity, int horsePower, float mpg)
    {
        this.fuelType = fuelType;
        this.noOfCylinders = noOfCylinders;
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.mpg = mpg;
    }
    public int getNumberOfCylinders(){
        return this.noOfCylinders;
    }
    
    public int getNumberOfHorsePower(){
        return this.horsePower;
    }
    
    public int getEngineCapacity(){
        return this.capacity;
    }
    
    public float getEngineMPG(){
        return this.mpg;
    }
    
    public FuelType getFT(){
        return this.fuelType;
    }
    
    public String toString()
    {
        String e = fuelType + " powered." + " " + noOfCylinders +" Cylinders." + " " + capacity +"cc" + " " + horsePower +"HP" + " " + mpg + "MPG";
        return e;
        //return "Uses " + fuelType + " " + noOfCylinders + " " + capacity + " " + horsePower + " " + mpg;
    }
    
    //public String engineSpec(){
        //String f = fuelType + " " + noOfCylinders + " " + capacity + " " + horsePower + " " + mpg;
        //if (horsePower > horsePower ){
        //}
        //return "has more horsepower";
    //}
    
    
    
}
