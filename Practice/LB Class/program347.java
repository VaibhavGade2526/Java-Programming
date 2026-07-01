import java.util.Scanner;

class program347 
{
    // Postion 3 & 8 
    public static void main(String A [])
    {
        int iMask = 0x00000084;
        int iNo = 0;
        int iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("ENter Number :");
        iNo = sobj.nextInt();

        iResult = iNo ^ iMask;

        System.out.printf("Updated Number : %d",iResult);
    }
    
}
