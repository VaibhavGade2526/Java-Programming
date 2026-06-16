// Assignment 17 :Q3
// write a program and to find the maximum of two number

class Logic
{
    void CheckMinimum(int a,int b ,int c)
    {
        if((a<=b) && (a<=c))
        {
            System.out.println("Minimum Number is :"+a);
        }
        else if((b<=a)&&(b<=c))
        {
            System.out.println("Minimum number is :"+b);
        }
        else
        {
            System.out.println("Minimum number is :"+c);
        }
    }
}

class Assignment17_4 
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckMinimum(12,22,33);
    }
    
}
