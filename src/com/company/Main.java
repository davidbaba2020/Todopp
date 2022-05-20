package com.company;

import java.util.Scanner;

public class Main {
    private static void menu() {
        System.out.println("===========================================================================");
        System.out.println("*************************WELCOME TO YOUR TODO APP*************************");
        System.out.println("===========================================================================");
        System.out.println("TO DO ANY OF THE BELOW ACTIONS FOR YOUR TODO, ENTER THE CORRESPONDING LETTER");
        System.out.println("===========================================================================");
        System.out.println("\n");
        System.out.println("===========================================================================");
        System.out.println( "   C ---- TO CREATE A NEW TASK");
        System.out.println( "   D ---- TO DELETE A  TASK");
        System.out.println( "   F ---- TO FETCH A  TASK");
        System.out.println( "   A ---- TO FETCH ALL TASK");
        System.out.println( "   S ---- TO CHANCE TASK STATUS");
        System.out.println( "   E ---- TO EXIT");
        System.out.println("*******************ENTER YOUR CHOICE OF ACTION*******************");

    }

    private static void miniMenu() {
        System.out.println("*******************ENTER YOUR CHOICE PROCEED*******************");
        System.out.println( "   C ---- TO CREATE A NEW TASK");
        System.out.println( "   D ---- TO DELETE A  TASK");
        System.out.println( "   F ---- TO FETCH A  TASK");
        System.out.println( "   A ---- TO FETCH ALL TASK");
        System.out.println( "   S ---- TO CHANCE TASK STATUS");
        System.out.println( "   E ---- TO EXIT");
        System.out.println("===========================================================================");

    }

    public static void main(String[] args) {
	// write your code here
        char choice = '\0';
        boolean isInt = false;
        Scanner input = new Scanner(System.in);
        TodoImplementation todo = new TodoImplementation();
        menu();
        do {
        choice = input.next().charAt(0);
            System.out.println("\n");

            switch(choice) {
                //CREATE TASK
                case 'C':
                    System.out.println("---------------------------------------------");
                    int id = 0;
                    do{
                        System.out.println("ENTER TASK ID: ");
                        if(input.hasNextInt()) {
                        id = input.nextInt();
                        isInt = true;
                        } else {
                            isInt = false;
                            input.next();
                        }
                    } while(!(isInt));

                    System.out.println("---------------------------------------------");
                    System.out.println("ENTER TASK DESCRIPTION : ");
                    String title = input.next();
                    title += input.nextLine();

                    System.out.println("---------------------------------------------");
                    System.out.println(todo.createTask(id,title));
                    miniMenu();
                    break;


                    //DELETE TASK
                case 'D':
                    System.out.println("---------------------------------------------");
                    do{
                        System.out.println("ENTER THE ID OF TASK TO DELETE");
                        if(input.hasNextInt()) {
                            id = input.nextInt();
                            System.out.println(todo.deleteTask(id));
                            isInt = true;
                        } else {
                            isInt = false;
                            input.next();
                        }
                    } while(!(isInt));
                    System.out.println("---------------------------------------------");
                    break;

                case 'F':
                    System.out.println("---------------------------------------------");
                    do{
                        System.out.println("ENTER THE ID OF TASK TO FIND");
                        if(input.hasNextInt()) {
                            id = input.nextInt();
                            System.out.println(todo.fetchTask(id));
                            isInt = true;
                        } else {
                            isInt = false;
                            input.next();
                        }
                    } while(!(isInt));
                    System.out.println("---------------------------------------------");
                    miniMenu();

                    break;

                case 'A':
                    System.out.println("---------------------------------------------");
                    System.out.println(todo.fetchTasks());
                    System.out.println("---------------------------------------------");
                    miniMenu();
                    break;

                case 'S':
                    System.out.println("---------------------------------------------");
                    System.out.println("S");
                    System.out.println("---------------------------------------------");
                    miniMenu();
                    break;

                case 'E':
                    System.out.println("---------------------------------------------");
                    System.out.println("E");
                    System.out.println("---------------------------------------------");
                    break;
                default :
                    System.out.println("---------------------------------------------");
                    System.out.println("INVALID ENTRY");
                    System.out.println("---------------------------------------------");
                    miniMenu();
                    break;

            }
        } while(choice!='E');
    }


}
