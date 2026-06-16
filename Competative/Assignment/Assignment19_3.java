// Assignment 18 :- Q2
// write a program to print all Odd number uop to N

class Logic
{
     void PrintEven(int num)
     {
        if((num%11==0)&&(num%5==0))
            {
                System.err.println("Number is Divisible of 11 and 5");
            }    
            else
            {
                System.err.println("Number is Not Divisible of 11 and 5");
            }
     }
}

class Assignment19_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintEven(55);
        
    }
    
}
