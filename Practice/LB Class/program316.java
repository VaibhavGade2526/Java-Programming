import java.util.Scanner;

class program316
{
    public static void main(String[] Arr) 
    {
        int iNo = 0;
        int iMask = 0x40;
        int iAns = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        iAns = iNo & iMask;

        if(iAns == iMask)
        {
            System.out.println("7th Bit is ON");
        }
        else
        {
            System.out.println("7th Bit is OFF");
        }
    }
}