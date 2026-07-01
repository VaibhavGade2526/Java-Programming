import java.util.Scanner;

class program346 
{
    // Postion 21 & 27 
    public static void main(String A [])
    {
        int iMask = 0x04100000;
        int iNo = 0;
        int iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("ENter Number :");
        iNo = sobj.nextInt();

        iResult = iNo ^ iMask;

        System.out.printf("Updated Number : %d",iResult);
    }
    
}
