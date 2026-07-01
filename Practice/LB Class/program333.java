import java.util.Scanner;

class program333 
{
    public static void main(String[] A) 
    {
        int iNo = 0;
        int iMask = 0x01;
        int iPos = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        System.out.println("Enter the bit postion :");
        iPos = sobj.nextInt();

        iMask = iMask << (iPos - 1);

        iNo = iNo ^ iMask;

        System.out.println("Udpated Number is :"+iNo);
        
    }
}
