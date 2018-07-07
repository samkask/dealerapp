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
import java.util.Scanner;

public class CISCDApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dealership dealership = new Dealership();
        System.out.println("Welcome to the CIS department’s Car Dealership!");
        System.out.println("To view a list of commands, enter Commands. Commands are case sensitive.");

        boolean exi = true;
        loop:
        while (exi) {
            Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();
            String[] parts = input.split(" ");
            switch (parts[0]) {
                case "Commands":
                    System.out.println("\nCommands are case sensitive!" + "\nCommands: shows a list of all available commands\n"
                            + "List: lists the inventory of cars\n"
                            + "Compare [n1] [n2]: compares two cars\n"
                            + "Select [n]: selects car No. n and shows the details. Type select followed by a space and the car number.\n"
                            + "Engine: shows the details of the engine of the selected car\n"
                            + "Interior: Show the details of the interior of the selected car\n"
                            + "Trunk: Show the items in the trunk of the selected car\n"
                            + "Options: show the details of options installed on the selected car\n"
                            + "Quit: terminate the program" + "\n*Please select a car first to view their details*");
                    break;
                case "List":
                    String list = dealership.ListAllCars();
                    System.out.println(list);
                    break;
                case "Select":
                    int index;
                    try {
                        index = Integer.parseInt(parts[1]);
                        String details = dealership.SelectCar(index);
                        System.out.println("This " + details + " is great! You can view the engine, interior, options, and trunk of the car.");
                    } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                        System.out.println(input + " is an invalid selection. Note that commands are case sensitive.");
                    } catch (IndexOutOfBoundsException a) {
                        System.out.println(input + " is an invalid selection. Note that commands are case sensitive.");
                    }

                    break;
                case "Compare":

                    int index1,
                     index2;
                    try {
                        index1 = Integer.parseInt(parts[1]);
                        index2 = Integer.parseInt(parts[2]);
                        String showComparison = dealership.Compare(index1, index2);
                        System.out.println(showComparison);
                    } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                        System.out.println(input + " is an invalid comparison. Note that commands are case sensitive.");
                    } catch (IndexOutOfBoundsException a) {
                        System.out.println(input + " is an invalid comparison. Note that commands are case sensitive.");
                    }
                    break;
                case "Engine":
                    String engineDetails = dealership.CheckEngine();
                    System.out.println(engineDetails);
                    break;
                case "Interior":
                    System.out.println(dealership.ShowInterior());
                    break;
                case "Trunk":
                    String trunkDetails = dealership.OpenTrunk();
                    System.out.println(trunkDetails);
                    break;
                case "Options":
                    System.out.println(dealership.ShowOptions());
                    break;
                case "Quit":
                    System.out.println("Do you wish to leave the dealership (Y/N)?");
                    Scanner exit = new Scanner(System.in);
                    String select = exit.nextLine();
                    if (select.equalsIgnoreCase("Y")) {
                        System.out.println("Thank you for using the CIS department’s car dealership application!");
                        exi = false;
                    } else if (select.equalsIgnoreCase("N"));
                    System.out.println("\nTo view a list of commands, enter Commands. Commands are case sensitive.");
                    break;
                default:
                    System.out.println(input + " is an invalid command. Note that commands are case sensitive.");
                    continue loop;
            }
        }

    }
}
