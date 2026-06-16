// Assignment 17 :Q3
// write a program and to find the maximum of two number

class Logic
{
    void findmax(int a ,int b)
    {
        if(a>b)
        {
            System.out.println("Maximum number is"+a);
        }
        else
        {
            System.out.println("Maximum number is"+b);

        }
    }
}
class Assignment17_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findmax(12, 21);

    }
    
}
