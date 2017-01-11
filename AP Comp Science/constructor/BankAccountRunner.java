
/**
 * Write a description of class BankAccountRunner here.
 * 
 * @author (Jackson Rufo, co-worker Steven Mckay) 
 * @version (a version number or a date)
 */
public class BankAccountRunner
{
    // instance variables - replace the example below with your own
    

    public static void main(String [] args)
    {
       System.out.println("\f");
    
       BankAcnt test1 = new BankAcnt();
       BankAcnt test2 = new BankAcnt(1300, "test2");
       BankAcnt test3 = new BankAcnt(150, "test3");
    
       System.out.println(test1);                       //testing the main bank account 
       System.out.println(test2);                       //class to show the information
       System.out.println(test3);                       //instead of a file location
       
       System.out.println("");
       
       test1.deposit(10);                               //testing deposit
       test2.deposit(0);
       test3.deposit(5000);
      
       System.out.println(test1);
       System.out.println(test2);
       System.out.println(test3);
       
       System.out.println("");
      
       System.out.println(test1.getBalance());          //testing getBalance
       System.out.println(test2.getBalance());
       System.out.println(test3.getBalance());
       
       System.out.println("");
       
       test1.withdraw(100);                             // testing withdawl with three paramaters
       test2.withdraw(0);                               // one that will take out money, one that will 
       test3.withdraw(150);                             //nothing and one that wont have enough money
       
       System.out.println("");
       
       System.out.println(test1);
       System.out.println(test2);
       System.out.println(test3);
       
       System.out.println("");
      
       test1.transfer(test3,500);                       //testing transfer with one that doesnt have enough
       test2.transfer(test3,200);                       //money and one that has enough
       
       System.out.println("");
       
       System.out.println(test1);
       System.out.println(test2);
       System.out.println(test3);
       
       System.out.println("");
       
       System.out.println(test1.getName());             //testing getName
       System.out.println(test2.getName());
       System.out.println(test3.getName());
       
       System.out.println("");
       
       test1.setName("test1");                          //testing setName
       test2.setName("test2.0");
       test3.setName("test3.0");
       
       System.out.println("");
       
       System.out.println(test1.getName());           
       System.out.println(test2.getName());
       System.out.println(test3.getName());
       
    }

}