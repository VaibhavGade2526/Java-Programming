import java.util.Scanner;

class program335 
{
    public static int ToggleBit(int iNo , int iPos)
    {
        int iMask = 0X1;
        int iResult = 0;
        
        // filter 
        if(iPos < 1 || iPos > 32)
        {
            System.out.println("Invalid bit Postion ");
            return iNo;
        }

        iMask = iMask << ( iPos - 1);
        iResult = iNo ^ iMask ;

        return iResult;
    }
    public static void main(String[] A) 
    {
        int iValue = 0;
        int  iLoaction = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        System.out.println("Enter The Bit Postion :");
        iLoaction = sobj.nextInt();

        iRet = ToggleBit(iValue,iLoaction);

        System.out.println("Updated Number is :"+iRet);
        
    }
    
}
