// Assignmnegt  17 :- Q1
// Write a program to find the sum of digits of a number

class Logic
{
    void SumofDigits(int num)
    {
        int iDigit = 0;
        int iSum = 0;
        
        while(num!=0)
        {
            iDigit = num%10;
            iSum = iSum+iDigit;
            num = num/10;
        }

        System.out.println("Sum of digits is :"+iSum);

    }
}
class Assignment17_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumofDigits(1234);
       
    }
}