// Assignment 21 :- Q2
// write a program to  count even odd numbers are present bewtween 1 and N

class Logic
{
    void CountEvenOddRange(int num)
    {
       int iCnt = 0;
       int iEvenNUmber = 0;
       int iOddNumber = 0;

       for(iCnt = 0;iCnt<=num;iCnt++)
       {
            if (iCnt%2==0)
            {
                iEvenNUmber++;
            }
            else
            {
                iOddNumber++;
            }
        }
        
        System.out.println(iEvenNUmber);
        System.out.println(iOddNumber);

    }
      
}
class Assignment21_2
{
    public static void main(String A[])
    {
        Logic  lobj = new Logic();
        lobj.CountEvenOddRange(12);
    }
    
        
    
    
}
