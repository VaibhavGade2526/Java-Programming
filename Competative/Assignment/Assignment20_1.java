// Assignment 20 :- Q1
//  write a program to find the sum of all even numbrs up to N


class Logic
{
    void SumEven(int n)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 0;iCnt<=n;iCnt++)
        {
            if(iCnt%2 == 0)
            {
                iSum = iSum+iCnt;
            }
        }

        System.out.println(iSum);
    }
}
class Assignment20_1 
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEven(10);

    }
    
}
