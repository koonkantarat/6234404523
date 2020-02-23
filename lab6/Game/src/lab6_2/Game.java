/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Game {
    int win=0;
    int lose=0;
    public void play(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] data ={"ROCK","PAPER","SCISSORS"}; 
        do{
            System.out.print("Enter 0 for ROCK,1 for PAPER,2 for SCISSORS: ");
            String inputString = sc.nextLine();
            if ("0".equals(inputString)||"1".equals(inputString)||"2".equals(inputString)){
                int inputInt=Integer.parseInt(inputString);
                System.out.println("You enter: "+data[inputInt]);
            }else{
                continue;
            }
            int inputInt=Integer.parseInt(inputString);
            int comp=rand.nextInt(3);
            System.out.println("Computer: "+data[comp]);
            if ((inputInt==0&&comp==2)||(inputInt==1&&comp==0)||(inputInt==2&&comp==1)){
                System.out.println("You win!");
                win=win+1;
            }else if ((inputInt==2&&comp==0)||(inputInt==0&&comp==1)||(inputInt==1&&comp==2)){
                System.out.println("You lose!");
                lose=lose+1;
            }else if (inputInt==comp){
                System.out.println("It's a tie.");
            }
        }while(Math.abs(win-lose)!=2);
        System.out.println("----------------------------------------");
        if (win>lose){
            System.out.println("Congrets! You win.\nUser Score:"+win+"\nComputer Score:"+lose);
        }
        else{
            System.out.println("Too bad! You lose.\nUser Score:"+win+"\nComputer Score:"+lose);
        }
    }
    
}
    
