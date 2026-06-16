// Assignment 20 :-
// write a program to find the smallest digist inn given number


class Logic
{
    void findSmallestdigit(int num)
    {
        int iMin = 9;
        int iDigit = 0 ;

        while(num > 0)
        {
            iDigit = num%10;
        if(iDigit<iMin)
        {
           iMin = iDigit;   
        }
        num = num/10;
    }
     System.out.println(iMin);
    } 
}
class Assignment20_5
{
    public static void main(String A[])
    {
        Logic  lobj = new Logic();
        lobj.findSmallestdigit(12536);
    }
    
        
    
    
}
