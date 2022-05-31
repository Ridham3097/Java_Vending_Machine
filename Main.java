package Assignment;
import java.util.Scanner;

/**
 * this class get users input for vending machine
 * @author  RIDHAM PATEL , 000831171
 */
public class Main{
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * create two object for two vending machine
         */
        VendingMachine b = new VendingMachine();
        VendingMachine c=new VendingMachine();
        /**
         * create scanner object to get users input
         */
        Scanner obj = new Scanner(System.in);
        /**
         * while loop to use
         */
        while (true) {
            /**
             *
             */
            System.out.println("There are two vending machine here");
            b.setMachine1("chocolate",2);       // to input value for machine1 through object
            System.out.println(b.toString1());         // to print machine1 general information
            c.setMachine2("soft drink",3);       // to input value for machine2 through object
            System.out.println(c.toString2());           // to print machine1 general information
            /**
             * get user user input for machine 1 or 2 ,using scanner class
             */
            System.out.println("which machine?");
            int machine = obj.nextInt();

            System.out.println("What would you like to do:\n" +
                    "1. Enter value \n" +
                    "2. change back \n" +
                    "3. vend an item\n" +
                    "4. break the room");
            /**
             * to choose above given features of vending machine
             */
            System.out.println("your choice ");
            int choice = obj.nextInt();

            //to test where enter input is valid or not
            while (choice<=0 || choice >4){
                System.out.println("Enter number between 1 to 4");
                break;
            }
            //to end programme
            if(choice==4){
                System.out.println("Good Bye");
                break;
            }
            /**
             * to choose machine 1 or 2
             */
            if(machine==1){
                /**
                 * to use one of the feature of vending mchine
                 */
                switch (choice) {
                        case 1:
                            b.addMoney(); //to add money in machine1 using objcet
                            break;
                        case 2:
                            b.change();   //to get change back  in machine1 using objcet
                            break;
                        case 3:
                            b.vendItem(); //to vend item from machine1 using objcet
                            break;

                    }
                 System.out.println("welcome to the break room!");

            }else if(machine==2){
                /**
                 *
                 */
                switch (choice) {
                    case 1:
                        c.addMoney(); //to add money in machine2 using objcet
                        break;
                    case 2:
                        c.change(); //to get change back  in machine2 using objcet
                        break;
                    case 3:
                        c.vendItem();  //to vend item from machine2 using objcet
                        break;

                }

                System.out.println("Welcome to the breakroom!");
            }
        }
    }
}