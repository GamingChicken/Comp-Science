/**

 * Write a description of class conditionalStarterCode here.

 * 

 * @author (your name) 

 * @version (a version number or a date)

 */

public class conditionalStarterCode

{

   public static void main(String [] args)

   {
       System.out.println("\f");
      //test one

       numericToLetter(80);

       numericToLetter(72);

       numericToLetter(99);

       numericToLetter(60);

       

       //test two

       letterToNumberic("A");

       letterToNumberic("C+");

       letterToNumberic("F");

   

       //test three

       leapYear(2016 );

       leapYear(2028 );

       leapYear(1999 );

   

       //testh four

       triangle(3,4,5 );

       triangle(3,4,4 );

       triangle(5,5,3 );

       triangle(4,6,4) ;

       triangle(5,5,5 );

     

       //test five

       easter(2017);

       easter(2013);

       easter(2008);

     

       //test six

       payroll( 30, 10.00);

       payroll( 40, 15.50);

       payroll( 45, 20.00);

    

   

       //test seven 

       incomeTax(5000.00);

       incomeTax(12000.00);

       incomeTax(35000.00);

       incomeTax(55500.00);

      

       //test extra credit

       irsTax("S", 20000.00);

       irsTax("S", 30000.00);

       irsTax("S", 60000.00);

       irsTax("M", 30000.00);

       irsTax("M", 50000.00);

       irsTax("M", 100000.00);

    }

    

    

    //1. input a number grade and output a letter grade

    public static void numericToLetter(int grade)

    {

        System.out.println("1)");

        if (grade >= 90)
            System.out.println("A");
        if (grade >= 80 && grade <90)
            System.out.println("B");
        if (grade >= 70 && grade <80)
            System.out.println("C");
        if (grade >= 65 && grade <70)
            System.out.println("D");
        if (grade <65)
            System.out.println("F");
        

    }

   

    //2. input a letter grade and output a numeric grade

    public static void letterToNumberic(String grade)

    {

        System.out.println("2)");

        if (grade.equals("A"))
            System.out.println("4");
        else
            if (grade.equals("B"))
                System.out.println("3");
            else
                if (grade.equals("C"))
                    System.out.println("2");
                else 
                    if (grade.equals("D"))
                        System.out.println("1");
                    else
                        System.out.println("0");

    }

    

    

    //3. Leap year

    public static void leapYear(int year)

    {

        System.out.println("3)");
        if (year % 400 == 0)
            System.out.println("The year is definetly a leap year");
        else
            if (year % 100 == 0)
                System.out.println("The Year is definetly not a leap year");
            else
                if ( year % 4 == 0)
                    System.out.println("The Year is definently a leap year");
                else 
                System.out.println("The year is not a leap year");

    }

    

    //4. Triangle type

    public static void triangle(int one, int two, int three)

    {

        System.out.println("4)");
        if (one==two && one==three && two==three)
        { 
            System.out.println("The Triangle is Equilateral");
        }
        else
        {
            if (one!=two && one!=three && two!=three)
            {
                System.out.println("The Triangle is Scalene");
            }
            else 
            { 
                if (one!=two || one!= three || two!=three)
                {
                    System.out.println("The Triangle is an Isosceles");
                }
                else
                {
                System.out.println("This aint no Triangle");
                }
            }
        }
    }

    

    //5. Easter Sunday

    public static void easter(int year)

    {

        System.out.println("5)");
        int Y = year;
        int A = Y%19;
        int B = Y%4;
        int C = Y%7;
        int D = (19*A+24)%30;
        int E = (2*B+4*C+6*D+5)%7;
        int date = (22+D+E);
        if (date<= 31)
        System.out.println("Easter Sunday for " +year +" is on March " +date);
        else
        System.out.println("Easter Sunday for " +year +" is on April " +(date-31));
        

    }

    

    //6. Payroll

    public static void payroll(double hours, double pay)

    {

        System.out.println("6)"); 
        double moneyAt40 = 40*pay;
        double moneyPay = hours*pay;
        double overTime = (pay*1.5)*(hours-40);
        double gross = moneyAt40+overTime;
        double gross2 = moneyPay;
        double federal = (gross*.20);
        double federal2 = (gross2*.20);
        double state = (gross*.06);
        double state2 = (gross2*.06);
        double roundedState = Math.round((state*100))/100;
        double fica = (gross*.05);
        double fica2 = (gross2*.05);
        double netPay2 = gross2-federal2-state2-fica2;
        double netPay = gross-federal-state-fica;
        if (hours<=40)
        {   
            System.out.println("Regular Pay    $ " +moneyPay);
            System.out.println("Gross Pay      $ " +gross2);
            System.out.println("Federal Tax    $ " +federal2);
            System.out.println("State Tax      $  " +roundedState);
            System.out.println("FICA           $  " +fica2);
            System.out.println("********************");
            System.out.println("Net Pay        $ " +netPay2);
        }
        else
        {
            System.out.println("Regular Pay    $ " +moneyAt40);
            System.out.println("Overtime Pay   $ " +overTime);
            System.out.println("Gross Pay      $ " +gross);
            System.out.println("Federal Tax    $ " +federal);
            System.out.println("State Tax      $  " +state);
            System.out.println("FICA           $  " +fica);
            System.out.println("********************");
            System.out.println("Net Pay        $ " +netPay);
            
        }
        
        
    }

    

    //7. Income Tax

    public static void incomeTax(double salary)

    {

        System.out.println("7)");

        double firstTax = salary*.03;
        double secondTax = 300 + (salary-10000)*.055;
        double thirdTax = 850 + (salary-20000)*.108;
        double fourthTax = 3010+(salary-40000)*.237;
        
        if(salary>= 0 && salary <= 10000)
            System.out.println("Your income tax on " +salary +" is $" +firstTax);
        if(salary>= 10001 && salary<= 20000)
            System.out.println("Your income tax on " +salary +" is $" +secondTax);
        if(salary>= 20001 && salary<= 40000)
            System.out.println("Your income tax on " +salary +" is $" +thirdTax);
        if(salary> 40000)
            System.out.println("Your income tax on " +salary +" is $" +fourthTax);

    }

    

    

    //EXTRA CREDIT  IRS tax problem

    public static void irsTax(String status, double income)

    {

        System.out.println("");

        //your code here

    }

}