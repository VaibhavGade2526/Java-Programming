import java.util.Scanner;

class program334 
{
     public static int ToggleBit(int iNo , int iPos)
    {
        int iMask = 0x1;
        int iResult = 0;

        iMask = iMask << (iPos -1);

        iResult = iNo ^ iMask;

        return iResult;

    }
    public static void main(String[] A) 
    {
        int iValue = 0;
        int  iRet = 0;
        int iLocation = 0;

        Scanner sobj = new Scanner( System.in);

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        System.out.println("Enter the bit Position :");
        iLocation = sobj.nextInt();

        iRet = ToggleBit(iValue,iLocation);

        System.out.println("Upddated Number :"+iRet);



        
    }
    
}
