import java.util.Scanner;

class program315 
{
    public static void main(String[] A) 
    {
        int iNo = 0;
        int iMask = 0X1000;
        int iAns = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iAns = iNo & iMask;

        if(iAns == iMask)
        {
            System.out.println("13 th bit is ON");
        }
        else
        {
            System.out.println("13 th Bit is OFF");
        }
    }
    
}
