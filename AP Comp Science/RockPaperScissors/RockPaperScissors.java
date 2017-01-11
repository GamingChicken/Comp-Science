/**

 * Write a description of class RockPaperScissors here.

 * 

 * @author (your name) 

 * @version (a version number or a date)

 */

import java.util.Scanner;

public class RockPaperScissors

{

    public static void main(String [] args)

    {

        System.out.println("\f***ROCK PAPER SCISSORS GAME ***");

        Scanner userinput = new Scanner(System.in);
        int total = 0;
        int wins = 0;
        int loses =0;
        int ties = 0;
        int game = 0;
        int choice = 0;
        int computerChoice = 0;
        int playAgain = 1;
        
        System.out.println("Would you like to play a game? \n \t Yes(1) or No(2)?");
        game = userinput.nextInt();
        if(game == 1)
         {  
             
           
            while(playAgain == 1)
            {
                 System.out.println("Please choose Rock(1), Paper(2), Scissors(3)"); 
                 choice = userinput.nextInt();
                 computerChoice = (int)((Math.random()*3)+1);
                if (choice == 1)
                 {
                    if(computerChoice == 1)
                    {
                        System.out.println("You chose Rock \t The Computer chose rock \n \t You tied");
                        ties++;
                    }
                    if(computerChoice == 2)
                    {
                         System.out.println("You chose Rock \t The Computer chose paper \n \t The Computer Won");
                         loses++;
                    }
                    if(computerChoice == 3)
                    {
                         System.out.println("You chose Rock \t The Computer chose scissors \n \t You Won");
                         wins++;
                    }
                }
                if (choice == 2)
                {
                    if(computerChoice == 1)
                    {
                        System.out.println("You chose paper \t The Computer chose rock \n \t You Won");
                        wins++;
                    }
                    if(computerChoice == 2)
                    {
                        System.out.println("You chose paper \t The Computer chose paper \n \t You tied");
                        ties++;
                    }
                    if(computerChoice == 3)
                    {
                         System.out.println("You chose paper \t The Computer chose Scissors \n \t The Computer Won");
                         loses++;
                    }
                }
                if (choice == 3)
                {
                    if(computerChoice == 1)
                    {
                        System.out.println("You chose scissors \t The Computer chose rock \n \t The Computer Won");
                        loses++;
                    }
                    if(computerChoice == 2)
                    {
                         System.out.println("You chose scissors \t The Computer chose paper \n \t You Won");
                         wins++;
                    }
                    if(computerChoice == 3)
                    {
                         System.out.println("You chose scissors \t The Computer chose scissors \n \t You tied");
                         ties++;
                    }
                }
                System.out.println("Would you like to play again? \n \t Yes(1) or No(0)?");
                playAgain = userinput.nextInt();
            }
            System.out.println("\t You have won "+wins+" times.\n \t You have losed "+loses+" times. \n\t You have tied "+ties+" times.");
            total = wins-loses;
           if(total>=5)
           System.out.println("You did a really good job im proud of you!");
           if(total>0 && total<5)
           System.out.println("You did okay.");
           if(total==0)
           System.out.println("Um no one won....");
           if(total<0 && total>-5)
           System.out.println("Better luck next time scrub.");
           if(total<-5)
           System.out.println("You are such a noob, you suck, never play again!!!! \n\n\n\t\t kys");
           
           

         }
    
        

     
    }
        

 

}