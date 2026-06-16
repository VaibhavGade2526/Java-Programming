// Assignment 18 :- Q1
//  write a program to check whethert ais prime or not



class Logic
{
    void CheckPrime(int num)
    {
        int iCnt = 0;
        boolean flag = true;

        if(num<=1)
        {
           flag = false;
        }
        else{

         for(iCnt = 2; iCnt<num;iCnt++)
         {
            if(num%iCnt==0)
            {
                flag = false;
                break;
            }
         }
    }
    
        if(flag== true)
        {
            System.out.println("Number is prime ");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}

class Assignment18_1 
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPrime(73);

    }
    
}
