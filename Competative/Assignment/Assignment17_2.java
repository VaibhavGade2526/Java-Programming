// Assignment 17 :- Q2
// Write a program to check whether a number is a palindrome or not


class Logic
{
    void  CheckPalindrome(int num)
    {
        int temp = num;
        int iDigit = 0;
        int rev = 0;

        while(num!=0)
        {
            iDigit = num%10;
            rev = (rev*10)+ iDigit;
            num = num/10;
        }
        if(temp == rev)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }
}
class Assignment17_2 
{
    public static void main(String A[])
    {
     
        Logic lobj = new Logic();

        lobj.CheckPalindrome(121);

    }
    
}
