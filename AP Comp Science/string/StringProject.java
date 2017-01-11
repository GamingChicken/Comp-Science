// STRING PROJECT
// NAME:
//
//
import java.util.Scanner;

public class StringProject
{
    public static void main (String [] args)
    {
        System.out.print("\f");
        System.out.println("starting...");
        // invoke the method to test #1
        stringInput();
        
        //invoke the method to test #2
        printFirstLast("W,Jeff");
        printFirstLast("Smith,");
        printFirstLast("Jones");
        printFirstLast(",");
        printFirstLast("Doe,Roxanne");
        printFirstLast(",Susan");

        
        //invoke the method to test #3
       /* String str = "";
        str = numOccurences("house");
        System.out.println("The return string for house is "+str);
        str = numOccurences("science");
        System.out.println("The return string for science is "+str);
        str = numOccurences("mississippi");
        System.out.println("The return string for mississippi is "+str);
        */
    }

    /**
    *   stringInput allows a user to enter words, or "DONE" to stop
    *   The method will keep track of the total words entered, the longest and shortest word entered
    *   @param: input - nothing
    *   @param: return - nothing
    */
    public static void stringInput()
    {   
        Scanner keyboard = new Scanner(System.in);
        String sentinel = "done";
        String userWord = "";        
        System.out.print("Please enter a word or enter DONE to end: ");
        userWord = keyboard.next();
        int i = 0;
        String x = "";
        String y = userWord;
        
        while(!userWord.equalsIgnoreCase(sentinel))
        {
            String r = userWord;
           
            userWord = keyboard.next();
           
            if(!userWord.equalsIgnoreCase(sentinel))
            {
                i++;
                if(userWord.length()>x.length())
                {
                    x=userWord;
                }
                if (userWord.length()<r.length())
                {
                    y=userWord;
                }
            }
        }
        System.out.println("You entered "+i+" words");
        System.out.println("Your shortest word was: "+y);
        System.out.println("Your longest word was: "+x);
        

    } 


    //In writing this methods you may use the indexOf and substring methods in the String class.
    /**
    *   printFirstLast – prints out (to the screen) a name with the first name then the last name
    *   @param: input – String = name as lastname,firstname or any other for
    *   @param:return – nothing
    */
    public static void printFirstLast(String name)
    { 
         int comma = name.indexOf(",");
         int lastLastL = comma;
         int firstFirstL = comma+1;
         int firstLastL = name.length()-1;
         int firstNameCheck = name.length()-2;
         
         
         if (comma!=-1)
         {
             if(comma<firstNameCheck )
             {
                 if(comma!=0)
                 {
                  String lastName = name.substring(0,lastLastL);
                  String firstName = name.substring(firstFirstL,firstLastL);
                  String fullName = firstName+" "+lastName;
                  System.out.println(fullName);   
                 }
                 else
                 {
                     String fullName = name.substring(firstFirstL,firstLastL);
                     System.out.println(fullName);
                 }
             }
             else
             {
                 String fullName = name.substring(0,lastLastL);
                 System.out.println(fullName);
             }
         }

    }

    /**
    *   numOccurences – creates a word with the first occurrence of each letter in the work
    *   @param: input – String = any wor (length >0)
    *   @param:return – String = first occurrence of each letter
    */
    public static String numOccurences( String str)
    {
        String result ="";

        //your code here

        return result;

    }
}

