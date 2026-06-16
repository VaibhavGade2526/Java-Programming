
// Assignment 20 :- Q2
//  write a program to print number from N down to 1 in inverse order


class Logic
{
    void SumEven(int n)
    {
        int iCnt = 0;

        for(iCnt=n;iCnt>=1;iCnt--)
        {
            {
                  System.out.println(iCnt);      
            }
        }
    }
}
class Assignment20_2 
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEven(10);
    }  
}
