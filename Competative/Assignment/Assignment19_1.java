// Assignment 19 :- Q1
// write a program to Check whether a given year is a leap year or not

class Logic
{
     void CheckLeapYear(int num)
     {
        if((num%400==0)||(num%4==0)||(num%100!=100))
        {
            System.err.println("leap year");
        }
        else
        {
            System.out.println("Not Leap year");
        }
     }
}

class Assignment19_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckLeapYear(2022);
        
    }
    
}
