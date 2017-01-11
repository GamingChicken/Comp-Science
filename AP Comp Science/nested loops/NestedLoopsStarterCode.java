/**

 * NestedLoopsStarterCode .

 * 

 * @author (your name) 

 * @version (a version number or a date)

 */

public class NestedLoopsStarterCode

{ 

public static void main(String []args) 

{ 

    System.out.println("\f"); 

    printSquare(4); 

    printSquare(6); 

    

    printColumns(2,3); 

    printColumns(5,2); 

        

    diagonal(5); 

    diagonal(9); 

    

    pointDown(11); 

    pointDown(9); 

    

    pointRight(9); 

    pointRight(5); 
    

}

   

    // 1. Square

    public static void printSquare(int n)

    {

        System.out.println("\nprintSquare");

        for(int i = 1;i<=n;i++)
        {
            for(int r = 1;r<=n;r++)
                System.out.print(r);
            System.out.print("\n");
        }

    }

    

    //2  printColumns

    public static void printColumns(int width, int height)

    {

        System.out.println("\nprintColumns");

        for(int i = 1;i<=height;i++)
        {
            for(int r = 1;r<=width;r++)
                System.out.print("x");
            System.out.print("\n");
        }

    }

     

 

    

     //3. diagonal

     public static void diagonal(int n)

    {

        System.out.println("\ndiagonal");

        for(int i = 1;i<=n;i++)
        {
            for(int r = 0;r<i;r++)
                System.out.print(" ");
            System.out.print(i +"\n");
        }
        
        

    }

    

     //4 a. pointDown

     public static void pointDown(int n)

    {

        System.out.println("\npointDown");
        
        int f = 2;
        for(int i = n;i>0;i--)
        {
            if(i % 2 != 0)
            {
                    for(int r = i;r<=n;r+=2)
                        System.out.print(" ");
            
                    for(int t = 1;t<=i;t++)
                        System.out.print("#");
                    System.out.println(" ");
            }
        }

    }

    

    //4 b. pointRight

     public static void pointRight(int n)

    {

        System.out.println("\npointRight");

        int mid = (n+1)/2;
        int after = mid-1;
        for(int i = 1;i<=mid;i++)
        {
            for(int r = 0;r<i;r++)
                System.out.print("#");
            System.out.println(" ");
        }
        for(int i = after;i<=n;i++)
        {
            for(int r = n;r>=i;r--)
                System.out.print("#");
            System.out.println("");
        }
    }

}