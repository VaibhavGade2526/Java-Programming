import java.util.Scanner;

class program348 
{
    // Postion 3 & 8 
    public static void main(String A [])
    {
        int iMask1 = 0x00000004;
        int iMask2 = 0x00000080;
        int iMask = 0;

        int iNo = 0;
        int iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("ENter Number :");
        iNo = sobj.nextInt();

        iMask = iMask1 | iMask2;

        iResult = iNo ^ iMask;

        System.out.printf("Updated Number : %d",iResult);
    }
    
}
