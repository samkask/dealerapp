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
import java.io.*;
import java.util.*;

public class Dealership {

    
    private Car selectedCar;
    private LinkedList<Car> cars;

    public Dealership() {

        try {
            File carsFile = new File("carsFile.txt");
            if (carsFile.exists()) {
                //carsFile.createNewFile();

//                PrintWriter out = new PrintWriter(
//                        new BufferedWriter(
//                                new FileWriter(carsFile)));
//
//                for (int i = 0; i < 1; i++) {
//
//                    out.print(cars[0].getColor() + "," + cars[0].getYear() + "," + cars[0].getMake() + "," + cars[0].getModel() + "," + cars[0].getPrice() + "," + cars[0].getType() + "," + cars[0].getEngine().getFT() + "," + cars[0].getEngine().getNumberOfCylinders() + "," + cars[0].getEngine().getEngineCapacity() + "," + cars[0].getEngine().getNumberOfHorsePower() + "," + cars[0].getEngine().getEngineMPG() + "," + cars[0].spareTire() + "," + cars[0].FirstAidKit() + "," + cars[0].HasCarpet() + "," + cars[0].HasJack() + "," + cars[0].CarpetColor() + "," + cars[0].InteriorColor1() + "," + cars[0].InteriorColor2() + "," + cars[0].HasMoonRoof() + "," + cars[0].HasSunRoof() + "," + "GPS" + "," + "Navigation" + "," + "Fog Lights" + "," + "front mounted fog lights" + "," + "HID" + "," + "high intensity discharge lights\n");
//                    out.print(cars[1].getColor() + "," + cars[1].getYear() + "," + cars[1].getMake() + "," + cars[1].getModel() + "," + cars[1].getPrice() + "," + cars[1].getType() + "," + cars[1].getEngine().getFT() + "," + cars[1].getEngine().getNumberOfCylinders() + "," + cars[1].getEngine().getEngineCapacity() + "," + cars[1].getEngine().getNumberOfHorsePower() + "," + cars[1].getEngine().getEngineMPG() + "," + cars[1].spareTire() + "," + cars[1].FirstAidKit() + "," + cars[1].HasCarpet() + "," + cars[1].HasJack() + "," + cars[1].CarpetColor() + "," + cars[1].InteriorColor1() + "," + cars[1].InteriorColor2() + "," + cars[1].HasMoonRoof() + "," + cars[1].HasSunRoof() + "," + "GPS" + "," + "Navigation" + "," + "Fog Lights" + "," + "front mounted fog lights" + "," + "HID" + "," + "high intensity discharge lights\n");
//                    out.print(cars[2].getColor() + "," + cars[2].getYear() + "," + cars[2].getMake() + "," + cars[2].getModel() + "," + cars[2].getPrice() + "," + cars[2].getType() + "," + cars[2].getEngine().getFT() + "," + cars[2].getEngine().getNumberOfCylinders() + "," + cars[2].getEngine().getEngineCapacity() + "," + cars[2].getEngine().getNumberOfHorsePower() + "," + cars[2].getEngine().getEngineMPG() + "," + cars[2].spareTire() + "," + cars[2].FirstAidKit() + "," + cars[2].HasCarpet() + "," + cars[2].HasJack() + "," + cars[2].CarpetColor() + "," + cars[2].InteriorColor1() + "," + cars[2].InteriorColor2() + "," + cars[2].HasMoonRoof() + "," + cars[2].HasSunRoof() + "," + "GPS" + "," + "Navigation" + "," + "Fog Lights" + "," + "front mounted fog lights" + "," + "HID" + "," + "high intensity discharge lights\n");
//                    out.print(cars[3].getColor() + "," + cars[3].getYear() + "," + cars[3].getMake() + "," + cars[3].getModel() + "," + cars[3].getPrice() + "," + cars[3].getType() + "," + cars[3].getEngine().getFT() + "," + cars[3].getEngine().getNumberOfCylinders() + "," + cars[3].getEngine().getEngineCapacity() + "," + cars[3].getEngine().getNumberOfHorsePower() + "," + cars[3].getEngine().getEngineMPG() + "," + cars[3].spareTire() + "," + cars[3].FirstAidKit() + "," + cars[3].HasCarpet() + "," + cars[3].HasJack() + "," + cars[3].CarpetColor() + "," + cars[3].InteriorColor1() + "," + cars[3].InteriorColor2() + "," + cars[3].HasMoonRoof() + "," + cars[3].HasSunRoof() + "," + "GPS" + "," + "Navigation" + "," + "Fog Lights" + "," + "front mounted fog lights" + "," + "HID" + "," + "high intensity discharge lights\n");
//                    out.print(cars[4].getColor() + "," + cars[4].getYear() + "," + cars[4].getMake() + "," + cars[4].getModel() + "," + cars[4].getPrice() + "," + cars[4].getType() + "," + cars[4].getEngine().getFT() + "," + cars[4].getEngine().getNumberOfCylinders() + "," + cars[4].getEngine().getEngineCapacity() + "," + cars[4].getEngine().getNumberOfHorsePower() + "," + cars[4].getEngine().getEngineMPG() + "," + cars[4].spareTire() + "," + cars[4].FirstAidKit() + "," + cars[4].HasCarpet() + "," + cars[4].HasJack() + "," + cars[4].CarpetColor() + "," + cars[4].InteriorColor1() + "," + cars[4].InteriorColor2() + "," + cars[4].HasMoonRoof() + "," + cars[4].HasSunRoof() + "," + "GPS" + "," + "Navigation" + "," + "Fog Lights" + "," + "front mounted fog lights" + "," + "HID" + "," + "high intensity discharge lights\n");
//                    out.print(cars[5].getColor() + "," + cars[5].getYear() + "," + cars[5].getMake() + "," + cars[5].getModel() + "," + cars[5].getPrice() + "," + cars[5].getType() + "," + cars[5].getEngine().getFT() + "," + cars[5].getEngine().getNumberOfCylinders() + "," + cars[5].getEngine().getEngineCapacity() + "," + cars[5].getEngine().getNumberOfHorsePower() + "," + cars[5].getEngine().getEngineMPG() + "," + cars[5].spareTire() + "," + cars[5].FirstAidKit() + "," + cars[5].HasCarpet() + "," + cars[5].HasJack() + "," + cars[5].CarpetColor() + "," + cars[5].InteriorColor1() + "," + cars[5].InteriorColor2() + "," + cars[5].HasMoonRoof() + "," + cars[5].HasSunRoof() + "," + "GPS" + "," + "Navigation" + "," + "Fog Lights" + "," + "front mounted fog lights" + "," + "HID" + "," + "high intensity discharge lights\n");
//                    out.print(cars[6].getColor() + "," + cars[6].getYear() + "," + cars[6].getMake() + "," + cars[6].getModel() + "," + cars[6].getPrice() + "," + cars[6].getType() + "," + cars[6].getEngine().getFT() + "," + cars[6].getEngine().getNumberOfCylinders() + "," + cars[6].getEngine().getEngineCapacity() + "," + cars[6].getEngine().getNumberOfHorsePower() + "," + cars[6].getEngine().getEngineMPG() + "," + cars[6].spareTire() + "," + cars[6].FirstAidKit() + "," + cars[6].HasCarpet() + "," + cars[6].HasJack() + "," + cars[6].CarpetColor() + "," + cars[6].InteriorColor1() + "," + cars[6].InteriorColor2() + "," + cars[6].HasMoonRoof() + "," + cars[6].HasSunRoof() + "," + "GPS" + "," + "Navigation" + "," + "Fog Lights" + "," + "front mounted fog lights" + "," + "HID" + "," + "high intensity discharge lights\n");
//                    out.print(cars[7].getColor() + "," + cars[7].getYear() + "," + cars[7].getMake() + "," + cars[7].getModel() + "," + cars[7].getPrice() + "," + cars[7].getType() + "," + cars[7].getEngine().getFT() + "," + cars[7].getEngine().getNumberOfCylinders() + "," + cars[7].getEngine().getEngineCapacity() + "," + cars[7].getEngine().getNumberOfHorsePower() + "," + cars[7].getEngine().getEngineMPG() + "," + cars[7].spareTire() + "," + cars[7].FirstAidKit() + "," + cars[7].HasCarpet() + "," + cars[7].HasJack() + "," + cars[7].CarpetColor() + "," + cars[7].InteriorColor1() + "," + cars[7].InteriorColor2() + "," + cars[7].HasMoonRoof() + "," + cars[7].HasSunRoof() + "," + "GPS" + "," + "Navigation" + "," + "Fog Lights" + "," + "front mounted fog lights" + "," + "HID" + "," + "high intensity discharge lights\n");
//                    out.print(cars[8].getColor() + "," + cars[8].getYear() + "," + cars[8].getMake() + "," + cars[8].getModel() + "," + cars[8].getPrice() + "," + cars[8].getType() + "," + cars[8].getEngine().getFT() + "," + cars[8].getEngine().getNumberOfCylinders() + "," + cars[8].getEngine().getEngineCapacity() + "," + cars[8].getEngine().getNumberOfHorsePower() + "," + cars[8].getEngine().getEngineMPG() + "," + cars[8].spareTire() + "," + cars[8].FirstAidKit() + "," + cars[8].HasCarpet() + "," + cars[8].HasJack() + "," + cars[8].CarpetColor() + "," + cars[8].InteriorColor1() + "," + cars[8].InteriorColor2() + "," + cars[8].HasMoonRoof() + "," + cars[8].HasSunRoof() + "," + "GPS" + "," + "Navigation" + "," + "Fog Lights" + "," + "front mounted fog lights" + "," + "HID" + "," + "high intensity discharge lights\n");
//                    out.print(cars[9].getColor() + "," + cars[9].getYear() + "," + cars[9].getMake() + "," + cars[9].getModel() + "," + cars[9].getPrice() + "," + cars[9].getType() + "," + cars[9].getEngine().getFT() + "," + cars[9].getEngine().getNumberOfCylinders() + "," + cars[9].getEngine().getEngineCapacity() + "," + cars[9].getEngine().getNumberOfHorsePower() + "," + cars[9].getEngine().getEngineMPG() + "," + cars[9].spareTire() + "," + cars[9].FirstAidKit() + "," + cars[9].HasCarpet() + "," + cars[9].HasJack() + "," + cars[9].CarpetColor() + "," + cars[9].InteriorColor1() + "," + cars[9].InteriorColor2() + "," + cars[9].HasMoonRoof() + "," + cars[9].HasSunRoof() + "," + "GPS" + "," + "Navigation" + "," + "Fog Lights" + "," + "front mounted fog lights" + "," + "HID" + "," + "high intensity discharge lights\n");
//
//
//                }
//                out.close();
//
////            } else if (carsFile.exists()) {
////                BufferedReader in = null;
////                in = new BufferedReader(new FileReader("carsFile.txt"));
////                String line = in.readLine();
////
////
////            }
                cars = new LinkedList();
                BufferedReader in = new BufferedReader(new FileReader("carsFile.txt"));

                String line = in.readLine();
                
                while (line != null) {
                    String[] parts = line.split(",");

                    Engine engine = new Engine(FuelType.valueOf(parts[6])/*FuelType*/, Integer.parseInt(parts[7])/*noOfCyl*/, Integer.parseInt(parts[8])/*Capacity*/, Integer.parseInt(parts[9])/*hp*/, Float.parseFloat(parts[10])/*mpg*/);

                    Interior interior = new Interior(String.valueOf(parts[16])/*interColor1*/, String.valueOf(parts[17])/*interColor2*/, Boolean.valueOf(parts[18])/*hasSunR*/, Boolean.valueOf(parts[1])/*hasMoonR*/);

                    Trunk trunk = new Trunk(Boolean.valueOf(parts[11])/*hSpare*/, Boolean.valueOf(parts[12])/*hasFAK*/, Boolean.valueOf(parts[13])/*hasCarp*/, Boolean.valueOf(parts[14])/*hasJack*/, String.valueOf(parts[15])/*carpColor*/);

                    Car car = new Car(String.valueOf(parts[2])/*Make*/, Integer.parseInt(parts[1])/*Year*/, String.valueOf(parts[3])/*model*/, Integer.parseInt(parts[4])/*Price*/, String.valueOf(parts[0])/*Color*/, CarType.valueOf(parts[5])/*CarType*/, engine, interior, trunk);

                    car.AddOption(new Option(String.valueOf(parts[20]), String.valueOf(parts[21])));
                    car.AddOption(new Option(String.valueOf(parts[22]), String.valueOf(parts[23])));
                    car.AddOption(new Option(String.valueOf(parts[24]), String.valueOf(parts[25])));
                    
                    switch (parts.length) {
                        case 28:
                            car.AddOption(new Option(String.valueOf(parts[26]), String.valueOf(parts[27])));
                            break;
                        case 30:
                            car.AddOption(new Option(String.valueOf(parts[26]), String.valueOf(parts[27])));
                            car.AddOption(new Option(String.valueOf(parts[28]), String.valueOf(parts[29])));
                            break;
                        case 32:
                            car.AddOption(new Option(String.valueOf(parts[26]), String.valueOf(parts[27])));
                            car.AddOption(new Option(String.valueOf(parts[28]), String.valueOf(parts[29])));
                            car.AddOption(new Option(String.valueOf(parts[30]), String.valueOf(parts[31])));
                            break;
                        case 34:
                            car.AddOption(new Option(String.valueOf(parts[26]), String.valueOf(parts[27])));
                            car.AddOption(new Option(String.valueOf(parts[28]), String.valueOf(parts[29])));
                            car.AddOption(new Option(String.valueOf(parts[30]), String.valueOf(parts[31])));
                            car.AddOption(new Option(String.valueOf(parts[32]), String.valueOf(parts[33])));
                            break;
                        case 36:
                            car.AddOption(new Option(String.valueOf(parts[26]), String.valueOf(parts[27])));
                            car.AddOption(new Option(String.valueOf(parts[28]), String.valueOf(parts[29])));
                            car.AddOption(new Option(String.valueOf(parts[30]), String.valueOf(parts[31])));
                            car.AddOption(new Option(String.valueOf(parts[32]), String.valueOf(parts[33])));
                            car.AddOption(new Option(String.valueOf(parts[34]), String.valueOf(parts[35])));
                            break;
                        case 38:
                            car.AddOption(new Option(String.valueOf(parts[26]), String.valueOf(parts[27])));
                            car.AddOption(new Option(String.valueOf(parts[28]), String.valueOf(parts[29])));
                            car.AddOption(new Option(String.valueOf(parts[30]), String.valueOf(parts[31])));
                            car.AddOption(new Option(String.valueOf(parts[32]), String.valueOf(parts[33])));
                            car.AddOption(new Option(String.valueOf(parts[34]), String.valueOf(parts[35])));
                            car.AddOption(new Option(String.valueOf(parts[36]), String.valueOf(parts[37])));
                            break;
                        case 40:
                            car.AddOption(new Option(String.valueOf(parts[26]), String.valueOf(parts[27])));
                            car.AddOption(new Option(String.valueOf(parts[28]), String.valueOf(parts[29])));
                            car.AddOption(new Option(String.valueOf(parts[30]), String.valueOf(parts[31])));
                            car.AddOption(new Option(String.valueOf(parts[32]), String.valueOf(parts[33])));
                            car.AddOption(new Option(String.valueOf(parts[34]), String.valueOf(parts[35])));
                            car.AddOption(new Option(String.valueOf(parts[36]), String.valueOf(parts[37])));
                            car.AddOption(new Option(String.valueOf(parts[38]), String.valueOf(parts[39])));
                            break;
                        default:
                            break;
                    }
                    
                    
                    line = in.readLine();
                    cars.add(car);

                }
                in.close();

            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

    }

    public String ListAllCars() {

        String result = "";
        for (int i = 0; i < cars.size(); i++) {
            String s = cars.get(i).toString();
            result = result + (i + 1) + "-" + s + "\n";
        }
        return result;
    }

    public String SelectCar(int index) {
        selectedCar = cars.get(index - 1);
        return selectedCar.toString();
    }

    public String OpenTrunk() {
        if (selectedCar != null) {
            return selectedCar.OpenTrunk();
        } else {
            return "Please select a car first to view its trunk";
        }

    }

    public String CheckEngine() {
        if (selectedCar != null) {
            return selectedCar.CheckEngine();
        } else {
            return "Please select a car first to view its engine.";// if(selected car !== null) else return "PLease select a car first" // return
        }
    }

    public String ShowInterior() {
        if (selectedCar != null) {
            return selectedCar.CheckInterior();
        } else {
            return "Please select a car first to view its interior.";
        }
    }

    public String ShowOptions() {
        if (selectedCar != null) {
            return selectedCar.CheckOptions();
        } //return selectedCar.ShowOptions();
        else {
            return "Please select a car first to view its options.";
        }
    }

    public String Compare(int firstCarIndex, int secondCarIndex) {
        Car selectedCar1 = CompareCars(firstCarIndex);
        Car selectedCar2 = CompareCars(secondCarIndex);
        String result = "";
        // Comparing mpg
        if (selectedCar1.getEngine().getEngineMPG() > selectedCar2.getEngine().getEngineMPG()) {
            result += selectedCar1.CompareTo() + " has better MPG " + "\n";
        } else if (selectedCar2.getEngine().getEngineCapacity() > selectedCar1.getEngine().getEngineCapacity()) {
            result += selectedCar2.CompareTo() + " has better MPG";
        } else {
            result += "Both cars have the same MPG\n";
        }

        // Price comparison
        if (selectedCar1.getPrice() > selectedCar2.getPrice()) {
            result += selectedCar2.CompareTo() + " is less expensive\n";
        } else if (selectedCar2.getPrice() > selectedCar1.getPrice()) {
            result += selectedCar1.CompareTo() + " is less expensive\n";
        } else {
            result += "Both cars have the same price.";
        }

        // Comparing Year
        if (selectedCar1.getYear() > selectedCar2.getYear()) {
            result += selectedCar1.CompareTo() + " is newer\n";
        } else if (selectedCar2.getYear() > selectedCar1.getYear()) {
            result += selectedCar2.CompareTo() + " is newer\n";
        } else {
            result += "Both cars are the same year\n";
        }

        //Comparing Fueltype
        if (selectedCar1.getEngine().getFT() == selectedCar2.getEngine().getFT()) {
            result += "Both use Gas\n";
        } else if (selectedCar1.getEngine().getFT() == FuelType.Hybrid) {
            result += selectedCar1.CompareTo() + " is a Hybrid\n";
        } else if (selectedCar2.getEngine().getFT() == FuelType.Hybrid) {
            result += selectedCar2.CompareTo() + " is a Hybrid\n";
        } else if (selectedCar1.getEngine().getFT() == FuelType.Electric) {
            result += selectedCar1.CompareTo() + " is a Hybrid\n";
        } else if (selectedCar2.getEngine().getFT() == FuelType.Electric) {
            result += selectedCar2.CompareTo() + " is Electric\n";
        } else {
            result += "";
        }

        // Comparing horsepower
        if (selectedCar1.getEngine().getNumberOfHorsePower() > selectedCar2.getEngine().getNumberOfHorsePower()) {
            result += selectedCar1.CompareTo() + " has more horsepower\n";
        } else if (selectedCar2.getEngine().getNumberOfHorsePower() > selectedCar1.getEngine().getNumberOfHorsePower()) {
            result += selectedCar2.CompareTo() + " has more horsepower\n";
        } else {
            result += "Both cars have the same horsepower\n";
        }

        // Comparing options
        if (selectedCar1.getOptions() == selectedCar2.getOptions()) {
            result += "Both cars have the same number of options\n";
        } else if (selectedCar1.getOptions() != selectedCar2.getOptions()) {
            result += selectedCar1.CompareTo() + " has " + selectedCar1.getOptions() + " options " + "while " + selectedCar2.CompareTo() + " has " + selectedCar2.getOptions() + " options\n";
        }

        // Comparing Engine cylinders
        if (selectedCar1.getEngine().getNumberOfCylinders() > selectedCar2.getEngine().getNumberOfCylinders()) {
            result += selectedCar1.CompareTo() + " has more cylinders\n";
        } else if (selectedCar2.getEngine().getNumberOfCylinders() > selectedCar1.getEngine().getNumberOfCylinders()) {
            result += selectedCar2.CompareTo() + " has more cylinders\n";
        } else {
            result += "Both cars have the same number of cylinders\n";
        }

        return result;
    }

    public Car CompareCars(int i) {

        Car selectedCar = this.cars.get(i - 1);
        return selectedCar;
    }

}
