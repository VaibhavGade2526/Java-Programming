// Assignment 20 :-
// write a program to find the largest digist inn given number


class Logic
{
    void findlargestdigit(int num)
    {
        int iMax = 0;
        int iDigit ;

        while(num > 0)
        {
            iDigit = num%10;
        if(iDigit>iMax)
        {
           iMax = iDigit;   
        }
        num = num/10;
    }
     System.out.println(iMax);
    } 
}
class Assignment20_4 
{
    public static void main(String A[])
    {
        Logic  lobj = new Logic();
        lobj.findlargestdigit(12536);
    }
    
        
    
    
}
