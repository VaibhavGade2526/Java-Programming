import java.util.Scanner;

class program313 
{
    public static void main(String A [])
   { 
    int iNo = 0;
    int iMask = 0x00010000;
    int iAns = 0;

    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter Number :");
    iNo = sobj.nextInt();
    
    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        System.out.println("17th bit is ON");
    }
    else
    {
        System.out.println("17th Bit is OFF");
    }

    }    
    
}
