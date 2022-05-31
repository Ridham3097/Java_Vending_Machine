package Assignment;

import java.util.Scanner;

/**
 *this class describes vending machine account
 * @author Ridham Patel , 000831171
 **/

public class VendingMachine {
    private String name;       // to give name of product
    private double price;       // the price of product
    private int quantity=8;         //how many pieces available
    private double credit = 0;      //the users credit
    private double money = 0;        //total money in vending machine since is turn on
    /**
     * create scanner class to get input from users
     */
    Scanner obj = new Scanner(System.in);

    /**
     * to give name and price of vending machine1
     * @param name
     * @param price
     */
    public void setMachine1(String name, double price) {
        this.price = price;
        this.name = name;
    }

    /**
     * to show machine1 general information
     * @return
     */
    public String toString1() {

        return "Vending MAchine contains : " + name + "  " + quantity + "  " + price + "  " + credit + "  " + money;

    }

    /**
     * to give name and price of vending machine2
     * @param name
     * @param price
     */
    public void setMachine2(String name, double price) {
        this.price = price;
        this.name = name;
    }

    /**
     * to show machine1 general information
     * @return
     */
    public String toString2() {
        return "1." + "Vending MAchine contains : " + name + "  " + quantity + "  " + price + "  " + credit + "  " + money;
    }

    /**
     *to add money in vending machin
     */
    public void addMoney() {
        System.out.println("Enter value");
        System.out.println("how many  loonies");
        double loonies = obj.nextDouble(); //get user input using scanner class
        System.out.println("how many  toonies");
        double toonies = obj.nextDouble();  //get user input using scanner class
        System.out.println("how many  quarters");
        double quarters = obj.nextDouble();//get user input using scanner class
        System.out.println("how many  nickels");
        double nickels = obj.nextDouble();//get user input using scanner class
        System.out.println("how many  dimes");
        double dimes = obj.nextDouble();//get user input using scanner class

        // to calculate users input using assign operators
        double add = 1 * (loonies) + 2 * (toonies) + 0.25 * (quarters) + 0.05 * (nickels) + 0.10 * (dimes);

        // to add money in credit
        credit += add;
    }


    /**
     *to get back money from vending machine
     */
    public void change() {
        System.out.println("Enter change back");
        double change = obj.nextDouble(); //get user input using scanner class
        // to check user where users has credit available to get back
        if (change > credit) {
            System.out.println("you dont have enought credit");
        } else {
            credit -= change;  //to cut change back money from user's credit
        }
    }


    /**
     * to get item from vending machine
     */
    public void vendItem() {
        // to check where machine has item to give
        if (quantity <= 0) {
            System.out.println("veld fail ,not enought quantity");
        } else if (credit < price) {    // to chwck where users has money to buy product
            System.out.println("veld fail,not enought credit");
        } else {
            quantity = quantity - 1;  // to decrese no of product from available prodect
            credit -= price;  //to cut money from users credit
            money += price;  // to add money in total amount of vending machine
        }

    }


    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return
     */

    public int getQuantity() {
        return quantity;
    }


    /**
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * @return
     */

    public double getMoney() {
        return money;
    }


    /**
     * @param credit
     */
    public void setCredit(double credit) {
        this.credit = credit;
    }

    /**
     * @return
     */

    public double getCredit() {
        return credit;
    }

}


