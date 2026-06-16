// Assignment 18 :- Q5
// write a program  Check whether a number is positive ,negative or zero

class Logic
{
     void CheckSign(int num)
     {
        if(num>0)
        {
         System.out.println("Number is Positive");
        }
        else if(num<0)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is Zero");
        }

     }
}

class Assignment18_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckSign(0);
    }
    
}
