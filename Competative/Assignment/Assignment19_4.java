// Assignment 19 :- Q4
//Write program to print each digit of a number seprately

class Logic
{
    void printDigit(int num)
    {
        while(num>0)
        {
        int iDigit = 0;
        iDigit = num%10;
        System.out.println(iDigit);
        num = num/10;
        }
    }
}
class Assignment19_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printDigit(5874);


    }
}