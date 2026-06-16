// Assignment 18 :- Q2
// write a program to print all Odd number uop to N

class Logic
{
     void PrintEven(int num)
     {
        int iCnt = 0;
       // int iEven = 0;

        for(iCnt = 0;iCnt<=num;iCnt++)
        {
            if(iCnt%2!=0)
            {
              System.out.println(iCnt);
            }
        }
          
     }
}

class Assignment18_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintEven(20);
        
    }
    
}
