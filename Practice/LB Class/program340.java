import java.util.Scanner;

class program340 
{
    public static int OffBit(int iNo , int iPos )
    { 
        int iMask = 0X1;
        int iResult = 0;

        if(iPos < 1 || iPos > 32)
        {
            System.out.println("Invalid bit postion ");
            return iNo;
        }

        iMask = iMask << (iPos - 1);

        iMask = ~iMask;
        iResult = iNo & iMask;
        return iResult;

    }
    public static void main(String[] A) 
    {
        int iValue = 0;
        int iRet = 0;
        int  iLocation = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        System.out.println("Enter the bit location :");
        iLocation = sobj.nextInt();

        iRet = OffBit(iValue,iLocation);

        System.out.println("Updated number is : "+iRet);
        
    }
    
}
