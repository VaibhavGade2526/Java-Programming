// Assignment 20 :- Q3
//  write a program to check whether a number is a perfect or not

class Logic
{
    void CheckPerfect(int num)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1;iCnt<num;iCnt++)
        {
            if(num%iCnt == 0)
            {
                iSum = iSum+iCnt;
            }
        }

        if(iSum == num)
        {
            System.out.println("Number is perfect");
        }
        else
        {
            System.out.println("Number is not perfect");
        }

    }
}
class Assignment20_3 
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.CheckPerfect(10);

    }
    
}
