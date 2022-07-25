package machine;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CoffeeMachine {
    public static int milkcount;
    public static int watercount;
    public static int beancount;
    public static int coffee;
    public static int water,milk,beans,money,cups;
    public static String code;
    public static String drinks;
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Machine.askUser();
        /*
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

         */





        /*
        System.out.println("Write how many ml of water the coffee machine has: ");
        water = input.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        milk = input.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        beans = input.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        coffee = input.nextInt();
         */


        //System.out.println("For "+coffee+" cups of coffee you will need:");
        //System.out.println(water+" ml of water");
        //System.out.println(milk+" ml of milk");
        //System.out.println(beans+" g of coffee beans");


    }







    public static void coffeeCalculate(int milk,int water,int beans) {
        int first;

        milkcount = coffee * 50;
        watercount = coffee * 200;
        beancount = coffee * 15;
        water = water / 200;
        milk = milk / 50;
        beans = beans / 15;
        int min[] = {water,milk,beans};
        first = min[0];

        for(int i = 0; i< min.length;i++){
            if (first>min[i]){
                first = min[i];
            }
        }
        int additonal = first - coffee;

        /*
        if(first == coffee){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if(first>coffee){
            System.out.println("Yes, I can make that amount of coffee (and even "+additonal + " more than that)");
        }
        else {
            System.out.println("No, I can make only "+ first+" cup(s) of coffee");
        }

         */


    }
}
class Machine{
    public static int milkcount;
    public static int watercount;
    public static int beancount;
    public static int coffee;
    public static int water = 400,milk=540,beans=120,money=550,cups=9;
    public static String code;
    public static String drinks;
    public static Scanner input = new Scanner(System.in);
    public static void askUser(){
        while (true){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String code = input.next();
            if (code.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                drinks=input.next();

                if(drinks.equals("1")  || drinks.equals("2")  || drinks.equals("3")){
                    drinksToBuy();
                }
                else {
                    System.out.println("Wrong input!");
                }




            }
            else if (code.equals("fill")) {
                fillTheMachine();

            }
            else if (code.equals("take")) {
                takeMoney();

            }
            else if(code.equals("remaining")){
                showMaterials();

            }
            else{
                break;
            }
        }
    }
    public static void takeMoney(){
        int purse = 0;
        System.out.println("I gave you  $" + money);
        purse = money + purse;
        money -= money;
    }
    public static void showMaterials(){
        System.out.println(water +" ml fo water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$"+ money +" of money");
    }
    public static void drinksToBuy(){
        if (drinks.equals("1")) {
            if(water<250){
                System.out.println("Sorry, not enough water!");
            }
            else if (beans<16){
                System.out.println("Sorry, not enough coffee bean!");
            }
            else {
                water = water - 250;
                beans = beans - 16;
                money = money + 4;
                cups--;
                System.out.println("I have enough resources, making you a coffee!");
            }
        }
        else if (drinks.equals("2")) {
            if(water < 350){
                System.out.println("Sorry, not enough water!");
            }
            else if(milk<75){
                System.out.println("Sorry, not enough milk!");
            }
            else if(beans<20){
                System.out.println("Sorry, not enough coffee bean!");
            }
            else{
                water = water - 350;
                milk = milk - 75;
                beans = beans - 20;
                money += 7;
                cups--;
                System.out.println("I have enough resources, making you a coffee!");
            }
        } else if (drinks.equals("3")) {
            if(water < 200){
                System.out.println("Sorry, not enough water!");
            }
            else if(milk<100){
                System.out.println("Sorry, not enough milk!");
            }
            else if(beans<12){
                System.out.println("Sorry, not enough coffee bean!");
            }
            else {
                water = water - 200;
                milk = milk - 100;
                beans = beans - 12;
                money += 6;
                cups--;
                System.out.println("I have enough resources, making you a coffee!");
            }
        } else {
            System.out.println("Wrong input");
        }
    }
    public static void fillTheMachine(){
        int milkadd, wateradd, beanadd, cupadd;
        System.out.println("Write how many ml of water you want to add: ");
        wateradd = input.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milkadd = input.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        beanadd = input.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        cupadd = input.nextInt();
        water += wateradd;
        milk += milkadd;
        beans += beanadd;
        cups += cupadd;
    }
}
