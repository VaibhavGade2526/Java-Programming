import java.util.Scanner;

class program339 
{
    // postion 23
    public static void main(String[] args) 
    {
        int iNo = 0;
        int  iMask = 0xFFBFFFFF;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iNo = iNo ^ iMask;

        System.out.println("Updated number : "+iNo);
    }
    
}
