// Assignment 21 :- Q4
// write a program to Count total numbe of factors of a given number


class Logic
{
    void Countfactors(int num)
    {
       int iCnt = 0;
       int iCount = 0;

       for(iCnt = 1;iCnt<=num;iCnt++)
       {
        if(num%iCnt==0)
        {
              iCount++;
        }     
       }
       System.out.println(iCount);
    }
}
class Assignment21_4
{
    public static void main(String A[])
    {
        Logic  lobj = new Logic();
        lobj.Countfactors(12);
    } 
}
