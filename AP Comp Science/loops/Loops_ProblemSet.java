/**

 * Write a description of class loopsProblemSet here.

 * 

 * @author 

 * @version nov 2016

 */

import java.util.Scanner;

public class Loops_ProblemSet

{

    public static void main(String [] args)

    {

            System.out.print('\f');

            int num=0;

          //  MultiplicationTable();

           // Cumulate(2000, 4 , 5);

           // SquaresCubes();

           // Lotto();

        //    CoinToss();
         //   DiceToss();

            //extra credit

            num=6; 

            if (isPerfect(num))

                System.out.println("this number "+num + " is a perfect number");

            else

                System.out.println("this number "+num + " is a not perfect number");
   
            num=24; 

            if (isPerfect(num))

                System.out.println("this number "+num + " is a perfect number");

            else

                System.out.println("this number "+num + " is a not perfect number");

            perfectNum();

    

    }

    public static void MultiplicationTable()

    {       
        Scanner user = new Scanner(System.in);
        int num = 0; 
        System.out.println("Please enter a number");
        num = user.nextInt();
         
        for(int i = 1; i <= 12; i++)
        {
           System.out.println(i +" times " +num +" = " +num*i);
            
        }

    }

    

    public static void Cumulate(int amount, double rate, int years)

    {       
        double y = 0;
        double x = amount;
        for(int i=1;i<=years; i++)
        {
            x = x*(1+rate/100);
            y = (Math.round(x*100))/100;
            System.out.print("For "+i+" years your money has increased from ");
            System.out.println(amount+" to " +y);

        }
    }

    

    public static void SquaresCubes()

        {       
            int y = 0;
            int x = 0;
           
           
            while(x<=20)
            {
                int square = (int)Math.pow(y , 2);
                int cube = (int)Math.pow(y , 3);
                System.out.println(y+"^2 = " +square+"   " +y+"^3 = " +cube);
                
                y++;
                x++;
            }
    }

    

    public static void Lotto()

    {       
        
        for(int i=1; i<=6; i++)
        {
            int y = (int)(Math.random()*59)+1;
            System.out.print(y+"  ");
        }
    }    

    public static void CoinToss()   

    {       
        int heads = 0;
        int tails = 0;
        int x = 1;
        while(x<=1000)
        {
            int y = (int)((Math.random()*2)+1);
            if(y==1)
            heads++;
            else
            tails++;
            x++;
        }
        System.out.println (heads +" heads and "+tails +" tails");

    }

    public static void DiceToss()
    {
        int total7=0;
        int x= 1;
        while(x<=1000)
        {
            int num1 = (int)(Math.random()*6)+1;
            int num2 = (int)(Math.random()*6)+1;
            if(num1+num2==7)
                total7++;
            x++;
        }
        System.out.println("You rolled a seven " +total7 +" times");
    }
        
    
        //extra credit

    public static boolean isPerfect(int n)

    {  

         boolean perfect = false;

        int x = 1;
        int y = 0;
        while(x<n)
        {
                if(n%x==0)
                y=x+y;
            x++;
        }
        if(y==n)
            perfect = true;
        else
            perfect = false;
        

        return perfect;         

        

    }

    

    public static void perfectNum()

    {  
        int r = 1;
        while(r<=10000)
        {
           
            if(isPerfect(r)==true)
                System.out.println(r+" is perfect");
            
            r++;
        }
        

    }
}