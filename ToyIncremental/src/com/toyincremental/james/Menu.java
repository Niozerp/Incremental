package com.toyincremental.james;

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Menu
{
    public static int toys;
    public static int toyrate;
    public static int cursors;
    public static Box bo;
    public static ArrayList<Builder> group = WorkerList.getBuilders();
    public static void main(String []args){
        toyrate = 0;
        cursors = 0;
        Box bo = new Box();
        String command = "";
        begin();
        do{
            displayMenu(bo);
            Scanner console = new Scanner(System.in);
            command = console.nextLine();
            if (command.equalsIgnoreCase("toy")){
                bo.subtractToys(-1); //basically adds a toy to the total
            }
            for (Builder j : group){
                if (command.equalsIgnoreCase(j.getSingularName()) || command.equalsIgnoreCase(j.getPluralName())){
                    if (bo.getToys() >= j.getPrice()){
                        bo.subtractToys(j.getPrice());
                        bo.update(j.getRate());
                        j.purchase();
                    }
                }
            }
        }
        while(!command.equalsIgnoreCase("exit"));
        System.out.println("Thanks for Playing!");
    }
    private static void displayMenu(Box bo){
        makeSpace();
        System.out.println("Toys: " + bo.getToys());
        System.out.println("Current toys per second: " + bo.getRate());
        for (Builder j : group){
            System.out.println();
            System.out.print(j.getPluralName() + ": " + j.getNumPurchased() + "  ");
            System.out.println("(costs " + j.getPrice() + " toys, " + j.getRate() + " toys/s)");
        }
    }
    private static void makeSpace(){
        for (int i = 0; i < 20; i++)
            System.out.println();
    }
    private static void begin(){
        System.err.println("Welcome, you are the owner of a factory, type anything to refresh.");
        System.err.println("Type the name of the thing you wish to buy to purchase it.");
        System.err.println("Type Exit to close the program.");
    }
}
