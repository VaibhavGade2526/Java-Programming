// Assignment 21 :- Q3
// write a program to display all factors of given number

class Logic
{
    void Dsiplayactors(int num)
    {
       int iCnt = 0;

       for(iCnt = 1;iCnt<=num;iCnt++)
       {
        if(num%iCnt==0)
        {
              System.out.println(iCnt);
        }     

       }
    }
}
class Assignment21_3
{
    public static void main(String A[])
    {
        Logic  lobj = new Logic();
        lobj.Dsiplayactors(12);
    } 
}
