import java.util.Scanner;

class program350
{
    // Postion 3 & 8 

    public static int ToggleBits(int iNo,int iPos1 , int iPos2)
    {
        int iMask1 = 0x1;
        int iMask2 = 0x1;
        int iMask = 0;
        int iResult = 0;

        iMask1 = iMask1 << (iPos1 - 1);
        iMask2 = iMask2 << (iPos2 - 1);

        iMask = iMask1 | iMask2;

        iResult = iNo ^iMask;

        return iResult;
    }
    public static void main(String A [])
    {
      int iValue = 0;
      int iLocation1 = 0;
      int iLocation2 = 0;
      int iRet = 0;

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter number :");
      iValue = sobj.nextInt();

      System.out.println("Enter First Bit Position :");
      iLocation1 = sobj.nextInt();

      System.out.println("Enter Second Postion :");
      iLocation2 = sobj.nextInt();

      iRet = ToggleBits(iValue,iLocation1,iLocation2);

        System.out.printf("Updated Number : %d",iRet);
    }
    
}
