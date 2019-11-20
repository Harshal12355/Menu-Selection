package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //GO ONTO THE TRIAL AND ERROR PROGRAM, THIS ONE IS NOT UPDATED

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countHamburger = 0;
        int countHealthyBurger = 0;
        int countDeluxeBurger = 0;

        double totalpriceHam = 0;
        double totalpriceHealthy = 0;
        double totalpriceDeluxe = 0;

        double Hamprice = 0.0;
        double Healthyprice = 0.0;
        double Deluxeprice = 0.0;

        int Hamamount = 0;
        int Healthyamount = 0;
        int Deluxeamount = 0;


        System.out.println("Welcome to Harshals Restaurant");
        boolean bSucessAdd=false;
        MenuItems objitem;
        Hamburger hamburger;
        Healthyburger healthyburger;
        Deluxeburger deluxeburger;

        ArrayList<MenuItems> lstItems = new ArrayList<>();

        char choption='y';

        while (true){

            if(choption =='y' || choption=='Y') {

                System.out.println("Can you please enter the number of the type of burger you would like: 1.Hamburger, 2. Healthy burger 3. Deluxe Burger");
                int  nBurgerType = scanner.nextInt();


                switch (nBurgerType) {
                    case 1:

//                        while (true) {
//                            System.out.println("You get to choose four fillings, which cost 2 each");
//                            System.out.println("Would you like to get a filling for your burger?");
//
//                            if (choption == 'y') {
//                                System.out.println("What filling would you like");
//                                String filling = scanner.next();
//                                scanner.nextLine();
//
//                            } else {
//                                break;
//                            }
//
//                            if(bSucessAdd) {
//                                System.out.println("if you want to add more item please press 'y' if you dont want then press 'n' :");
//                                choption = scanner.next().charAt(0);
//                            }
//
//                        }

                        System.out.println("How many Hamburgers would you like?");
                        int amount = scanner.nextInt();
                        scanner.nextLine();
                        Hamamount = amount;

                        objitem=new MenuItems("Hamburger",10,amount);
                        lstItems.add(objitem);
                        totalpriceHam = objitem.dbBasePrice*Hamamount;
                        countHamburger ++;
                        bSucessAdd=true;
                        System.out.println("Item added");
                        break;
                    case 2:
                        System.out.println("How many Healthy Burgers would you like?");
                        int amount1 = scanner.nextInt();
                        scanner.nextLine();
                        Healthyamount = amount1;

                        objitem=new MenuItems("Healthy Burger",12, amount1);
                        lstItems.add(objitem);
                        totalpriceHealthy = objitem.dbBasePrice*Healthyamount;
                        countHealthyBurger ++;
                        bSucessAdd=true;
                        System.out.println("Item Added");
                        break;
                    case 3:
                        System.out.println("How many Deluxe Burgers would you like?");
                        int amount2 = scanner.nextInt();
                        scanner.nextLine();
                        Deluxeamount = amount2;

                        objitem=new MenuItems("Deluxe Burger",15, amount2);
                        lstItems.add(objitem);
                        totalpriceDeluxe = objitem.dbBasePrice * Deluxeamount;
                        countDeluxeBurger ++;
                        bSucessAdd=true;
                        System.out.println("Item Added");
                        break;
                    default:
                        bSucessAdd=false;
                        System.out.println("Please enter the correct value, please try again");
                        break;
                }

                if(bSucessAdd) {
                    System.out.println("if you want to add more item please press 'y' if you dont want then press 'n' :");
                    System.out.println("if you want to reorder the amount and topping of an option you chosen earlier, please press y " +
                            "\nand select the option to ovveride your order for that option");
                    choption = scanner.next().charAt(0);
                }

            }

            else {

                // System.out.println("Total items count : " + lstItems.size());

                // lstItems.forEach((singleItem)-> System.out.println("You have bought: " + singleItem.strItemName + " and the base price is: "+ singleItem.dbBasePrice));

                System.out.println("You have bought " + Hamamount + " Hamburgers at the price of: " + totalpriceHam  );
                System.out.println("You have bought " + Healthyamount + " Healthy Burgers at the price of " + totalpriceHealthy);
                System.out.println("You have bought " + Deluxeamount + " Deluxe Burgers at the price of " + totalpriceDeluxe);
                double totalprice = totalpriceDeluxe + totalpriceHam + totalpriceHealthy;
                int totalamount = Hamamount + Healthyamount + Deluxeamount;
                System.out.println("The total amount of burgers you have bought is: " + totalamount);
                System.out.println("The total price is: " + totalprice);
                break;
            }

        }


    }
}
