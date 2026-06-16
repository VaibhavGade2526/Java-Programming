// Assignment 21 :- Q1
// write a program to Calculate the product of digits of a numbr

class Logic
{
    void Productofdigit(int num)
    {
        int iAns = 1;
        int iDigit = 0 ;

        while(num > 0)
        {
            iDigit = num%10;
        if(num!=0)
        {
           iAns = iDigit*iAns;   
        }
        num = num/10;
    }
     System.out.println(iAns);
    } 
}
class Assignment21_1
{
    public static void main(String A[])
    {
        Logic  lobj = new Logic();
        lobj.Productofdigit(1234);
    }
    
        
    
    
}
