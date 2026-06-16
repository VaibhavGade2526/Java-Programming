// Assignment 18 :- Q2
// write a program to find the sum of  even And Odd digits separetlay in  number 

class Logic
{
     void SumOddEven(int num)
     {
        int iDigit = 0;
        int iSumEven = 0;
        int isumOdd = 0;
    
        while(num != 0)
        {
            iDigit = num%10;
           if(num%2 == 0)
           {
            iSumEven = iSumEven+iDigit;
           }
           else
           {
               isumOdd = isumOdd + iDigit;
           }
           num = num/10;
        }

        System.out.println(iSumEven);
        System.out.println(isumOdd);
          
     }
}

class Assignment18_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumOddEven(123456);
        
    }
    
}
