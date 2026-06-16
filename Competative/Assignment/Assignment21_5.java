// Assignment 21 :- Q5
// write a program to print all number from 1 to N that are divisible by both 2 and 3

class Logic
{
    void PrintDivisibleBy2And3(int num)
    {
       int iCnt = 0;

       for(iCnt = 1;iCnt<=num;iCnt++)
       {
        if((iCnt%2==0) && (iCnt%3==0))
        {
              System.out.println(iCnt);
        }     

       }
    }
}
class Assignment21_5
{
    public static void main(String A[])
    {
        Logic  lobj = new Logic();
        lobj.PrintDivisibleBy2And3(12);
    } 
}
