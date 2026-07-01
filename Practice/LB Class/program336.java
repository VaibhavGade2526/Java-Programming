import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

class program336 
{
    // postion 4

    public static int OffBit(int iNo , int iPos)
    {
        int iMask = 0xfffffff7;
        int iResult = 0;

        // filter
        if(iPos <1 || iPos > 32)
        {
            System.out.println("Invalid Bit Postion");
            return iNo;
        }

        iMask = iMask << (iPos - 1);

        iResult = iMask ^ iNo;
         return iResult;

    }
    public static void main(String[] A) 
    {
        int iValue  = 0;
        int iLoaction = 0;

        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        System.out.println("Enter the bit Postion :");
        iLoaction = sobj.nextInt();

        iRet = OffBit(iValue,iLoaction);

        System.out.println("Updated Number Is "+iRet);

        
    }
    
}
