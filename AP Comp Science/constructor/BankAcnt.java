
/**
 * Write a description of class BankAccountDriver here.
 * 
 * @author (Jackson Rufo, co-worker Steven Mckay) 
 * @version (1/5/2017)
 */
public class BankAcnt
{
    // instance variables - replace the example below with your own
    private double balance;
    private String name;
   
    public BankAcnt()
    {
        balance=0;
        name="";
    }

 
    public BankAcnt ( double bal, String fullName)
    {
        balance=bal;
        name=fullName;
    }
    
    
    public double getBalance()
    {
        return balance;
    }
    public String getName()
    {
        return name;
    }
    
    
    public void setName(String n)
    {
        name=n;
    }
    
    
    public String toString()
    {
    String str = name+"\tYour balance is "+balance;
    return str;
    }
    
    public void deposit(double dep)
    {
        balance = balance + dep;
        
    }
    
    public void withdraw(double with)
    {
        if(balance>=with)
        {
            balance = balance - with;
        }
    }
    
    public void transfer(BankAcnt to, double howMuch)
    {
        if(balance>=howMuch)
        {
            balance = balance - howMuch;
            to.deposit(howMuch);
        }
    }
}